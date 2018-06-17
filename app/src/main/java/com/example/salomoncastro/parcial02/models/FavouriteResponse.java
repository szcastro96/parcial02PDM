package com.example.salomoncastro.parcial02.models;

/**
 * Created by Salomon Castro on 6/17/2018.
 */

public class FavouriteResponse {

    private String success;

    public FavouriteResponse(String success){
        this.success = success;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
