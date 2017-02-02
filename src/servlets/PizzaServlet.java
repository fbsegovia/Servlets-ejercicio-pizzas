package servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidades.Pizza;
import modelo.negocio.GestorPizza;

/**
 * Servlet implementation class PizzaServlet
 */
public class PizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String direccion = request.getParameter("direccion");
		String nombre = request.getParameter("nombre");
		String telefono = request.getParameter("telefono");
		String tama�o = request.getParameter("tamanio");
		
		if (tama�o==null){
			request.setAttribute("error", "El campo tama�o debe ir informado");
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/index.jsp");
			rd.forward(request, response);
			return;
		}
		
		/*Como son varios valores asociados al nombre ingredientes,
		 necesitamos recogerlos en forma de Array.*/
		String[] arrayIngredientes = request.getParameterValues("ingredientes");
		/*Como nosotros trabajamos con listas debemos cambiar el tipo*/
		List<String> listaIngredientes = Arrays.asList(arrayIngredientes);
		
		Pizza pizza = new Pizza();
		pizza.setDireccion(direccion);
		pizza.setNombre(nombre);
		pizza.setTelefono(telefono);
		pizza.setTama�o(tama�o);
		pizza.setListaIngredientes(listaIngredientes);
		GestorPizza gp = new GestorPizza();
		double precioPizza = gp.CalcularPrecio(pizza);
		pizza.setPrecio(precioPizza);
		
		request.setAttribute("pizza", pizza);
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/resumen.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
