package equipo.jugadores.centrocampista;

public class Pivote extends CentroCampista{

	private int intercepciones;

	public Pivote(String nombre, int dorsal, String equipo, int posicion, int pasesCompletos, int intercepciones) {
		super(nombre, dorsal, equipo, posicion, pasesCompletos);
		setIntercepciones(intercepciones);
	}
	
	public int getIntercepciones() {
		return this.intercepciones;
	}
	
	public void setIntercepciones(int intercepciones) {
		this.intercepciones = intercepciones;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Mediapunta [idJugador=" + getIdJugador() + ", nombre" + getNombre() + ", dorsal=" + getDorsal() + ", equipo=" + getEquipo() + ", posición=" + getPosicion() + ", pases completos=" + getPasesCompletos() + ", intercepciones=" + this.intercepciones +  "]";
	}
	
	
}
