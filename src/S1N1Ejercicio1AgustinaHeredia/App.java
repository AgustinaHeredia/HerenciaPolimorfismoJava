package S1N1Ejercicio1AgustinaHeredia;
import java.util.Scanner;
public class App {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		InstrumentoViento saxofon = new InstrumentoViento("Saxofon", 1500);
		InstrumentoCuerda violin = new InstrumentoCuerda("Violin", 2850);
		InstrumentoPercusion timbal = new InstrumentoPercusion ("Timbal", 1300);
		
		System.out.println(saxofon.toString());
		System.out.println(violin.toString());
		System.out.println(timbal.toString());
		
		int seleccion=0;
		do {
			seleccion=pedirInt("Escribe el número del instrumento que está tocando. 1-Saxofon 2-Violin 3-Timbal 0-salir del programa.");
			switch (seleccion){ 
			case 1:
				System.out.println(saxofon.tocar());
				break;
			case 2:
				System.out.println(violin.tocar());
				break;
			case 3:
				System.out.println(timbal.tocar());
				break;
			case 0:
				System.out.println("Has elegido salir del programa. Hasta pronto.");
				break;
			default:
				System.out.println("El número ingresado no es correcto");
			}
		}while (seleccion !=0);
		
	}
	static int pedirInt(String texto) {
		System.out.println(texto);
		int n1 = input.nextInt();
		return n1;
	}
}
