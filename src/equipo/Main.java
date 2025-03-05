package equipo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		menu();

	}
	
	public static void menu() {
		Scanner s = new Scanner(System.in);
		Equipo equipo = new Equipo();
		
		int opcion;
		do {
			System.out.println("----- Menú -----");
			System.out.println("1. Crear jugador \n "
					+ "2. Crear equipo \n"
					+ "3. Añadir jugador a un equipo \n"
					+ "4. Mostrar alineación de un equipo \n"
					+ "5. Mostrar información de jugador \n"
					+ "6. Mostrar información de una alineación \n"
					+ "7. Salir del menú");
			System.out.println("Introduce una opción:");
			opcion = s.nextInt();
			
			switch(opcion) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				default:
					if(opcion != 7) {
						System.out.println("Introduce una opción válida.");
					}else {
						System.out.println("Ha salido del menú.");
					}
					break;
			}
		}while(opcion != 6);
		
	}

}
