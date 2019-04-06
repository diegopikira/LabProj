package hello;

import java.util.List;
import java.util.LinkedList;

public class Model {

	private static List<Comanda> comandas = new LinkedList<Comanda>();

	public void addComanda(Comanda comanda) {
		comandas.add(comanda);
	}

	public Comanda buscarComanda(int numero) {
		for (Comanda comanda : comandas) {
			if (comanda.getNumeroComanda() == (numero))
				return comanda;
		}
		return null;
	}

	public List<Comanda> listarPedido(int numero) {
		List<Comanda> comandaCompleta = new LinkedList<Comanda>();
		for (Comanda comanda : comandas) {
			if (comanda.getNumeroComanda() == (numero))
				comandaCompleta.add(comanda);
		}

		return comandaCompleta;

	}

	public List<Comanda> getComanda() {
		return comandas;
	}

}
