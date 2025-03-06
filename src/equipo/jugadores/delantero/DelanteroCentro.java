package equipo.jugadores.delantero;

public class DelanteroCentro extends Delantero{

	private int golesDePenalti;

	public DelanteroCentro(String nombre, int dorsal, String equipo, int posicion, int goles, int golesDePenalti) {
		super(nombre, dorsal, equipo, posicion ,goles);
		setGolesDePenalti(golesDePenalti);
	}

	public int getGolesDePenalti() {
		return this.golesDePenalti;
	}

	public void setGolesDePenalti(int golesDePenalti) {
		this.golesDePenalti = golesDePenalti;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	};

	@Override
	public String toString() {
		return "Delantero Centro [idJugador= " + getIdJugador() + ", nombre " + getNombre() + ", dorsal= " + getDorsal() + ", equipo= " + getEquipo() + ", posición= " + getPosicion() +  ", goles= " + getGoles() + ", goles de penalti= " + this.golesDePenalti + "]";
	}
}
