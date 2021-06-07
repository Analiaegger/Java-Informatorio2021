import java.util.Scanner;

public class ejercicio4{

    public static int factorial(int num){

        if (num==1) {
            return 1;
        }
        
        return num*factorial(num-1);
    }
    
    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner scan = new Scanner(System.in);

        Integer num = scan.nextInt();
        System.out.println("El factorial de " + num + " es: " + factorial(num));

        scan.close();
    }

}