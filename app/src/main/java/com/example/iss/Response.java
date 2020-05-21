package com.example.iss;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response {

    @SerializedName("message")
    private String message;
    @SerializedName("request")
    private Request request;
    @SerializedName("response")
    private List<PassOver> response;

    public Response(String message, Request request, List<PassOver> response) {
        this.message = message;
        this.request = request;
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public List<PassOver> getResponse() {
        return response;
    }

    public void setResponse(List<PassOver> response) {
        this.response = response;
    }
}
