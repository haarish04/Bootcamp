public class ExceptionDemo {
    public static void main(String[] args) {
        
        /*int i= 10/0;
        System.out.println(i); 
        ArithmeticException
        */

        try{
            int i=10/0;
            System.out.println(i);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("hi  ");
    }
    
}
