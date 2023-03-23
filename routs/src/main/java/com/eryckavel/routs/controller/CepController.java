package com.eryckavel.routs.controller;

import com.eryckavel.routs.model.cep.Cep;
import com.eryckavel.routs.model.cep.Geo;
import com.eryckavel.routs.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cep")
public class CepController {


    @Autowired
    CepService service;

    @GetMapping("/{cep}")
    public Mono<Cep> buscarEnderecoCep(@PathVariable("cep") String cep){
        return service.buscarCEP(cep);
    }

    @GetMapping("/geo/{cep}")
    public Mono<Geo> buscaLonLatCep(@PathVariable("cep") String cep){
        return service.obterGeoDados(cep);
    }


}
