import java.util.Scanner;

public class ejercicio2 {
    public static int suma(int num1,int num2){
        int suma= num1+num2;
        return suma;
        /*return num1+num2; */
    }
    public static int resta(int num1,int num2){
        int resta= num1-num2;
        return resta;
    }
    public static int mult(int num1,int num2){
        int mult= num1*num2;
        return mult;
    }
    public static int div(int num1,int num2){
        int div= num1/num2;
        return div;
    }  
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros enteros:");
        Scanner scan = new Scanner(System.in);
        
        int num1 = scan.nextInt();
        /*System.out.println("");*/
        int num2 = scan.nextInt();

        scan.close();

        System.out.println("Resultado de la suma: "+ suma(num1, num2));
        System.out.println("Resultado de la resta: "+ resta(num1, num2));
        System.out.println("Resultado de la multiplicación: "+ mult(num1, num2));
        System.out.println("Resultado de la división: "+ div(num1, num2));   
    }
    
}
