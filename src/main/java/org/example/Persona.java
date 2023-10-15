package org.example;
public class Persona {
	private String nombre;
	private String destino;
	private Vehiculo vehiculo;

	public Persona(String nombre, String destino, Vehiculo vehiculo) {
		this.nombre = nombre;
		this.destino = destino;
		this.vehiculo = vehiculo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDestino() {
		return this.destino;
	}

	public Vehiculo getVehiculo() {
		return this.vehiculo;
	}

	public int calcularTiempo() {
		// Utiliza el tiempo de viaje del vehículo elegido para calcular el tiempo de viaje.
		return this.vehiculo.getTiempoViaje();
	}
}