package vn.hoangphan.facerecognition.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Hoang Phan on 1/4/2016.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class SuccessResponse {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
