package poo;

public class App {

	public static void main(String[] args) {
		Computadora pc1 = new Computadora();
		//pc1.cantidadRam = 8;
		//pc1.espacioDisco = 1024;
		//pc1.frecuenciaTrabajo = 3.5;
		//pc1.marca = "Dell";
		//pc1.precio = 500.00;
		//pc1.vidaUtil = 5;
		pc1.PonerMarca("Dell");
		pc1.PonerCantidadRam(8);
		pc1.PonerEspacioDisco(1024);
		pc1.PonerFrecuenciaTrabajo(3.5);
		pc1.PonerPrecio(500.00);
		pc1.PonerVidaUtil(5);
		Computadora pc2 = new Computadora();
		//pc2.cantidadRam = 12;
		//pc2.espacioDisco = 2048;
		//pc2.frecuenciaTrabajo = 3.9;
		//pc2.marca = "Asus";
		//pc2.precio = 980.00;
		//pc2.vidaUtil = 4;
		pc2.PonerMarca("Asus");
		pc2.PonerCantidadRam(12);
		pc2.PonerEspacioDisco(2048);
		pc2.PonerFrecuenciaTrabajo(3.9);
		pc2.PonerPrecio(980.00);
		pc2.PonerVidaUtil(4);
		
		Computadora pc3 = new Computadora();
		pc3.PonerMarca("Lenovo");
		pc3.PonerCantidadRam(512);
		
		System.out.println("Marca de la pc1 = " + pc1.MostrarMarca());
		System.out.println("Marca de la pc2 = " + pc2.MostrarMarca());
		System.out.println("Marca de la pc3 = " + pc3.MostrarMarca());
		System.out.println("----------------------------------");
		System.out.println("Precio de la pc1 = " + pc1.MostrarPrecio());
		System.out.println("Precio de la pc2 = " + pc2.MostrarPrecio());
		System.out.println("Precio de la pc3 = " + pc3.MostrarPrecio());
		System.out.println("----------------------------------");
		System.out.println("Cantidad Ram de la pc1 = " + pc1.MostrarCantidadRam());
		System.out.println("Cantidad Ram de la pc2 = " + pc2.MostrarCantidadRam());
	}

}
