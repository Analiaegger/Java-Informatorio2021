import java.util.ArrayList;

public class ejercicio7 {
    public static void main(String[] args) {
        System.out.println(numeros(1, 10));    
    }
    public static ArrayList<String> numeros(int num1,int num2) {
        ArrayList<String> nums = new ArrayList<String>();
        
        for (int i = num1; i < num2; i++) {
            if (i%2 == 0 && i%3 == 0) {
                nums.add("FizzBuzz");
            }
            else if (i%2 == 0){
                nums.add("Fizz");
            }
            else if (i%3 == 0){
                nums.add("Buzz");
            }
            else nums.add(""+i);
        }
        return nums;
    }
}
