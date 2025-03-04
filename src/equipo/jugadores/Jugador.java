package equipo.jugadores;

public abstract class Jugador {

	private int idJugador;
	private String nombre;
	private int dorsal;
	private String equipo;
	
	private static int ultimoJugador = 1;
	
	public Jugador(String nombre, int dorsal, String equipo) {
		this.idJugador = ultimoJugador++;
		setNombre(nombre);
		setDorsal(dorsal);
		setEquipo(equipo);
	}
	public int getIdJugador() {
		return this.idJugador;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getDorsal() {
		return this.dorsal;
	}
	
	public String getEquipo() {
		return this.equipo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	public abstract void mostrarDatos();

	
	@Override
	public String toString() {
		return "Jugador [idJugador=" + idJugador + ", nombre=" + nombre + ", dorsal=" + dorsal + ", equipo=" + equipo
				+ "]";
	}
	@Override
	public boolean equals(Object otro) {
		Jugador otroJugador = (Jugador) otro;
		boolean iguales;
		if(this.idJugador == otroJugador.idJugador) {
			iguales = true;
		}else {
			iguales = false;
		}
		return iguales;
	}
}
