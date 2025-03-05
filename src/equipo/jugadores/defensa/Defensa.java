package equipo.jugadores.defensa;

import equipo.jugadores.Jugador;

public abstract class Defensa extends Jugador{

	private int disputasRealizadas;

	public Defensa(String nombre, int dorsal, String equipo, int posicion, int disputasRealizadas) {
		super(nombre, dorsal, equipo, posicion);
		setDisputasRealizadas(disputasRealizadas);
	}
	
	public int getDisputasRealizadas() {
		return this.disputasRealizadas;
	}
	
	public void setDisputasRealizadas(int disputasRealizadas) {
		this.disputasRealizadas = disputasRealizadas;
	}
	
	@Override
	public abstract void mostrarDatos();

	@Override
	public String toString() {
		return "Defensa [idJugador=" + getIdJugador() + ", nombre" + getNombre() + ", dorsal=" + getDorsal() + ", equipo" + getEquipo() + ", posición=" + getPosicion() + ", disputas realizadas=" + this.disputasRealizadas + "]";
	}
	
	
}
