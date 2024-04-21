package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ArrayList<Pais> paises = cargarPaises();
        ArrayList<DestinoTuristico> destinos = new ArrayList<>();

        int opcion;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1 - Alta de destino turístico");
            System.out.println("2 - Mostrar todos los destinos turísticos");
            System.out.println("3 - Modificar el país de un destino turístico");
            System.out.println("4 - Limpiar el ArrayList de destinos turísticos");
            System.out.println("5 - Eliminar un destino turístico");
            System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7 - Mostrar todos los países");
            System.out.println("8 - Mostrar los destinos turísticos de un país");
            System.out.println("9 - Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    altaDestinoTuristico(destinos, paises, scanner);
                    break;
                case 2:
                    mostrarDestinosTuristicos(destinos);
                    break;
                case 3:
                    modificarPaisDestino(destinos, paises, scanner);
                    break;
                case 4:
                    destinos.clear();
                    System.out.println("ArrayList de destinos turísticos limpiado.");
                    break;
                case 5:
                    eliminarDestinoTuristico(destinos, scanner);
                    break;
                case 6:
                    mostrarDestinosOrdenados(destinos);
                    break;
                case 7:
                    mostrarPaises(paises);
                    break;
                case 8:
                    mostrarDestinosPorPais(destinos, scanner);
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 9);
        scanner.close();
    }
   //cargamos paises para poder asociarlo a los destinos turisticos
    private static ArrayList<Pais> cargarPaises() {
        ArrayList<Pais> paises = new ArrayList<>();
        paises.add(new Pais("001", "Argentina"));
        paises.add(new Pais("002", "China"));
        paises.add(new Pais("003", "Estados Unidos"));
        paises.add(new Pais("002", "Rusia"));
        return paises;
    }

    private static void altaDestinoTuristico(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises, Scanner scanner) {
    		//pedimos el ingreso de datos para el destino turistico
    		System.out.println("Ingrese los detalles del destino turistico:");
    	    System.out.print("Codigo: ");
    	    String codigo = scanner.next();
    	    System.out.print("Nombre: ");
    	    String nombre = scanner.next();
    	    System.out.print("Precio: ");
    	    double precio = scanner.nextDouble();

    	    //muestro por consola los paises disponibles para seleccionar
    	    System.out.println("Paises disponibles:");
    	    mostrarPaises(paises);
    	    System.out.print("Ingrese el codigo del pais: ");
    	    String codigoPais = scanner.next();
    	    Pais pais = null;
    	    //buscamos en paises, el pais que se solicita ingresar
    	    for (Pais p : paises) {
    	        if (p.getCodigo().equalsIgnoreCase(codigoPais)) {
    	            pais = p;
    	            break;
    	        }
    	    }
    	    //en caso de no encontrar un pais en el array dejamos un mensaje por consola.
    	    if (pais == null) {
    	        System.out.println("Pais no encontrado.");
    	        return;//uso del return para poder salir del procedimiento y no seguir recorriendo mas.
    	    }

    	    System.out.print("Cantidad de dias: ");
    	    int cantidadDias = scanner.nextInt();

    	    DestinoTuristico nuevoDestino = new DestinoTuristico(codigo, nombre, precio, pais, cantidadDias);
    	    destinos.add(nuevoDestino);
    	    System.out.println("Destino turistico añadido correctamente.");
    }

    private static void mostrarDestinosTuristicos(ArrayList<DestinoTuristico> destinos) {
    	if (destinos.isEmpty()) {
            System.out.println("No hay destinos turisticos disponibles.");
        } else {
            System.out.println("Lista de destinos turisticos:");
            for (DestinoTuristico destino : destinos) {
                System.out.println(destino);
            }
        }
    }

    private static void modificarPaisDestino(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises, Scanner scanner) {
    	System.out.print("Ingrese el codigo del destino turistico que quiere modificar: ");
        String codigoDestino = scanner.next();
        //declaramos la variable destinoModificar para luego buscar en el for si el destino existe o no.
        DestinoTuristico destinoModificar = null;//null para evitar el uso de espacio en memoria
        for (DestinoTuristico destino : destinos) {
            if (destino.getCodigo().equalsIgnoreCase(codigoDestino)) {
                destinoModificar = destino;
                break;
            }
        }

        if (destinoModificar == null) {
            System.out.println("Destino turistico no encontrado.");
            return;
        }

        //mostramos los paises disponibles para seleccionar
        System.out.println("Paises disponibles:");
        mostrarPaises(paises);
        System.out.print("Ingrese el codigo del nuevo pais: ");
        String codigoPais = scanner.next();
        Pais nuevoPais = null;
        for (Pais pais : paises) {
            if (pais.getCodigo().equalsIgnoreCase(codigoPais)) {
                nuevoPais = pais;
                break;
            }
        }

        if (nuevoPais == null) {
            System.out.println("Pais no encontrado.");
        } else {
            destinoModificar.setPais(nuevoPais);
            System.out.println("Pais del destino turistico modificado correctamente.");
        }
    }

    private static void eliminarDestinoTuristico(ArrayList<DestinoTuristico> destinos, Scanner scanner) {
    	 System.out.print("Ingrese el código del destino turístico a eliminar: ");
    	    String codigoDestino = scanner.next();

    	    Iterator<DestinoTuristico> iter = destinos.iterator();
    	    while (iter.hasNext()) {
    	        DestinoTuristico destino = iter.next();
    	        if (destino.getCodigo().equalsIgnoreCase(codigoDestino)) {
    	            iter.remove();
    	            System.out.println("Destino turistico eliminado correctamente.");
    	            return;
    	        }
    	    }

    	    System.out.println("Destino turistico no encontrado.");
    }

    private static void mostrarDestinosOrdenados(ArrayList<DestinoTuristico> destinos) {
    	if (destinos.isEmpty()) {
            System.out.println("No hay destinos turisticos disponibles.");
        } else {
            //ordenamos la lista de destinos por nombre
            Collections.sort(destinos, Comparator.comparing(DestinoTuristico::getNombre));

            System.out.println("Destinos turisticos ordenados por nombre:");
            for (DestinoTuristico destino : destinos) {
                System.out.println(destino);
            }
        }
    }

    private static void mostrarPaises(ArrayList<Pais> paises) {
    	if (paises.isEmpty()) {
            System.out.println("No hay paises disponibles.");
        } else {
        	//mostramos la lista de paises mediante la busqueda con el for.
            System.out.println("Lista de paises:");
            for (Pais pais : paises) {
                System.out.println(pais.getCodigo() + " - " + pais.getNombre());
            }
        }
    }

    private static void mostrarDestinosPorPais(ArrayList<DestinoTuristico> destinos, Scanner scanner) {
    	 System.out.print("Ingrese el código del país para mostrar su destino turisticos: ");
    	    String codigoPais = scanner.next();

    	    System.out.println("Destinos turisticos del pais con cidogo " + codigoPais + ":");

    	    boolean encontrado = false;
    	    for (DestinoTuristico destino : destinos) {
    	        if (destino.getPais().getCodigo().equalsIgnoreCase(codigoPais)) {
    	            System.out.println(destino);
    	            encontrado = true;
    	        }
    	    }

    	    if (!encontrado) {
    	        System.out.println("No se encontraron destinos turisticos para el pais con cidigo " + codigoPais);
    	    }
    }
}