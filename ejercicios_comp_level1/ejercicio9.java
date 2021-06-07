import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Frase: ");
        String frase = scan.nextLine();
        
        System.out.println("Letra: ");
        char[] letra = scan.nextLine().toCharArray();
        
        char[] letras = frase.toCharArray();
        Integer contador = 0;

        for (int i = 0; i < letras.length; i++) {
            if (letras[i]== letra[0]) {
                contador ++;
            }
        }
        scan.close();
        System.out.println("Veces que se repite: " + contador);
    }
    
}
