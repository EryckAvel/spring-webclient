package com.eryckavel.routs.model.cep;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Cidade {

    private Integer ddd;
    private String ibge;
    private String nome;

}
