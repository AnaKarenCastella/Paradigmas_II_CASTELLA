//EQUIPO D: Castella Bencomet / Meza Rendon

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CiudadesTemperaturasMain {
    public static void main(String[] args) {
        Map<String, String> ciudadesTemperaturas = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("F:\\weather_stations.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length >= 2) {
                    String ciudad = parts[0].trim();
                    String temperatura = parts[1].trim();
                    ciudadesTemperaturas.put(ciudad, temperatura);
                } else {
                    System.err.println("Error: línea no válida en el archivo CSV: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Mostrar todas las ciudades");
            System.out.println("2. Mostrar temperatura por ciudad");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Listado de todas las ciudades:");
                    for (Map.Entry<String, String> entry : ciudadesTemperaturas.entrySet()) {
                        System.out.println(entry.getKey() + " - Temperatura: " + entry.getValue());
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la ciudad: ");
                    scanner.nextLine(); 
                    String nombreCiudad = scanner.nextLine();
                    String temperatura = ciudadesTemperaturas.get(nombreCiudad);
                    if (temperatura != null) {
                        System.out.println("La temperatura en " + nombreCiudad + " es: " + temperatura);
                    } else {
                        System.out.println("No se encontró información para la ciudad " + nombreCiudad);
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}
