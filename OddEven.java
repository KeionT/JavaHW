import java.util.Scanner;
public class OddEven {
    public static void main(String args[]){
        int num;
        System.out.println("Enter a Number: ");
        //input provided by user is stored in num
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        //If number is divisable by 2 then its a even number
        //Else odd number
        if( num % 2 == 0 )
            System.out.println("Not Cool! Entered number is even");
        else
            System.out.println("Cool! Entered number is odd ");
        if ( num => 2 & =<5 )
            System.out.println("Not Cool! Entered number is even");
        if ( num => 6 & =< 20 )
            System.out.println("Not Cool! Entered number is even");
        if ( num > 20)
            System.out.println("Not Cool! Entered number is even");   
    }
}
