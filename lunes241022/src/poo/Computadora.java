package poo;

public class Computadora {
    //Campos/Atributos
	private String marca;
	private int vidaUtil;
	private double precio;
	private int cantidadRam;
	private int espacioDisco;
	private double frecuenciaTrabajo;
	//Metodos/Comportamiento
	  //setters - Modificar el valor de una variable
	public void PonerMarca(String marca) {
		this.marca = marca;
	}
	public void PonerVidaUtil(int vidaUtil) {
		this.vidaUtil = vidaUtil;
	}
	public void PonerPrecio(double precio) {
		this.precio = precio;
	}
	public void PonerCantidadRam(int cantidadRam) {
		this.cantidadRam = cantidadRam;
	}
	public void PonerEspacioDisco(int espacioDisco) {
		this.espacioDisco = espacioDisco;
	}
	public void PonerFrecuenciaTrabajo(double frecuenciaTrabajo) {
		this.frecuenciaTrabajo = frecuenciaTrabajo;
    }
	 //Getters - Mostrar el valor de una variable
	public String MostrarMarca() {
		return this.marca;
	}
	public int MostrarVidaUtil() {
		return this.vidaUtil;
	}
	public double MostrarPrecio() {
		return this.precio;
	}
	public int MostrarCantidadRam() {
		return this.cantidadRam;
	}
	public int MostrarEspacioDisco() {
		return this.espacioDisco;
	}
	public double MostrarFrecuneciaTrabajo() {
		return this.frecuenciaTrabajo;
	}
}
