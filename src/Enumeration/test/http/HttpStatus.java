package Enumeration.test.http;

import com.sun.net.httpserver.HttpsServer;

public enum HttpStatus {
    ok(200, "ok"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUNT(404, "Not FOUND"),
    INTERMAL_SERVER_ERROR(500, "Internal Server Error");


    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int code) {
        for (HttpStatus status : values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        return null;
    }


    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
