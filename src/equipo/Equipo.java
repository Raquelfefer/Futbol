package equipo;

import equipo.jugadores.Jugador;
import equipo.jugadores.portero.Portero;

public class Equipo {

	private Jugador equipo[];
	
	public Equipo() {
		this.equipo = new Jugador[11];
	}

	public Jugador[] getEquipo() {
		return this.equipo;
	}

	public void addJugador(int posicion, int  idJugador) {
		switch (posicion) {
		case 0:
			if(Portero.class == Jugador.getJugadorPorId(idJugador).getClass()) {
				this.equipo[0] = Jugador.getJugadorPorId(idJugador);
			}else {
				throw new IllegalArgumentException("Este jugador no es portero.");
			}
		}
		
		for(Jugador j : Jugador.getJugadores()) {
			if(j.getIdJugador() == idJugador) {
				equipo[posicion] = j;
			}
		}
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
