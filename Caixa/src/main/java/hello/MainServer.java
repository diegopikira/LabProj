package hello;

import static spark.Spark.*;

public class MainServer {

	final static Model model = new Model();

	public static void main(String[] args) {

		// Get port config of heroku on environment variable
		ProcessBuilder process = new ProcessBuilder();
		Integer port;
		if (process.environment().get("PORT") != null) {
			port = Integer.parseInt(process.environment().get("PORT"));
		} else {
			port = 9080;
		}
		port(port);

		// Servir conteudo html, css e javascript
		staticFileLocation("/static");

		inicializarComandas();

		Controller controller = new Controller(model);

		controller.buscarComanda();
		controller.listarPedido();

	}

	public static void inicializarComandas() {
		model.addComanda(new Comanda(1111, new Pedidos(1, 2, "cerveja", 10, "")));
		model.addComanda(new Comanda(1111, new Pedidos(2, 2, "coca", 10, "")));
		model.addComanda(new Comanda(2222, new Pedidos(1, 3, "coca-cola", 5, "gelo e limão")));
		model.addComanda(new Comanda(3333, new Pedidos(1, 4, "coxinha", 3, "")));
	}
}
