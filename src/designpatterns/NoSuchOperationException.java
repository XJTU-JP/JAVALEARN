package designpatterns;

public class NoSuchOperationException extends RuntimeException{

    public NoSuchOperationException(String msg){
        super(msg);
    }

}
