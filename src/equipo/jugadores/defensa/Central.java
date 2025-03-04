package equipo.jugadores.defensa;

public class Central extends Defensa{

	private int entradas;

	public Central(String nombre, int dorsal, String equipo, int disputasRealizadas, int entradas) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		setEntradas(entradas);
	}

	public int getEntradas() {
		return this.entradas;
	}

	public void setEntradas(int entradas) {
		this.entradas = entradas;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Central [idJugador=" + getIdJugador() + ", nombre" + getNombre() + ", dorsal=" + getDorsal() + ", equipo" + getEquipo() + ", disputas realizadas=" + getDisputasRealizadas() + ", entradas=" + this.entradas + "]";
	}
	
	
}
