package exerciciElectrodomesticoo;

public class Electrodomestico {

	private double precioBase = 100;
	private String color = "blanco";
	private char consumoEnergetico = 'F';
	private double peso = 5;


	public Electrodomestico() {

	}


	public Electrodomestico(double precioBase, double peso) {

		this.precioBase = precioBase;
		this.peso = peso;
	}


	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		super();
		this.precioBase = precioBase;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;


		if ((color.equalsIgnoreCase("blanco") 
				||color.equalsIgnoreCase("negro") 
				||color.equalsIgnoreCase("rojo") 
				||color.equalsIgnoreCase("azul") 
				||color.equalsIgnoreCase("gris"))) {

			this.color = color;


		}

		if (consumoEnergetico == 'A' || consumoEnergetico == 'a'
				|| consumoEnergetico == 'B' || consumoEnergetico == 'b'
				|| consumoEnergetico == 'C' || consumoEnergetico == 'c'
				|| consumoEnergetico == 'D' || consumoEnergetico == 'd'
				|| consumoEnergetico == 'E' || consumoEnergetico == 'e'
				|| consumoEnergetico == 'F' || consumoEnergetico == 'f') { 


			this.consumoEnergetico = consumoEnergetico;

		}


	}


	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}


}
