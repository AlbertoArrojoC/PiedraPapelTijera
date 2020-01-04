package PiedraPapelTijera;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera
{

	public static void main(String[] args) throws InterruptedException
	{
		String jugador1, jugador2, j1opcion, j2opcion, opcion, opcCPULiteral = "", opcJug1Literal = "",
				opcJug2Literal = "";
		int opcMenu;
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();

		System.out.println("***MENÚ***");
		System.out.println("Elige una opción del menú (1 o 2)");
		System.out.println("1. Jugar a '(P)iedra, (PA)pel, (T)ijera'");
		System.out.println("2. Salir");
		opcMenu = teclado.nextInt();
		switch (opcMenu)
		{
		case 1:

			System.out.println("Comienza el juego.");
			System.out.println("¿Quieres jugar con un amig@ (Pulsa 1), o contra la CPU? (Pulsa 2)");
			opcMenu = teclado.nextInt();

			if (opcMenu == 1)
			{
				System.out.println("Jugador 1, dime tu nombre:");
				jugador1 = teclado.next();
				System.out.println("Jugador 2, dime tu nombre:");
				jugador2 = teclado.next();
				System.out.println("\n¡Bienvenidos al juego de 'piedra, papel, tijera'!");
				do
				{
					System.out.println(
							"\n" + jugador1 + ", es tu turno. Tú eliges... ¿Piedra (P), PApel (PA) o Tijera (T)?");
					j1opcion = teclado.next();
					j1opcion = j1opcion.toLowerCase();

					do
					{
						if (!j1opcion.contentEquals("p") && !j1opcion.contentEquals("pa")
								&& !j1opcion.contentEquals("t"))
						{
							System.out.println("No has elegido una opción correcta.");
							System.out.println(
									jugador1 + ", es tu turno. Tú eliges... ¿Piedra (P), PApel (PA) o Tijera (T)?");
							j1opcion = teclado.next();
							j1opcion = j1opcion.toLowerCase();
						}

					} while (!j1opcion.contentEquals("p") && !j1opcion.contentEquals("pa")
							&& !j1opcion.contentEquals("t"));

					switch (j1opcion)
					{
					case "p":
						opcJug1Literal = "piedra";
						break;
					case "pa":
						opcJug1Literal = "papel";
						break;
					case "t":
						opcJug1Literal = "tijera";
						break;
					}

					for (int i = 0; i < 50; ++i)
						System.out.println();
					System.out.println("¡No mires lo que ha elegido " + jugador1 + "!");

					System.out.println(jugador2 + ", es tu turno. Tú eliges... ¿Piedra (P), Papel (PA) o Tijera (T)?");
					j2opcion = teclado.next();
					j2opcion = j2opcion.toLowerCase();

					do
					{
						if (!j2opcion.contentEquals("p") && !j2opcion.contentEquals("pa")
								&& !j2opcion.contentEquals("t"))
						{
							System.out.println("No has elegido una opción correcta.");
							System.out.println(
									jugador2 + ", es tu turno. Tú eliges... ¿Piedra (P), PApel (PA) o Tijera (T)?");
							j2opcion = teclado.next();
							j2opcion = j2opcion.toLowerCase();
						}

					} while (!j2opcion.contentEquals("p") && !j2opcion.contentEquals("pa")
							&& !j2opcion.contentEquals("t"));

					switch (j2opcion)
					{
					case "p":
						opcJug2Literal = "piedra";
						break;
					case "pa":
						opcJug2Literal = "papel";
						break;
					case "t":
						opcJug2Literal = "tijera";
						break;
					}
					System.out.println(jugador1 + " ha elegido " + opcJug1Literal + " y " + jugador2 + " ha elegido "
							+ opcJug2Literal);

					// Base del juego
					if (j1opcion.equals(j2opcion))
					{ // Empate
						System.out.println("Oh... habéis quedado empate.");

					} else
					{ // Bloque jugador 1
						if (opcJug1Literal.equals("piedra") && opcJug2Literal.equals("tijera")
								|| opcJug1Literal.equals("papel") && opcJug2Literal.equals("piedra")
								|| opcJug1Literal.equals("tijera") && opcJug2Literal.equals("papel"))
						{
							System.out.println("¡Esta ronda la ha ganado " + jugador1 + "!");
						} else
						{ // Bloque jugador 2
							System.out.println("¡Esta ronda la ha ganado " + jugador2 + "!");
						}
					}
					//
					System.out.println("¿Queréis jugar otra ronda? (S/N)");
					opcion = teclado.next();
					if (opcion.equals("N") || opcion.equals("n"))
					{
						System.out.println("El juego ha terminado. ¡Gracias por jugar! :)");
						System.exit(0);
					}
				} while (opcion.equals("S") || opcion.equals("s"));
				break;
			}

			if (opcMenu == 2)
			{

				System.out.println("¿Cuál es tu nombre?");
				jugador1 = teclado.next();

				System.out.println("\n¡Bienvenido al juego de 'piedra, papel, tijera'!");
				do
				{
					System.out.println(
							"\n" + jugador1 + ", es tu turno. Tú eliges... ¿Piedra (P), PApel (PA) o Tijera (T)?");
					j1opcion = teclado.next();
					j1opcion = j1opcion.toLowerCase();
					do
					{
						if (!j1opcion.contentEquals("p") && !j1opcion.contentEquals("pa")
								&& !j1opcion.contentEquals("t"))
						{
							System.out.println("No has elegido una opción correcta.");
							System.out.println(
									jugador1 + ", es tu turno. Tú eliges... ¿Piedra (P), PApel (PA) o Tijera (T)?");
							j1opcion = teclado.next();
							j1opcion = j1opcion.toLowerCase();
						}

					} while (!j1opcion.contentEquals("p") && !j1opcion.contentEquals("pa")
							&& !j1opcion.contentEquals("t"));
					System.out.println("La CPU está eligiendo su jugada");
					for (int i = 0; i < 3; i++)
					{
						System.out.print(".");
						Thread.sleep(1000);
					}
					System.out.println("\n");

					// Base del juego
					int opcCPU;
					opcCPU = aleatorio.nextInt(3);

					switch (opcCPU + 1)
					{
					case 1:
						opcCPULiteral = "piedra";
						break;
					case 2:
						opcCPULiteral = "papel";
						break;
					case 3:
						opcCPULiteral = "tijera";
						break;
					}

					switch (j1opcion)
					{
					case "p":
						opcJug1Literal = "piedra";
						break;
					case "pa":
						opcJug1Literal = "papel";
						break;
					case "t":
						opcJug1Literal = "tijera";
						break;

					}

					System.out.println("Has elegido " + opcJug1Literal + " y la CPU ha elegido " + opcCPULiteral);

					// Base del juego
					if (opcJug1Literal.equals(opcCPULiteral))
					{
						System.out.println("Oh... habéis quedado empate.");

					} else
					{
						if (opcJug1Literal.equals("piedra") && opcCPULiteral.equals("tijera")
								|| opcJug1Literal.equals("papel") && opcCPULiteral.equals("piedra")
								|| opcJug1Literal.equals("tijera") && opcCPULiteral.equals("papel"))
						{
							System.out.println("¡Has ganado!");
						} else
						{
							System.out.println("¡Vaya! Te ha ganado tu propio ordenador...");
						}
					}

					System.out.println("¿Quieres jugar otra ronda? (S/N)");
					opcion = teclado.next();
					switch (opcion)
					{
					case "N":
						System.out.println("El juego ha terminado. ¡Gracias por jugar! :)");
						break;
					case "n":
						System.out.println("El juego ha terminado. ¡Gracias por jugar! :)");
						break;

					default:
						System.out.println("No has elegido una opción correcta. El juego ha terminado.");
						break;
					}

				} while (opcion.equals("S") || opcion.equals("s"));
				break;
			}

		case 2: // Salir del menú
			if (opcMenu != 2)
			{
				System.out.println("No has elegido una opción correcta. Vuelve a iniciar el programa.");
			}

			System.out.println("Has elegido la opción 'Salir', el programa ha terminado.");
			System.exit(0);
		default:
			System.out.println("No has elegido una opción correcta. Vuelve a iniciar el programa.");
			break;
		}
		teclado.close();
	}
}