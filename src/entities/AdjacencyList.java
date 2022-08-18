package entities;

import java.util.ArrayList;

public class AdjacencyList {

	private ArrayList<ArrayList<Adjacencies>> list;
	private ArrayList<String> values;

	public AdjacencyList() {
		ArrayList<Adjacencies> aux = new ArrayList<>();
		list = new ArrayList<ArrayList<Adjacencies>>();
		values = new ArrayList<String>();
		list.add(aux);
	}

	public void addVertex(int total) {
		for (int i = 0; i < total; i++) {
			addVertex();
		}
	}

	public void addVertex() {
		ArrayList<Adjacencies> aux = new ArrayList<>();
		values.add("");
		list.add(aux);
	}

	public void addAdjacencyAt(int y, int adjacency, double weight) {
		if(adjacency < 0 || adjacency > list.size()-1) {
			System.out.println("não settou");
			return;
		}
		Adjacencies aux = new Adjacencies(adjacency, weight);
		list.get(y).add(aux);
	}

	public void removeAdjacency(int y, int x) {
		ArrayList<Adjacencies> aux = list.get(y);
		int count = 0;
		for (Adjacencies adjacency : aux) {
			if (adjacency.getAdjacency() == x) {
				break;
			}
			count++;
		}
		if (count != aux.size()) {
			list.get(y).remove(count);
		}
	}

	public ArrayList<Adjacencies> getAllAdjacenciesFrom(int index){
		return list.get(index);
	}
	
	public int getMostAdjacenciesCount() {
		int length = 0;
		for (ArrayList<Adjacencies> innerList : list) {
			if (innerList.size() > length) {
				length = innerList.size();
			}
		}
		return length;
	}

	public void setValueAt(int index, String value) {
		values.set(index, value);
	}
	
	/**
	 * prints Adjacency List
	 */
	public void print() {
		int count = 0;
		for (ArrayList<Adjacencies> innerList : list) {
			System.out.printf("| %d || ", count);
			for (Adjacencies adjacency : innerList) {
				System.out.printf("%s | ", adjacency);
			}
			count++;
			System.out.println();
		}
	}

}
