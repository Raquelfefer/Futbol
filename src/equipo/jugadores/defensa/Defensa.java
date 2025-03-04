package equipo.jugadores.defensa;

import equipo.jugadores.Jugador;

public abstract class Defensa extends Jugador{

	private int disputasRealizadas;

	public Defensa(String nombre, int dorsal, String equipo, int disputasRealizadas) {
		super(nombre, dorsal, equipo);
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
		return "Defensa [idJugador=" + getIdJugador() + ", nombre" + getNombre() + ", dorsal=" + getDorsal() + ", equipo" + getEquipo() + ", disputas realizadas=" + this.disputasRealizadas + "]";
	}
	
	
}
