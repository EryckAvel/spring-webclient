package com.eryckavel.routs.model.cep;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Cep {

    private Double altitude;
    private String cep;
    private String latitude;
    private String longitude;
    private String logradouro;
    private String bairro;
    private String complemento;
    private Cidade cidade;
    private Estado estado;

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
}
