package family_tree.exceptions;

public class PersonNotFoundException extends RuntimeException {

    public PersonNotFoundException(String message){
        super(message);
    }
    
}
