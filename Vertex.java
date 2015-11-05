
public class Vertex {
	final String id;
	final String name;

	public Vertex(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());

		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		Vertex other = (Vertex) obj; // casting the obj to vertex
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;

	}
}
