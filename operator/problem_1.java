public class MainClass {

    public  static void main(String [] arg ){

        // integer input
        // double a=-5,b=10;

        // float input
        double a=-5,b=10.5;


        if (a%1 == 0 && b%1 == 0)
        System.out.print("Addition: "+(int)(a+b)+"\nSubtraction:"+(int)(a-b)+
                "\nMultiplication :"+(int)(a*b)+"\nQuotient :"+ (int) (a/b)+
                "\nReminder :"+(int)(a%b));
        else
            System.out.print("Addition: "+(a+b)+"\nSubtraction:"+(a-b)+
                    "\nMultiplication :"+(a*b)+"\nQuotient :"+  (a/b)+
                    "\nReminder :"+(a%b)
            );
    }
}
