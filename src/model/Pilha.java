package model;

public class Pilha {

	No topo;
	
	public Pilha() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push(int e) {
		No elemento = new No();
		elemento.dado = e;
		if (isEmpty() == true) {
			topo = elemento;
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}
	
	public int pop () throws Exception {
		if (isEmpty() == true) {
			throw new Exception("Não há elementos na pilha.");
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public int top () throws Exception {
		if (isEmpty() == true) {
			throw new Exception("Não há elementos na pilha.");
		}
		int valor = topo.dado;
		return valor;
	}
	
	public int size() throws Exception {
		int cont = 0;
		if (isEmpty() == false) {
			No aux = topo;
			cont = 1;
			while (aux.proximo != null) {
				cont++;
				aux = aux.proximo;
			}
		} else {
			throw new Exception("Não há elementos na pilha.");
		}
		return cont;
	}
	
	public int max() throws Exception {
		int maior = topo.dado;
		if (isEmpty() == true) {
			throw new Exception("Não há elementos na pilha.");
		} else {
			No aux = topo;
			while (aux.proximo != null) {
				if (aux.dado > maior) {
					maior = aux.dado;
					aux = aux.proximo;
				} else {
					aux = aux.proximo;
				}
			}
		}
		return maior;
	}
	
}
