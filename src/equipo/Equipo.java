package equipo;

import java.util.ArrayList;
import java.util.List;

import equipo.jugadores.Jugador;

public class Equipo {

	private int idEquipo;
	private Jugador equipo[];
	private String nombreEquipo;
	
	private static List<Equipo> equipos= new ArrayList<>();
	private static int UltimoIdEquipo = 1;
	
	public Equipo(String nombreEquipo) {
		setNombreEquipo(nombreEquipo);
		this.equipo = new Jugador[11];
		idEquipo = UltimoIdEquipo++;
		equipos.add(this);
	}
	

	public Jugador[] getEquipo() {
		return this.equipo;
	}
	
	public static Equipo getEquipoPorId(int idEquipo) {
		Equipo devolver = null;
		for(Equipo e  : equipos) {
			if(e.getIdEquipo() == idEquipo) {
				devolver = e;
			}
		}
		if(devolver == null) {
			throw new IllegalArgumentException("Equipo no encontrado.");
		}else {
			return devolver;
		}
	}
	
	public String getNombreEquipo() {
		return this.nombreEquipo;
	}
	
	public int getIdEquipo() {
		return idEquipo;
	}
	
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	
	
	public static List<Equipo> getEquipos() {
		return equipos;
	}

	public void addJugador(int  idJugador) {
		Jugador j = Jugador.getJugadorPorId(idJugador);
		this.equipo[j.getPosicion()] = j;
	}

	public void mostrarAlineacion() {
		int posicion = 0;
		System.out.println("Alineación:");
		for(Jugador j : getEquipo()) {
			if(j == null) {
				throw new IllegalArgumentException("No están cubiertas todas las posiciones.");
			}else {
				System.out.println(posicion++ + " " + j.getNombre() + " " + j.getDorsal());
			}
		}
	}
	
	
}
