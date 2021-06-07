import java.util.ArrayList;
import java.util.List;

public class ejercicio2 {

    public static void main(String[] args) {
        List<Integer> numerosList = new ArrayList<Integer>();

        numerosList.add(3);
        numerosList.add(5);
        numerosList.add(7);

        System.out.println("Lista de numeros: " + numerosList);
        numerosList.add(0,1);
        System.out.println("Agregando un numero al principio: " + numerosList);
        numerosList.add(9);
        System.out.println("Agregando un numero al final: " + numerosList);
        System.out.println("Lista de numeros: " + numerosList);
        

        }
    
    }
