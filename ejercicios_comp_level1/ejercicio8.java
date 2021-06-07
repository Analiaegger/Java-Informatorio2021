import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre y Apellido: ");
        String nom = scan.nextLine();
        System.out.println("Edad: ");
        String edad = scan.nextLine();
        System.out.println("Dirección: ");
        String dir = scan.nextLine();
        System.out.println("Ciudad: ");
        String ciu = scan.nextLine();

        System.out.println(nom + " - " + edad + " - " + dir + " - " + ciu);

   scan.close();
    }
     
}
