package hello;

public class Comanda {

	private int numeroComanda;
	private Pedidos espc;

	public Comanda(int numeroComanda, Pedidos espc) {
		super();
		this.numeroComanda = numeroComanda;
		this.espc = espc;
	}

	public Pedidos getDescricao() {
		return espc;
	}

	public void setEspc(Pedidos espc) {
		this.espc = espc;
	}

	public int getNumeroComanda() {
		return numeroComanda;
	}

	public void setNumeroComanda( int numeroComanda) {
		this.numeroComanda = numeroComanda;
	}
	
	public boolean comparar(Comanda coma) {
		if (numeroComanda == (coma.numeroComanda)) {
			return true;
		} else {
			return false;
		}
	}

}
