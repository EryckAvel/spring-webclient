package com.eryckavel.routs.service;

import com.eryckavel.routs.dto.GeoDTO;
import com.eryckavel.routs.model.cep.Cep;
import com.eryckavel.routs.model.cep.Geo;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class CepService {

    private final WebClient webClient;

    public CepService(WebClient.Builder builder) {
        webClient = builder.baseUrl("https://www.cepaberto.com/").build();
    }

    public Mono<Cep> buscarCEP(String cep){
        return webClient
                .get()
                .uri("api/v3/cep?cep=" + cep)
                .header("Authorization", "Token token=cee0262548a39dc0ccd0e266ed6bd91a")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError,
                        erro -> Mono.error(new RuntimeException("Verifique se o cep inserido esta correto!")))
                .bodyToMono(Cep.class);
    }

//    public ResponseEntity<GeoDTO> obterGeoDados(String cep){
//        Mono<Cep> endereco = buscarCEP(cep);
//        GeoDTO dto =  new GeoDTO();
//        return ResponseEntity.ok(dto);
//    }

    public Mono<Geo> obterGeoDados(String cep){
        return webClient
                .get()
                .uri("api/v3/cep?cep=" + cep)
                .header("Authorization", "Token token=cee0262548a39dc0ccd0e266ed6bd91a")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError,
                        erro -> Mono.error(new RuntimeException("Verifique se o cep inserido esta correto!")))
                .bodyToMono(Geo.class);
    }

}
