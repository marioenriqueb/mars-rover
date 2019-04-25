package com.exercise.web.response;

import java.util.Arrays;

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
