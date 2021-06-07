import java.util.*;

public class ejercicio6{
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Analia","40448888",20,100);
        Empleado emp2 = new Empleado("Mariel","88404408",30,200);
        Empleado emp3 = new Empleado("Juan","12344321",40,300);

        Set<Empleado> empleados = new HashSet<>(){
            {
                add(emp1);
                add(emp2);
                add(emp3);
            }
        };

        Map<String, Integer> dniSueldo = new HashMap<>();
        for(Empleado emp : empleados){
            dniSueldo.put(emp.dni, emp.sueldo());
        }
        System.out.println("DNI=Sueldo: " + dniSueldo.toString());
    }
    
    public static class Empleado{
        String nombreApellido;
        String dni;
        int horas;
        int valorHora;
        public Empleado(String nom, String dni, int horasT, int valorH){
            this.nombreApellido = nom;
            this.dni = dni;
            this.horas = horasT;
            this.valorHora = valorH;
        }
        public int sueldo(){
            return this.horas * this.valorHora;
        }
    }
}