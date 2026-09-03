package ar.edu.unju.escmi.tp3.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<GatoSimple> gatos = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n--- MENU GATO SIMPLE ---");
            System.out.println("1 - Crear gato simple");
            System.out.println("2 - Dar de comer a un gato simple");
            System.out.println("3 - Mostrar todos los gatos");
            System.out.println("4 - Crear gato contrincante");
            System.out.println("5 - Salir");
            System.out.print("Ingrese una opcion: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("\n--- CREAR GATO ---");

                    System.out.print("Nombre: ");
                    String nombre = teclado.nextLine();

                    System.out.print("Color: ");
                    String color = teclado.nextLine();

                    System.out.print("Peso: ");
                    double peso = teclado.nextDouble();
                    teclado.nextLine();

                    System.out.print("Raza: ");
                    String raza = teclado.nextLine();

                    System.out.print("Edad: ");
                    int edad = teclado.nextInt();
                    teclado.nextLine();

                    System.out.print("Sexo (macho/hembra): ");
                    String sexo = teclado.nextLine();

                    GatoSimple gato = new GatoSimple(
                            color, peso, raza, edad, nombre, sexo
                    );

                    gatos.add(gato);

                    System.out.println("Gato creado correctamente.");
                    break;

                case 2:
                    if (gatos.isEmpty()) {
                        System.out.println("No hay gatos creados.");
                    } else {
                        System.out.print("Ingrese el numero del gato (1-" + gatos.size() + "): ");
                        int numero = teclado.nextInt();
                        teclado.nextLine();

                        if (numero >= 1 && numero <= gatos.size()) {

                            System.out.print("Ingrese la comida: ");
                            String comida = teclado.nextLine();

                            gatos.get(numero - 1).comer(comida);

                        } else {
                            System.out.println("Numero de gato invalido.");
                        }
                    }
                    break;

                case 3:
                    if (gatos.isEmpty()) {
                        System.out.println("No hay gatos creados.");
                    } else {

                        System.out.println("\n--- GATOS CREADOS ---");

                        for (int i = 0; i < gatos.size(); i++) {

                            System.out.println("\nGato " + (i + 1));

                            gatos.get(i).mostrarDatos();

                            gatos.get(i).maullar();
                            gatos.get(i).ronronear();
                        }
                    }
                    break;

                case 4:
                    if (gatos.isEmpty()) {
                        System.out.println("Primero debe crear un gato.");
                    } else {

                        System.out.println("\n--- CREAR CONTRINCANTE ---");

                        System.out.print("Nombre: ");
                        String nombre2 = teclado.nextLine();

                        System.out.print("Color: ");
                        String color2 = teclado.nextLine();

                        System.out.print("Peso: ");
                        double peso2 = teclado.nextDouble();
                        teclado.nextLine();

                        System.out.print("Raza: ");
                        String raza2 = teclado.nextLine();

                        System.out.print("Edad: ");
                        int edad2 = teclado.nextInt();
                        teclado.nextLine();

                        System.out.print("Sexo (macho/hembra): ");
                        String sexo2 = teclado.nextLine();

                        GatoSimple gatoContrincante = new GatoSimple(
                                color2, peso2, raza2, edad2, nombre2, sexo2
                        );

                        System.out.print("Ingrese el numero del gato que va a pelear: ");
                        int numeroGato = teclado.nextInt();
                        teclado.nextLine();

                        if (numeroGato >= 1 && numeroGato <= gatos.size()) {

                            gatos.get(numeroGato - 1).pelear(gatoContrincante);

                        } else {
                            System.out.println("Numero de gato invalido.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 5);

        teclado.close();
    }
}