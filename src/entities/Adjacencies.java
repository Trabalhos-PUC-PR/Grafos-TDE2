package entities;

public class Adjacencies {

	private int adjacency;
	private Double weight;
	
	public Adjacencies() {
		this.adjacency = 0;
		this.weight = 0.0;
	}

	public Adjacencies(int adjacency, Double weight) {
		this.adjacency = adjacency;
		this.weight = weight;
	}

	public int getAdjacency() {
		return adjacency;
	}

	public Double getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return adjacency+"";
	}
	
	
	
}
