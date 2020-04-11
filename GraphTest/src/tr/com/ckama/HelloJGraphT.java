package tr.com.ckama;

import java.net.URI;
import java.net.URISyntaxException;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

public class HelloJGraphT {

	public static void main(String[] args) throws URISyntaxException {

		Graph<URI, DefaultEdge> graph = new DefaultDirectedGraph<URI, DefaultEdge>(DefaultEdge.class);

		URI google = new URI("https://www.google.com");
		URI wikipedia = new URI("https://www.wikipedia.org");
		URI jgrapht = new URI("http://www.jgrapht.org");

		// add the vertices
		graph.addVertex(google);
		graph.addVertex(wikipedia);
		graph.addVertex(jgrapht);

		// add edges to create linking structure
		graph.addEdge(jgrapht, wikipedia);
		graph.addEdge(google, jgrapht);
		graph.addEdge(google, wikipedia);
		graph.addEdge(wikipedia, google);

	}

}
