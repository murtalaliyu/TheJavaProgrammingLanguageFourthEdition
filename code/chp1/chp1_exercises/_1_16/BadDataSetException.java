package chp1.chp1_exercises._1_16;

import java.io.IOException;

public class BadDataSetException extends Exception {

    private String setName;
    private IOException ioException;

    public BadDataSetException(String setName, IOException ioException) {
        this.setName = setName;
        this.ioException = ioException;
    }

}
