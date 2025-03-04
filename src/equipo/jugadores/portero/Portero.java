package equipo.jugadores.portero;

import equipo.jugadores.Jugador;

public class Portero extends Jugador{

	private int paradas;

	public Portero(String nombre, int dorsal, String equipo, int posicion, int paradas) {
		super(nombre, dorsal, equipo, posicion);
		setParadas(paradas);
	}
	
	public int getParadas() {
		return this.paradas;
	}
	
	public void setParadas(int paradas) {
		this.paradas = paradas;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Portero [idJugador=" + getIdJugador() + ", nombre" + getNombre() + ", dorsal=" + getDorsal() + ", equipo=" + getEquipo() + ", paradas=" + this.paradas + "]";
	}
	
	
}
