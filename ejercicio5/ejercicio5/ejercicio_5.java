package ejercicio5;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ejercicio_5 {
	public static ArrayList<empleado> ListEmpleados(String datos) {
		File f = new File(datos);
		Scanner s;
		ArrayList<empleado> empleados = new ArrayList();
		try {
			s = new Scanner(f);
			while (s.hasNextLine()) {
				String linea = s.nextLine();
				Scanner sl = new Scanner(linea);
				sl.useDelimiter(",");
				empleado emple_aux = new empleado();
				emple_aux.setNom(sl.next());
				emple_aux.setApe(sl.next());
				emple_aux.setFechaNac(sl.next());
				emple_aux.setSueldo(sl.next());
				empleados.add(emple_aux);
				System.out.print(emple_aux.getNom()+" - ");
				System.out.print(emple_aux.getApe()+" - ");
				System.out.print(emple_aux.getFechaNac()+" - ");
				System.out.println(emple_aux.getSueldo());
			}
			s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return empleados;
	}
	public static ArrayList<empleado> ListApe(char letra, ArrayList<empleado> empleados) {
		ArrayList<empleado> empleados_letra = new ArrayList();
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getNom().toCharArray()[0] == letra) {
				empleados_letra.add(empleados.get(i));
				System.out.println((i+1) + "-" + empleados.get(i).getNom());
			}
            
        }
		return empleados_letra;
		}
	public static empleado MasGana(ArrayList<empleado> empleados) {
		empleado empleMasGana = new empleado();
		empleMasGana = empleados.get(0);
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getSueldo().compareTo(empleMasGana.getSueldo()) == 1 ) {
				empleMasGana = empleados.get(i);			
			}
		}
		System.out.println(empleMasGana.getSueldo());
		return empleMasGana;
		
	}
	public static empleado MenosGana(ArrayList<empleado> empleados) {
		empleado empleMenosGana = new empleado();
		empleMenosGana = empleados.get(0);
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getSueldo().compareTo(empleMenosGana.getSueldo()) == -1 ) {
				empleMenosGana = empleados.get(i);			
			}
		}
		System.out.println(empleMenosGana.getSueldo());
		return empleMenosGana;
		
	}
	public static empleado masViejo(ArrayList<empleado> empleados) {
		empleado masViejo = new empleado();
		masViejo = empleados.get(0);
		for (int i = 0; i < empleados.size(); i++) {
			if (masViejo.fechaNac.getYear() > empleados.get(i).fechaNac.getYear()) {
				masViejo = empleados.get(i);
			}
			else if(masViejo.fechaNac.getYear() == empleados.get(i).fechaNac.getYear()){
				if (masViejo.fechaNac.getMonthValue() > empleados.get(i).fechaNac.getMonthValue()) {
					masViejo = empleados.get(i);
				}
				else if(masViejo.fechaNac.getMonthValue() == empleados.get(i).fechaNac.getMonthValue()){
					if (masViejo.fechaNac.getDayOfMonth() > empleados.get(i).fechaNac.getDayOfMonth()) {
						masViejo = empleados.get(i);
					}
				}
			}
		}
		System.out.println(masViejo.getFechaNac());
		return masViejo;
	}
	public static empleado masJoven(ArrayList<empleado> empleados) {
		empleado masJoven = new empleado();
		masJoven = empleados.get(0);
		for (int i = 0; i < empleados.size(); i++) {
			if (masJoven.fechaNac.getYear() < empleados.get(i).fechaNac.getYear()) {
				masJoven = empleados.get(i);
			}
			else if(masJoven.fechaNac.getYear() == empleados.get(i).fechaNac.getYear()){
				if (masJoven.fechaNac.getMonthValue() < empleados.get(i).fechaNac.getMonthValue()) {
					masJoven = empleados.get(i);
				}
				else if(masJoven.fechaNac.getMonthValue() == empleados.get(i).fechaNac.getMonthValue()){
					if (masJoven.fechaNac.getDayOfMonth() < empleados.get(i).fechaNac.getDayOfMonth()) {
						masJoven = empleados.get(i);
					}
				}
			}
		}
		System.out.println(masJoven.getFechaNac());
		return masJoven;
	}
	public static void main(String[] args) {
		ArrayList<empleado> empleados;
		empleados = ListEmpleados("datos_emple.txt");
		ListApe('A', empleados);
		MasGana(empleados);
		MenosGana(empleados);
		masViejo(empleados);
		masJoven(empleados);
	}
}