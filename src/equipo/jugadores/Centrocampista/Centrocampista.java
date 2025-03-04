package equipo.jugadores.Centrocampista;

import equipo.jugadores.Jugador;

public abstract class Centrocampista extends Jugador{

	
	private int pasesCompletos;
	
	public Centrocampista(String nombre, int dorsal, String equipo, int pasesCompletos) {
		super(nombre, dorsal, equipo);
		setPasesCompletos(pasesCompletos);
	}
	
	public int getPasesCompletos() {
		return this.pasesCompletos;
	}
	
	public void setPasesCompletos(int pasesCompletos) {
		this.pasesCompletos = pasesCompletos;
	}
	
	@Override
	public abstract void mostrarDatos();

	@Override
	public String toString() {
		return "Centrocampista [idJugador=" + getIdJugador() + ", nombre" + getNombre() + ", dorsal=" + getDorsal() + ", equipo" + getEquipo() + ", pases completos=" + this.pasesCompletos + "]";
	}
	
	
}
