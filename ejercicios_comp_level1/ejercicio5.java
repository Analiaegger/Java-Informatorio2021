import java.util.Scanner;

public class ejercicio5 {
    public static int multi(int num1, int num2){

        if (num2==1) {
            return num1;
        }
        
        return num1+multi(num1,num2-1);
    }
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros: ");
        Scanner scan = new Scanner(System.in);

        Integer num1 = scan.nextInt();
        Integer num2 = scan.nextInt();
        System.out.println(multi(num1, num2));

        scan.close();
    }
}
/* 2*3 = 2+2+2 o 3+3 */