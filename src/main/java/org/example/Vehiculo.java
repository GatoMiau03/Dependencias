package org.example;
public class Vehiculo {
	private String tipoVehiculo;
	private int tiempoViaje;  // En minutos

	public Vehiculo(String tipoVehiculo, int tiempoViaje) {
		this.tipoVehiculo = tipoVehiculo;
		this.tiempoViaje = tiempoViaje;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public int getTiempoViaje() {
		return tiempoViaje;
	}
}