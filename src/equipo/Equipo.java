package equipo;

import equipo.jugadores.Jugador;

public class Equipo {

	private Jugador equipo[];
	
	public Equipo() {
		this.equipo = new Jugador[11];
	}

	public Jugador[] getEquipo() {
		return this.equipo;
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
