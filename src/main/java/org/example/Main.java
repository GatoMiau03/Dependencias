package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su destino: ");
        String destino = scanner.nextLine();

        System.out.println("Elija el tipo de vehículo (auto, moto o bicicleta): ");
        String tipoVehiculo = scanner.nextLine();

        Vehiculo vehiculoElegido = null;

        Vehiculo auto = new Vehiculo("auto", 30);
        Vehiculo moto = new Vehiculo("moto", 15);
        Vehiculo bicicleta = new Vehiculo("bicicleta", 60);

        if (tipoVehiculo.equalsIgnoreCase("auto")) {
            vehiculoElegido = auto;
        } else if (tipoVehiculo.equalsIgnoreCase("moto")) {
            vehiculoElegido = moto;
        } else if (tipoVehiculo.equalsIgnoreCase("bicicleta")) {
            vehiculoElegido = bicicleta;
        } else {
            System.out.println("Tipo de vehículo no válido. Se asumirá bicicleta.");
            vehiculoElegido = bicicleta;
        }

        Persona persona = new Persona(nombre, destino, vehiculoElegido);

        int tiempoEnMinutos = persona.calcularTiempo();
        String unidadTiempo = (tiempoEnMinutos > 60) ? "horas" : "minutos";
        int tiempo = (tiempoEnMinutos > 60) ? tiempoEnMinutos / 60 : tiempoEnMinutos;

        System.out.printf("Hola %s, el tiempo de viaje aproximado para llegar a %s en %s es de: %d %s.%n",
                persona.getNombre(), persona.getDestino(), persona.getVehiculo().getTipoVehiculo(), tiempo, unidadTiempo);

        scanner.close();
    }
}