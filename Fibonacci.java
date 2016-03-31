package fibonacci;
import java.util.Scanner;
//INI DIEDIT JADI REVERSE FIBONACCI//
//INI DIEDIT JADI REVERSE FIBONACCI//
//INI DIEDIT JADI REVERSE FIBONACCI//

public class Fibonacci {

    public static void main(String[] args) {
        System.out.print("input: ");
        int number = new Scanner(System.in).nextInt();
 
        System.out.println("\nOutput");

        for(int i=1; i<=number; i++){
            System.out.print(fibRec(i) +" ");
        }
    } 
 
    public static int fibRec(int number){
        if(number == 1 || number == 2){
            return 1;
        }
 
        return fibRec(number-1) + fibRec(number -2);
    }
 
    public static int fibonacciLoop(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
 
        }
        return fibonacci;
    }     

}
//INI DIEDIT JADI REVERSE FIBONACCI//
