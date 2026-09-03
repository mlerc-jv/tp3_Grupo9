package ar.edu.unju.escmi.tp3.ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Producto[] productos = new Producto[3];

		int cantidadProductos = 0;
		int opcion;

		do {
			System.out.println("1 - Crear producto");
			System.out.println("2 - Mostrar productos");
			System.out.println("3 - Modificar precio de producto");
			System.out.println("4 - Mostrar los productos que superen un precio");
			System.out.println("5 - Salir");
			System.out.println("Ingrese una opcion:");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {

			case 1:
				if (cantidadProductos < 3) {

					Producto producto = new Producto();

					System.out.println("Ingrese el codigo:");
					String codigo = sc.nextLine();

					System.out.println("Ingrese la descripcion:");
					String descripcion = sc.nextLine();

					System.out.println("Ingrese el precio:");
					float precio = sc.nextFloat();
					sc.nextLine();

					producto.setCodigo(codigo);
					producto.setDescripcion(descripcion);
					producto.setPrecio(precio);

					productos[cantidadProductos] = producto;
					cantidadProductos++;

					System.out.println("Producto creado correctamente");

				} else {
					System.out.println("No se pueden agregar mas productos");
				}
				break;

			case 2:
				for (int i = 0; i < cantidadProductos; i++) {
					System.out.println(productos[i]);
				}
				break;

			case 3:
				System.out.println("Ingrese el codigo del producto:");
				String codigoBuscar = sc.nextLine();

				boolean encontrado = false;

				for (int i = 0; i < cantidadProductos; i++) {

					if (productos[i].getCodigo().equals(codigoBuscar)) {

						System.out.println("Ingrese el nuevo precio:");
						float nuevoPrecio = sc.nextFloat();
						sc.nextLine();

						productos[i].setPrecio(nuevoPrecio);

						System.out.println("Precio modificado correctamente");

						encontrado = true;
					}
				}

				if (!encontrado) {
					System.out.println("No se encontro el producto");
				}
				break;

			case 4:
				System.out.println("Ingrese el precio:");
				float precioBuscar = sc.nextFloat();
				sc.nextLine();

				boolean productoEncontrado = false;

				for (int i = 0; i < cantidadProductos; i++) {

					if (productos[i].getPrecio() > precioBuscar) {
						System.out.println(productos[i]);
						productoEncontrado = true;
					}
				}

				if (!productoEncontrado) {
					System.out.println("No se encontraron productos que superen ese precio");
				}
				break;

			case 5:
				System.out.println("Fin del programa");
				break;

			default:
				System.out.println("Opcion incorrecta");
			}

		} while (opcion != 5);

		sc.close();

	}

}