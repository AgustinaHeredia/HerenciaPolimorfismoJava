package S1N1Ejercicio1AgustinaHeredia;

abstract class Instrumento {
	
	private String nombre;
	private double precio;
	
	
	public Instrumento (String nombre, double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	public String toString() {
		return "El instrumento es " + nombre + ", su precio es de "+ precio + " euros.";
	}
	public abstract String tocar();
	

}
