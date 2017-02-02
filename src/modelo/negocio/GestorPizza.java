package modelo.negocio;

import modelo.entidades.Pizza;

public class GestorPizza {

	/**
	 * Esta funci�n calcula el precio de una pizza en base a su tama�o y a la lista de ingredientes.
	 * 
	 * @param pizza,representa la pizza la cual queremos calcular
	 * su precio. Debe de tener el tama�o y la lista de ingredientes rellenas.
	 * @return El precio calculado en euros.
	 */
	public double CalcularPrecio(Pizza pizza){
		double precioBase = 0;
		switch (pizza.getTama�o()) {
		case "pequenio":
			precioBase = 5;
			break;
		case "mediano":
			precioBase = 10;
			break;
		case "grande":
			precioBase = 15;
			break;
		}
		int numeroIngredientes = pizza.getListaIngredientes().size();
		double precioTotal = precioBase+numeroIngredientes;
		return precioTotal;
	}
	
}
