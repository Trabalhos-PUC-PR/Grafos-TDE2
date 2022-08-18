package entities;

import java.util.ArrayList;

public class Graph {

	private AdjacencyList list;
	
	public Graph() {
		list = new AdjacencyList();
	}

	public void addVertex() {
		list.addVertex();
	}
	
	public void removeVertex(int index) {
		list.removeVertex(index);
	}
	
    public void cria_adjacencia(int i, int j, double P) {
    	list.addAdjacencyAt(i, j, P);
    }
    
    public void remove_adjacencia(int i, int j) {
    	list.removeAdjacency(i, j);
    }
    
    public void imprime_adjacencias() {
    	list.print();
    }
    
    public void seta_informacao(int i, String V) {
    	list.setValueAt(i, V);
    }

	public int adjacentes(int i, ArrayList<Integer> adj) {
		ArrayList<Adjacencies> aux = list.getAllAdjacenciesFrom(i);
		for(Adjacencies adjacency : aux) {
			adj.add(adjacency.getAdjacency());			
		}
		return aux.size();
	}
	
}
