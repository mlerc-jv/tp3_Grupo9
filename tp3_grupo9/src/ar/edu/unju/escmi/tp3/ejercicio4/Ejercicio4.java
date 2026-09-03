package ar.edu.unju.escmi.tp3.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		Cliente[] clientes = new Cliente[4];
		int cantidadClientes = 0;
		int opcion;
		
		do {
			System.out.println("1 - Crear cliente");
			System.out.println("2 - Mostrar los datos de un cliente");
			System.out.println("3 - Mostrar todos los clientes");
			System.out.println("4 - Mostrar todos los clientes por categoría");
			System.out.println("5 - Salir");
			System.out.println("Ingrese una opción:");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				if (cantidadClientes < 4) {
					System.out.println("Ingrese el DNI:");
					int dni = sc.nextInt();
					sc.nextLine();

					System.out.println("Ingrese el nombre:");
					String nombre = sc.nextLine();

					System.out.println("Ingrese la categoría:");
					char categoria = sc.next().charAt(0);
					sc.nextLine();

					Cliente cliente = new Cliente(dni, nombre, categoria);
					clientes[cantidadClientes] = cliente;
					cantidadClientes++;

					System.out.println("Cliente creado correctamente");
				} else {
					System.out.println("No se pueden agregar más clientes");
				}
				break;

			case 2:
				System.out.println("Ingrese el DNI del cliente:");
				int dniBuscar = sc.nextInt();
				sc.nextLine();

				boolean encontrado = false;

				for (int i = 0; i < cantidadClientes; i++) {
					if (clientes[i].getDni() == dniBuscar) {
						System.out.println(clientes[i]);
						encontrado = true;
					}
				}

				if (!encontrado) {
					System.out.println("No se encontró el dni");
				}
				break;

			case 3:
				for (int i = 0; i < cantidadClientes; i++) {
					System.out.println(clientes[i]);
				}
				break;

			case 4:
				System.out.println("Ingrese la categoría a buscar:");
				char categoriaBuscar = sc.next().charAt(0);
				sc.nextLine();

				boolean categoriaEncontrada = false;

				for (int i = 0; i < cantidadClientes; i++) {
					if (clientes[i].getCategoria() == categoriaBuscar) {
						System.out.println(clientes[i]);
						categoriaEncontrada = true;
					}
				}

				if (!categoriaEncontrada) {
					System.out.println("No se encontraron clientes con esa categoría");
				}
				break;

			case 5:
				System.out.println("Fin del programa");
				break;

			default:
				System.out.println("Opción incorrecta");
			}

		} while (opcion != 5);

		sc.close();

	}

}
