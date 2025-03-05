package equipo.jugadores;

import java.util.ArrayList;
import java.util.List;

public abstract class Jugador {

	private int idJugador;
	private String nombre;
	private int dorsal;
	private String equipo;
	private int posicion;
	private static List<Jugador> jugadores = new ArrayList<>();
	
	private static int ultimoJugador = 1;
	
	public Jugador(String nombre, int dorsal, String equipo, int posicion) {
		this.idJugador = ultimoJugador++;
		setNombre(nombre);
		setDorsal(dorsal);
		setEquipo(equipo);
		setPosicion(posicion);
		jugadores.add(this);
	}
	
	
	public static List<Jugador> getJugadores() {
		return jugadores;
	}

	public static Jugador getJugadorPorId(int id) {
		Jugador devolver = null;
		for(Jugador j : jugadores) {
			if(j.getIdJugador() == id) {
				devolver = j;
			}		
		}
		if(devolver == null) {
			throw new IllegalArgumentException("Jugador no encontrado.");
		}else {
			return devolver;
		}
	}
	
	public int getIdJugador() {
		return this.idJugador;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getDorsal() {
		return this.dorsal;
	}
	
	public String getEquipo() {
		return this.equipo;
	}
	
	public int getPosicion() {
		return this.posicion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	public abstract void mostrarDatos();

	
	@Override
	public String toString() {
		return "Jugador [idJugador=" + this.idJugador + ", nombre=" + this.nombre + ", dorsal=" + this.dorsal + ", equipo=" + this.equipo
				+ ", posición=" + this.posicion + "]";
	}
	@Override
	public boolean equals(Object otro) {
		Jugador otroJugador = (Jugador) otro;
		boolean iguales;
		if(this.idJugador == otroJugador.idJugador) {
			iguales = true;
		}else {
			iguales = false;
		}
		return iguales;
	}
}
