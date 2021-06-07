import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ejercicio3 {

    public static void main(String[] args) {
        int [] aux = {2,3,4,5,6,7,8,9,10};
        List<Integer> carList = new ArrayList<>();
        for (int i = 0; i < aux.length; i++) {
            carList.add(aux[i]);
        }
        System.out.println(carList);

        System.out.println(Inv(carList));

        Collections.shuffle(carList);
        System.out.println(carList);
    }

    public static List<Integer> Inv(List<Integer> entrada) {
        int ultimo = entrada.get(entrada.size()-1);
        List<Integer> carInv = new ArrayList<Integer>(ultimo);

        for (int i = entrada.size()-1; i >= 0; i--) {
            carInv.add(entrada.get(i));
            
        }

        return carInv;
    }

}




