package com.exercise.web.response;

public class RovertResponse {
    private String status;

    public RovertResponse(String[] status) {
        this.status = String.join(",", status);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
