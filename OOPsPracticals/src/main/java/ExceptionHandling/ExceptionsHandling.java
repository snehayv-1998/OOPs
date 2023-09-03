package ExceptionHandling;

public class ExceptionsHandling {
    public static void main(String[] args) {
        try{
            int a =1;
            int b= 0;
            int res = divide(a, b);
            System.out.println("Result is : "+res);
        }catch (Exception e){
            System.out.println("Exception occurred and exception is : "+e.getMessage());
        }finally {
            System.out.println("Inside finally block");
        }
    }

    private static int divide(int a, int b) throws CustomException {
       if(b ==0 )
           throw new CustomException("Divide by zero error!!");
       return a/b;
    }

}
