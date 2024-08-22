package com.Makersharks.Assesments.Exeptions;

public class NoDataFoundException extends RuntimeException {

    
    public NoDataFoundException() {
        super("No data found.");
    }

    public NoDataFoundException(String message) {
        super(message);
    }

   
    public NoDataFoundException(String message, Throwable cause) {
        super(message, cause);
    }


    public NoDataFoundException(Throwable cause) {
        super(cause);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
