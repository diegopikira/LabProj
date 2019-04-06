package hello;

public class Pedidos {

	private int numeroPedido;
	private int quantidade;
	private String item;
	private float preco;
	private String obs;

	public Pedidos(int numeroPedido, int quantidade, String item, float preco, String obs) {
		this.numeroPedido = numeroPedido;
		this.quantidade = quantidade;
		this.item = item;
		this.preco = preco;
		this.obs = obs;
	}

	public int getQuantidade() {
		return (int) quantidade;
	}

	public String getItem() {
		return item;
	}

	public float getPreco() {
		return preco;
	}

	public String getObs() {
		return obs;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public boolean comparar(Pedidos esp) {
		if (numeroPedido == (esp.numeroPedido) && quantidade == (esp.quantidade) && item.equals(esp.item)
				&& preco == (esp.preco) && obs.equals(esp.obs)) {
			return true;
		} else {
			return false;
		}
	}

}
