package view;

import model.Pilha;

public class Principal {

	public static void main (String[] args) {
		Pilha p = new Pilha();
		boolean vazia = p.isEmpty();
		System.out.println(vazia);
		
		int totalNos = (int) ((Math.random() * 7) +3);
		
		for(int i = 0; i < totalNos; i++) {
			p.push((int) ((Math.random() * 100)+1));
		}
		
		/*for (int i = 0; i < totalNos; i++) {
			try {
				System.out.println(p.pop());
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}*/
		
		System.out.println("Pilha está vazia: " + p.isEmpty());
		
		try {
			System.out.println("Tamanho da pilha: " + p.size());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			System.out.println("Topo da pilha: " + p.top());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			System.out.println("Maior vaor da pilha: " + p.max());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
