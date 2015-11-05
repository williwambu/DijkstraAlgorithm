public class Edge {
	private final String id;
	private final Vertex source;
	private final int weight;
	private final Vertex destination;
	
	public Edge(String id, Vertex source,Vertex destination,int weight){
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}
	
	public String getId(){
		return id;
	}
	
	public Vertex getSource(){
		return source;
	}
	
	public Vertex getDestination(){
		return destination;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public String toString(){
		return source + " " + destination;
	}
}
