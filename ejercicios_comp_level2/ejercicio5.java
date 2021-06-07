import java.util.ArrayList;
import java.util.List;

public class ejercicio5 {
    public static void main(String[] args) {
        int [] aux1 = {5,6,8,9,10};
        int [] aux2 = {100,200,300,400,500};
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> valorPorHoras = new ArrayList<>();
        List<Integer> sueldoTotal = new ArrayList<>();
        for (int i = 0; i < aux1.length; i++) {
            horasTrabajadas.add(aux1[i]);
            valorPorHoras.add(aux2[i]);
            sueldoTotal.add(aux1[i]*aux2[i]);
        }
        int total=0;
        for (int i = 0; i<sueldoTotal.size(); i++){
            total+=sueldoTotal.get(i);
        }
        System.out.println(sueldoTotal);
        System.out.println("Sueldo total: $" + total);

    }
}
