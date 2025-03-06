package equipo.jugadores.centroCampista;

public class Mediapunta extends CentroCampista{
	
	private int asistencias;

	public Mediapunta(String nombre, int dorsal, String equipo, int posicion, int pasesCompletos, int asistencias) {
		super(nombre, dorsal, equipo, posicion, pasesCompletos);
		setAsistencias(asistencias);
	}
	
	public int getAsistencias() {
		return this.asistencias;
	}
	
	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Mediapunta [idJugador= " + getIdJugador() + ", nombre= " + getNombre() + ", dorsal= " + getDorsal() + ", equipo= " + getEquipo() + ", posición= " + getPosicion() + ", pases completos= " + getPasesCompletos() + ", asistencias= " + this.asistencias +  "]";
	}
	
	

}
