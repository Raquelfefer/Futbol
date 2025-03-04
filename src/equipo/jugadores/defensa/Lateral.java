package equipo.jugadores.defensa;

import equipo.jugadores.Puesto;

public class Lateral extends Defensa{

	private Puesto puesto;

	public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas, String puesto) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		setPuesto(puesto);
	}

	public String getPuesto() {
		return this.puesto.toString().toLowerCase();
	}
	
	public void setPuesto(String puesto) {
		this.puesto = Puesto.valueOf(puesto);
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Defensa [idJugador=" + getIdJugador() + ", nombre" + getNombre() + ", dorsal=" + getDorsal() + ", equipo" + getEquipo() + ", disputas realizadas=" + getDisputasRealizadas() + ", puesto=" + this.puesto + "]";
	}
	
	
	
}
