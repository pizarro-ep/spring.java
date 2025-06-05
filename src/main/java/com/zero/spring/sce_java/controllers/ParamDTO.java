package com.zero.spring.sce_java.controllers;

public class ParamDTO {
    private String information;

    public ParamDTO(String information) {
        this.information = information;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

}
