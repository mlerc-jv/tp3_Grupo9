package ar.edu.unju.escmi.tp3.ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		Empleado empleado = null;
		int opcion =0;
		
		while (opcion !=4) {
			System.out.println("1. Crear empleado");
			System.out.println("2. Aumentar salario");
			System.out.println("3. Mostrar los datos del empleado");
			System.out.println("4. Salir");
			
			System.out.println("Ingrese una opcion: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				sc.nextLine();
				
				System.out.println("Ingresar el nombre del empleado: ");
				String nombre =sc.nextLine();
				System.out.println("Ingresar el legajo: ");
				int legajo =sc.nextInt();
				System.out.println("Ingresar el salario: ");
				double salario =sc.nextDouble();
				
				empleado = new Empleado(nombre, legajo, salario);
				break;
			case 2:
				System.out.println("Ingresar el legajo: ");
				int legajoBuscado =sc.nextInt();
				if(empleado != null && empleado.getLegajo() == legajoBuscado) {
					empleado.aumentarSalario();
					System.out.println("Salario aumentado");
				}else {
					System.out.println("No existe este legajo");
				}
				break;
			case 3:
				if (empleado != null) {
			        empleado.mostrarDatos();
			    }else{
			        System.out.println("Aun no hay empleados");
			    }
			    break;
			case 4:
				System.out.println("Programa finalizado");
				break;
			default:
				System.out.println("opcion invalida");
		   }
		}
		sc.close();
	}
}
