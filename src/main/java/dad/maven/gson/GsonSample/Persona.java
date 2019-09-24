package dad.maven.gson.GsonSample;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Persona {
	String nombre;
	String apellidos;
	int edad;

	public static void main(String[] args) {
		Persona p = new Persona();
		Scanner scanner = new Scanner(System.in);
		System.out.println("introduce un nombre: ");
		p.nombre=scanner.nextLine();
		System.out.println("introduce un apellido: ");
		p.apellidos=scanner.nextLine();
		System.out.println("introduce una edad: ");
		p.edad= scanner.nextInt();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);

	}

}
