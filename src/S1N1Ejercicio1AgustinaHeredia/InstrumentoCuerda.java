package S1N1Ejercicio1AgustinaHeredia;

public class InstrumentoCuerda extends Instrumento{

	public InstrumentoCuerda(String nombre, double precio) {
		super(nombre, precio);
		
	}
				
	public String tocar(){
		return "Esta sonando un intrumento de cuerda";
	}
}
