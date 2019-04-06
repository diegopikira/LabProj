package hello;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

public class Controller {

	private Model model;

	public Controller(Model model) {
		this.model = model;
	}

	public void buscarComanda() {
		get("/comanda/:comanda", (req, res) -> {
			Comanda comandaCompleta = model.buscarComanda(Integer.valueOf(req.params(":comanda")));
			return new Gson().toJson(comandaCompleta);

		});
	}

	public void listarPedido() {
		get("/comanda/lista/:comanda", (req, res) -> {
			List<Comanda> comandaCompleta = model.listarPedido(Integer.valueOf(req.params(":comanda")));
			return new Gson().toJson(comandaCompleta);
		});
	}

}
