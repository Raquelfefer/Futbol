package equipo.jugadores.centrocampista;

import equipo.jugadores.Jugador;

public abstract class CentroCampista extends Jugador{

	
	private int pasesCompletos;
	
	public CentroCampista(String nombre, int dorsal, String equipo, int pasesCompletos, int posicion) {
		super(nombre, dorsal, equipo, posicion);
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
		return "Centro campista [idJugador=" + getIdJugador() + ", nombre" + getNombre() + ", dorsal=" + getDorsal() + ", equipo" + getEquipo() + ", posición=" + getPosicion() + ", pases completos=" + this.pasesCompletos + "]";
	}
	
	
}
