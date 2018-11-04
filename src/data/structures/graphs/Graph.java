package data.structures.graphs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

//This class represents a directed graph using adjacency list 
//representation 
class Graph {
	private int V; // No. of vertices
	private LinkedList<Integer> adj[]; // Adjacency Lists

	// Constructor
	@SuppressWarnings("unchecked")
	protected Graph(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList<>();
	}

	// Function to add an edge into the graph
	void addEdgeDirected(int v, int w) {
		adj[v].add(w);
	}

	// Function to add an edge into the graph
	void addEdgeUndirected(int v, int w) {
		adj[v].add(w);
		adj[w].add(v); // Graph is undirected
	}

	// prints BFS traversal from a given source s
	void BFSalg(int s) {
		// Mark all the vertices as not visited(By default
		// set as false)
		boolean[] visited = new boolean[V];

		// Create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<>();

		// Mark the current node as visited and enqueue it
		visited[s] = true;
		queue.add(s);

		while (queue.size() != 0) {
			// Dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s + " ");

			adj[s].forEach(i -> {
				int currentNode = i.intValue();

				if (!visited[currentNode]) {
					visited[currentNode] = true;
					queue.add(currentNode);
				}
			});
		}
	}

	// A function used by DFS
	void DFSUtil(int v, boolean visited[]) {
		// Mark the current node as visited and print it
		visited[v] = true;
		System.out.print(v + " ");

		adj[v].forEach(i -> {
			int currentNode = i.intValue();

			if (!visited[currentNode]) {
				DFSUtil(currentNode, visited);
			}
		});
	}

	// The function to do DFS traversal. It uses recursive DFSUtil()
	void DFS(int v) {
		// Mark all the vertices as not visited(set as
		// false by default in java)
		boolean visited[] = new boolean[V];

		// Call the recursive helper function to print DFS traversal
		DFSUtil(v, visited);
	}

	// Assigns colors (starting from 0) to all vertices and
	// prints the assignment of colors
	void greedyColoring() {
		int result[] = new int[V];

		// Initialize all vertices as unassigned
		Arrays.fill(result, -1);

		// Assign the first color to first vertex
		result[0] = 0;

		// A temporary array to store the available colors. False
		// value of available[cr] would mean that the color cr is
		// assigned to one of its adjacent vertices
		boolean available[] = new boolean[V];

		// Initially, all colors are available
		Arrays.fill(available, true);

		// Assign colors to remaining V-1 vertices
		for (int u = 1; u < V; u++) {
			// Process all adjacent vertices and flag their colors
			// as unavailable
			Iterator<Integer> it = adj[u].iterator();
			while (it.hasNext()) {
				int i = it.next();
				if (result[i] != -1)
					available[result[i]] = false;
			}

			// Find the first available color
			int cr;
			for (cr = 0; cr < V; cr++) {
				if (available[cr])
					break;
			}

			result[u] = cr; // Assign the found color

			// Reset the values back to true for the next iteration
			Arrays.fill(available, true);
		}

		// print the result
		for (int u = 0; u < V; u++)
			System.out.println("Vertex " + u + " --->  Color " + result[u]);
	}

	// Returns true if the graph is a tree, else false.
	Boolean isTree() {
		// Mark all the vertices as not visited and not part
		// of recursion stack
		Boolean visited[] = new Boolean[V];
		for (int i = 0; i < V; i++)
			visited[i] = false;

		// The call to isCyclicUtil serves multiple purposes
		// It returns true if graph reachable from vertex 0
		// is cyclcic. It also marks all vertices reachable
		// from 0.
		if (isCyclicUtil(0, visited, -1))
			return false;

		// If we find a vertex which is not reachable from 0
		// (not marked by isCyclicUtil(), then we return false
		for (int u = 0; u < V; u++)
			if (!visited[u])
				return false;

		return true;
	}

	// A recursive function that uses visited[] and parent
	// to detect cycle in subgraph reachable from vertex v.
	Boolean isCyclicUtil(int v, Boolean visited[], int parent) {
		// Mark the current node as visited
		visited[v] = true;
		Integer i;

		// Recur for all the vertices adjacent to this vertex
		Iterator<Integer> it = adj[v].iterator();
		while (it.hasNext()) {
			i = it.next();

			// If an adjacent is not visited, then recur for
			// that adjacent
			if (!visited[i]) {
				if (isCyclicUtil(i, visited, v))
					return true;
			}

			// If an adjacent is visited and not parent of
			// current vertex, then there is a cycle.
			else if (i != parent)
				return true;
		}
		return false;
	}

	// Driver method to
	public static void main(String args[]) {
		Graph g = new Graph(4);

		g.addEdgeDirected(0, 2);
		g.addEdgeDirected(0, 1);
		g.addEdgeDirected(1, 2);
		g.addEdgeDirected(2, 0);
		g.addEdgeDirected(2, 3);
		g.addEdgeDirected(3, 3);

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");
		g.BFSalg(2);
		g.greedyColoring();
		System.out.println(g.isTree());
		System.out.println();

		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
		g.DFS(2);
		System.out.println();

		Graph g1 = new Graph(5);
		g1.addEdgeUndirected(0, 1);
		g1.addEdgeUndirected(0, 2);
		g1.addEdgeUndirected(1, 2);
		g1.addEdgeUndirected(1, 3);
		g1.addEdgeUndirected(2, 3);
		g1.addEdgeUndirected(3, 4);
		System.out.println("Coloring of graph 1");
		g1.BFSalg(0);
		g1.DFS(0);
		g1.greedyColoring();
		System.out.println(g1.isTree());

		System.out.println();
		Graph g2 = new Graph(5);
		g2.addEdgeUndirected(0, 1);	
		g2.addEdgeUndirected(0, 2);
		g2.addEdgeUndirected(1, 2);
		g2.addEdgeUndirected(1, 4);
		g2.addEdgeUndirected(2, 4);
		g2.addEdgeUndirected(4, 3);
		System.out.println("Coloring of graph 2");
		g2.BFSalg(0);
		g2.DFS(0);
		g2.greedyColoring();
		System.out.println(g2.isTree());
		
		Graph g3 = new Graph(5);
		g3.addEdgeDirected(0, 1);
		g3.addEdgeDirected(0, 2);
		g3.addEdgeDirected(1, 2);
		g3.addEdgeDirected(1, 3);
		g3.addEdgeDirected(2, 3);
		g3.addEdgeDirected(3, 4);
		System.out.println("Coloring of graph 3");
		g3.BFSalg(0);
		g3.DFS(0);
		g3.greedyColoring();
		System.out.println(g3.isTree());

		System.out.println();
		Graph g4 = new Graph(5);
		g4.addEdgeDirected(0, 1);	
		g4.addEdgeDirected(0, 2);
		g4.addEdgeDirected(1, 2);
		g4.addEdgeDirected(1, 4);
		g4.addEdgeDirected(2, 4);
		g4.addEdgeDirected(4, 3);
		System.out.println("Coloring of graph 4");
		g4.BFSalg(0);
		g4.DFS(0);
		g4.greedyColoring();
		System.out.println(g4.isTree());
	}
}
