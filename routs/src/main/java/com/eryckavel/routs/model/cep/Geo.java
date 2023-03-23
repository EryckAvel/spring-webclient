package com.eryckavel.routs.model.cep;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Geo {

    private String latitude;
    private String longitude;

}
