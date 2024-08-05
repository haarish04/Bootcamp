class customException extends Exception{
    public customException(String message){
        super(message);
    }
}

public class MyException {
    public static void main(String[] args) {
        int age =10;
        try{
            if(age<18)
                throw new customException("Not eligible to vote");
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}
