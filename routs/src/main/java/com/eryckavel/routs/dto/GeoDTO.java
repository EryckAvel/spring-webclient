package com.eryckavel.routs.dto;

import com.eryckavel.routs.model.cep.Cep;

public class GeoDTO {

    private String longitude;
    private String latitude;

    public GeoDTO() {
    }

    public GeoDTO(Cep cep) {
        this.longitude = cep.getLongitude();
        this.latitude = cep.getLatitude();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
