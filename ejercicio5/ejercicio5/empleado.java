package ejercicio5;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class empleado {

        public String nombre;
        public String apellido;
        public LocalDate fechaNac;
        public BigDecimal sueldo;

        public String getNom() {
            return nombre;
        }

        public void setNom(String nombre) {
            this.nombre = nombre;
        }
        
        public String getApe() {
            return apellido;
        }

        public void setApe(String apellido) {
            this.apellido = apellido;
        }

        public String getFechaNac() {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return formatter.format(this.fechaNac).toString();
        }

        public void setFechaNac(String fechaNac) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(fechaNac, formatter);
            this.fechaNac = localDate;
        }
    
        public BigDecimal getSueldo() {
            return sueldo;
        }

        public void setSueldo(String sueldo) {
            BigDecimal bigDecimalSueldo=new BigDecimal(sueldo);
            this.sueldo = bigDecimalSueldo;
        }
        
    }
