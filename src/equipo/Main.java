package equipo;

import java.util.Scanner;

import equipo.jugadores.Jugador;
import equipo.jugadores.centroCampista.Mediapunta;
import equipo.jugadores.centroCampista.Pivote;
import equipo.jugadores.defensa.Central;
import equipo.jugadores.defensa.Lateral;
import equipo.jugadores.delantero.DelanteroCentro;
import equipo.jugadores.delantero.Extremo;
import equipo.jugadores.portero.Portero;

public class Main {

	public static void main(String[] args) {
		
		menu();

	}
	
	public static void menu() {
		Scanner s = new Scanner(System.in);
		
		int opcion;
		do {
			System.out.println("----- Menú -----");
			System.out.println("1. Crear jugador \n"
					+ "2. Crear equipo \n"
					+ "3. Añadir jugador a un equipo \n"
					+ "4. Mostrar alineación de un equipo \n"
					+ "5. Mostrar información de un jugador \n"
					+ "6. Mostrar información de una alineación \n"
					+ "7. Salir del menú");
			System.out.println("Introduce una opción:");
			opcion = s.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.println("¿Qué tipo de jugador quieres crear? \n"
							+ "1. Portero \n"
							+ "2. Lateral \n"
							+ "3. Central \n"
							+ "4. Pivote \n"
							+ "5. Mediapunta \n"
							+ "6. Extremo \n"
							+ "7. Delantero centro \n");
					int opcion1 = s.nextInt();
					System.out.println("--- Nuevo jugador ---");
					switch(opcion1) {
					case 1:
						Portero p = nuevoPortero(s);
	
						break;
					case 2:
						Lateral l = nuevoLateral(s);
						break;
					case 3:
						Central c = nuevoCentral(s);
						break;
					case 4:
						Pivote pi = nuevoPivote(s);
						break;
					case 5:
						Mediapunta m = nuevoMediapunta(s);
						break;
					case 6:
						Extremo e = nuevoExtremo(s);
						break;
					case 7:
						DelanteroCentro d = nuevoDelanteroCentro(s);
						break;
					}
					break;
				case 2:
					Equipo eq1 = nuevoEquipo(s);
					break;
				case 3:
					Equipo eq2 = Equipo.getEquipoPorId(seleccionarEquipo(s));
					eq2.addJugador(seleccionarJugador(s));
					break;
				case 4:
					Equipo eq3 =  Equipo.getEquipoPorId(seleccionarEquipo(s));
					eq3.mostrarAlineacion();
					break;
				case 5:
					Jugador j1 = Jugador.getJugadorPorId(seleccionarJugador(s));
					System.out.println(j1.toString());
					break;
				case 6:
					Equipo eq4 =  Equipo.getEquipoPorId(seleccionarEquipo(s));
					for(Jugador j : eq4.getEquipo()) {
						System.out.println(j.toString());
					}
					break;
				default:
					if(opcion != 7) {
						System.out.println("Introduce una opción válida.");
					}else {
						System.out.println("Has salido del menú.");
					}
					break;
			}
		}while(opcion != 6);
		
	}
	
	public static Portero nuevoPortero(Scanner s) {
		System.out.println("Nombre: ");
		String nombre = s.next();
		System.out.println("Dorsal: ");
		int dorsal = s.nextInt();
		System.out.println("Equipo: ");
		String nombreEquipo = s.next();
		System.out.println("Paradas: ");
		int paradas = s.nextInt();
		return new Portero(nombre, dorsal, nombreEquipo, 0, paradas);	
	}
	
	public static Lateral nuevoLateral(Scanner s) {
		System.out.println("Nombre: ");
		String nombre = s.next();
		System.out.println("Dorsal: ");
		int dorsal = s.nextInt();
		System.out.println("Equipo: ");
		String nombreEquipo = s.next();
		System.out.println("Disputas Realizadas: ");
		int disputas = s.nextInt();
		System.out.println("Puesto (Derecho-Izquierdo): ");
		String puesto = s.next();
		int posicion;
		if(puesto.equals("derecho")) {
			posicion = 4;
		}else {
			posicion = 1;
		}
		return new Lateral(nombre, dorsal, nombreEquipo, posicion, disputas, puesto);	
	}
	
	public static Central nuevoCentral(Scanner s) {
		System.out.println("Nombre: ");
		String nombre = s.next();
		System.out.println("Dorsal: ");
		int dorsal = s.nextInt();
		System.out.println("Equipo: ");
		String nombreEquipo = s.next();
		System.out.println("Disputas Realizadas: ");
		int disputas = s.nextInt();
		System.out.println("¿En que posición jugará el central (2-3)?");
		int posicion = s.nextInt();
		System.out.println("Entradas: ");
		int entradas = s.nextInt();
		return new Central(nombre, dorsal, nombreEquipo, posicion, disputas, entradas);
	}
	
	public static Pivote nuevoPivote(Scanner s) {
		System.out.println("Nombre: ");
		String nombre = s.next();
		System.out.println("Dorsal: ");
		int dorsal = s.nextInt();
		System.out.println("Equipo: ");
		String nombreEquipo = s.next();
		System.out.println("Pases completos: ");
		int pasesCompletos = s.nextInt();
		System.out.println("Intercepciones: ");
		int intercepciones = s.nextInt();
		System.out.println("¿En que posición jugará el central (5-6)?");
		int posicion = s.nextInt();
		return new Pivote(nombre, dorsal, nombreEquipo, posicion, pasesCompletos, intercepciones);
	}
	
	public static Mediapunta nuevoMediapunta(Scanner s) {
		System.out.println("Nombre: ");
		String nombre = s.next();
		System.out.println("Dorsal: ");
		int dorsal = s.nextInt();
		System.out.println("Equipo: ");
		String nombreEquipo = s.next();
		System.out.println("Pases completos: ");
		int pasesCompletos = s.nextInt();
		int posicion = 7;
		System.out.println("Asistencias: ");
		int asistencias = s.nextInt();
		return new Mediapunta(nombre, dorsal, nombreEquipo, posicion, pasesCompletos, asistencias);
	}
	
	public static Extremo nuevoExtremo(Scanner s) {
		System.out.println("Nombre: ");
		String nombre = s.next();
		System.out.println("Dorsal: ");
		int dorsal = s.nextInt();
		System.out.println("Equipo: ");
		String nombreEquipo = s.next();
		System.out.println("Goles: ");
		int goles = s.nextInt();
		System.out.println("Puesto (Derecho-Izquierdo): ");
		String puesto = s.next();
		int posicion;
		if(puesto.equals("derecho")) {
			posicion = 9;
		}else {
			posicion = 8;
		}
		return new Extremo(nombre, dorsal, nombreEquipo, posicion, goles, puesto);
	}
	
	public static DelanteroCentro nuevoDelanteroCentro(Scanner s) {
		System.out.println("Nombre: ");
		String nombre = s.next();
		System.out.println("Dorsal: ");
		int dorsal = s.nextInt();
		System.out.println("Equipo: ");
		String nombreEquipo = s.next();
		System.out.println("Goles: ");
		int goles = s.nextInt();
		int posicion = 10;
		System.out.println("Goles de penalti: ");
		int golesPenalti = s.nextInt();
		return new DelanteroCentro(nombre, dorsal, nombreEquipo, posicion, goles, golesPenalti);
	}


	public static Equipo nuevoEquipo(Scanner s) {
		System.out.println("--- Nuevo equipo ---");
		System.out.println("Nombre: ");
		String nombreEquipo = s.next();
		return new Equipo(nombreEquipo);
	}
	
	public static int seleccionarEquipo(Scanner s) {
		System.out.println("¿Qué equipo quieres seleccionar?");
		for(Equipo e : Equipo.getEquipos()) {
			System.out.println(" - " + e.getIdEquipo() + " " + e.getNombreEquipo());
		}
		int equipoSeleccionado = s.nextInt();
		return equipoSeleccionado;
	}
	

	public static int seleccionarJugador(Scanner s) {
		System.out.println("¿Qué jugador quieres seleccionar?");
		for(Jugador j : Jugador.getJugadores()) {
			System.out.println(j.getIdJugador() + " " + j.getNombre());
		}
		int jugadorSeleccionado = s.nextInt();
		return jugadorSeleccionado;
	}
	
	public static boolean addJugadorEnMenu(Scanner s) {
		System.out.println("¿Quieres añadir el jugador a la alineación de su equipo (true/false)?");
		boolean add = s.nextBoolean();
		
	}
}








