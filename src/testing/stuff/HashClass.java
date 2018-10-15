package testing.stuff;

public class HashClass {
	private String hashString;

	public HashClass(String hashString) {
		super();
		this.hashString = hashString;
	}

	public String getHashString() {
		return hashString;
	}

	public void setHashString(String hashString) {
		this.hashString = hashString;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hashString == null) ? 0 : hashString.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashClass other = (HashClass) obj;
		if (hashString == null) {
			if (other.hashString != null)
				return false;
		} else if (!hashString.equals(other.hashString))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HashClass [hashString=" + hashString + "]";
	}
}
