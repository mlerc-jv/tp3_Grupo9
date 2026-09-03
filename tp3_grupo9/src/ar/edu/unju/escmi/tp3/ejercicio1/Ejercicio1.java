package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		int op = 0;

		while (op != 5) {

			System.out.println("");
			System.out.println("1 - Crear objeto con Constructor por defecto.");
			System.out.println("2 - Crear objeto con Constructor parametrizado.");
			System.out.println("3 - Crear objeto con Constructor (dni, nombre, fecha de nacimiento).");
			System.out.println("4 - Mostrar personas.");
			System.out.println("5 - Salir");
			System.out.println("Ingrese opcion: ");

			op = sc.nextInt();
			sc.nextLine(); //limpio el buffer sino se rompe el nextLine deabajo

			if (op == 1) {
				Persona persona = new Persona();

				System.out.println("Ingrese dni: ");
				persona.setDni(sc.nextLine());

				System.out.println("Ingrese nombre: ");
				persona.setNombre(sc.nextLine());

				System.out.println("Ingrese fecha nacimiento (dd/MM/yyyy): ");
				String fechaTexto = sc.nextLine();
				persona.setFechaNacimiento(LocalDate.parse(fechaTexto, formatoFecha));

				System.out.println("Ingrese domicilio: ");
				persona.setDomicilio(sc.nextLine());

				System.out.println("Ingrese provincia: ");
				persona.setProvincia(sc.nextLine());

				listaPersonas.add(persona);

			} else if (op == 2) {

				System.out.println("Ingrese dni: ");
				String dni = sc.nextLine();
				System.out.println("Ingrese nombre: ");
				String nombre = sc.nextLine();
				System.out.println("Ingrese fecha nacimiento (dd/MM/yyyy): ");
				LocalDate fecha = LocalDate.parse(sc.nextLine(), formatoFecha);
				System.out.println("Ingrese domicilio: ");
				String domicilio = sc.nextLine();
				System.out.println("Ingrese provincia: ");
				String provincia = sc.nextLine();

				Persona persona2 = new Persona(dni, nombre, fecha, domicilio, provincia);
				listaPersonas.add(persona2);

			} else if (op == 3) {

				System.out.println("Ingrese dni: ");
				String dni = sc.nextLine();
				System.out.println("Ingrese nombre: ");
				String nombre = sc.nextLine();
				System.out.println("Ingrese fecha nacimiento (dd/MM/yyyy): ");
				LocalDate fecha = LocalDate.parse(sc.nextLine(), formatoFecha);

				Persona persona3 = new Persona(dni, nombre, fecha);
				listaPersonas.add(persona3);

			} else if (op == 4) {

				for (int i = 0; i < listaPersonas.size(); i++) {
					System.out.println("---------------------------");
					listaPersonas.get(i).mostrarDatos();
				}

			} else if (op == 5) {
				System.out.println("saliendo del programa...");
			} else {
				System.out.println("opcion invalida, intente de nuevo");
			}
		}

		sc.close();
	}
}