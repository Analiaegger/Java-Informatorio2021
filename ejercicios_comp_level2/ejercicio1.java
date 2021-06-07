import java.util.ArrayList;
import java.util.List;

public class ejercicio1 {

    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<String>();

        ciudades.add("Resistencia");
        ciudades.add("Cordoba");
        ciudades.add("Mendoza");

        System.out.println("Ciudades favoritas de Argentina: ");

        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println("#" + (i+1) + "-" + ciudades.get(i));
        }
        
    }
}