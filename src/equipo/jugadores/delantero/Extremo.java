package equipo.jugadores.delantero;

import equipo.jugadores.Puesto;

public class Extremo extends Delantero{

	private Puesto puesto;

	public Extremo(String nombre, int dorsal, String equipo, int goles, String puesto) {
		super(nombre, dorsal, equipo, goles);
		setPuesto(puesto);
	}

	public String getPuesto() {
		return puesto.toString().toLowerCase();
	}

	public void setPuesto(String puesto) {
		this.puesto = Puesto.valueOf(puesto);
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	};

	@Override
	public String toString() {
		return "Extremo [idJugador=" + getIdJugador() + ", nombre" + getNombre() + ", dorsal=" + getDorsal() + ", equipo" + getEquipo() + ", goles=" + getGoles() + ", puesto=" + this.puesto + "]";
	}
		
	
}
