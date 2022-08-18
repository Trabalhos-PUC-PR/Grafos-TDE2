package app;

import java.util.ArrayList;

import entities.Graph;

public class Main {

	public static void main(String[] args) {

		Graph grafo = new Graph();
		grafo.addVertex();
		grafo.addVertex();
		grafo.addVertex();
		
		grafo.cria_adjacencia(2, 0, 4);
		grafo.cria_adjacencia(3, 0, 4);
		grafo.cria_adjacencia(0, 2, 8);
		grafo.cria_adjacencia(0, 1, 5);
		
		ArrayList<Integer> total = new ArrayList<>();
		
		System.out.printf("tamanho: %d\n", grafo.adjacentes(0, total));
		System.out.printf("Vértices adjacentes: %s\n", total);
		
		grafo.imprime_adjacencias();
	}

}
