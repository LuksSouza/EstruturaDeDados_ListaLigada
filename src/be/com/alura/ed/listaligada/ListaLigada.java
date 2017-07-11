package be.com.alura.ed.listaligada;

public class ListaLigada {
	
	private Celula primeira = null;
	private int totalDeElementos = 0;
	
	public void adicionaNoComeco(Object elemento) {
		Celula celula = new Celula(elemento, this.primeira);
		
		this.totalDeElementos++;
	}
	
	public void adiciona(Object elemento) {
		
	}
	
	public void adiciona(Object elemento, int posicao) {
		
	}
	
	public Object pega(int posicao) {
		return null;
	}
	
	public void remove(int posicao) {
		
	}
	
	public int tamanho() {
		return 0;
	}
	
	public boolean contem(Object elemento) {
		return false;
	}
	
	public String toString() {
		return null;
	}
}
