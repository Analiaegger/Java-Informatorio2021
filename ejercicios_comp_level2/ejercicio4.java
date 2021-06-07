import java.util.ArrayList;
import java.util.List;

public class ejercicio4 {
    
    public static void main(String[] args) {
        String [] aux = {"Analia","Marta","Maria","Brenda","Josefina","Laura","Martin",
        "Marcos","Santiago","Jose","Mauro","Lucas"};

        ArrayList<String> alumnos = new ArrayList<String>();

        for (int i = 0; i < aux.length; i++) {
            alumnos.add(aux[i]);
        }

        System.out.println("Alumnos: " + alumnos);

        List<String> curso1 = alumnos.subList(0,4);
        System.out.println("Curso 1: " + curso1);
        List<String> curso2 = alumnos.subList(4,8);
        System.out.println("Curso 2: " + curso2);
        List<String> curso3 = alumnos.subList(8,12);
        System.out.println("Curso 3: " + curso3);
    }
}
