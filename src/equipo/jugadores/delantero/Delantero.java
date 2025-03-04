package equipo.jugadores.delantero;

import equipo.jugadores.Jugador;

public abstract class Delantero extends Jugador{

	private int goles;

	public Delantero(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo);
		setGoles(goles);
	}

	public int getGoles() {
		return this.goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	@Override
	public abstract void mostrarDatos();

	@Override
	public String toString() {
		return "Delantero [idJugador=" + getIdJugador() + ", nombre" + getNombre() + ", dorsal=" + getDorsal() + ", equipo" + getEquipo() + ", goles=" + this.goles + "]";
	}
	

}
