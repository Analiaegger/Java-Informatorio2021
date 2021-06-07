import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba una palabra: ");
        String palabra = scan.nextLine();
        char[] letras = palabra.toCharArray();
        for (int i = 0; i < letras.length; i++){
            if (letras[i] >= 'a' && letras[i] <= 'z') {
                letras[i] = (char)(letras[i] - (int) 'a' + (int) 'A');
            }
            System.out.print(letras[i]);
        }
        System.out.println();
        scan.close();
    }
}
