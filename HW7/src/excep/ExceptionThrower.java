package excep;

import java.io.IOException;

public class ExceptionThrower {
    public void bombing() throws Exception{
        Exception e = new Exception();
        throw e;
    }

    public void ioBombing() throws IOException {
        IOException e = new IOException();
        throw e;
    }

    public void normal(){}

    public void bombRunner(){
        RuntimeException r = new RuntimeException();
        throw r;
    }
}
