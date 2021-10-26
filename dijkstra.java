
package algo_practice;
import java.util.*; 
class Graph_pq { 
    int dist[]; 
    Set<Integer> visited; 
    PriorityQueue<Node> pqueue; 
    int V; 
    List<List<Node> > adj_list; 
    public Graph_pq(int V) { 
        this.V = V; 
        dist = new int[V]; 
        visited = new HashSet<Integer>(); 
        pqueue = new PriorityQueue<Node>(V, new Node()); 
    } 
  
    public void algo_dijkstra(List<List<Node> > adj_list, int src_vertex) 
    { 
        this.adj_list = adj_list; 
  
        for (int i = 0; i < V; i++) 
            dist[i] = Integer.MAX_VALUE; 
  
        pqueue.add(new Node(src_vertex, 0)); 
  
        dist[src_vertex] = 0; 
        while (visited.size() != V) { 

            int u = pqueue.remove().node; 
  
            visited.add(u); 
            graph_adjacentNodes(u); 
        } 
    } 
    private void graph_adjacentNodes(int u)   { 
        int edgeDistance = -1; 
        int newDistance = -1; 
  
        for (int i = 0; i < adj_list.get(u).size(); i++) { 
            Node v = adj_list.get(u).get(i); 
  
            if (!visited.contains(v.node)) { 
                edgeDistance = v.cost; 
                newDistance = dist[u] + edgeDistance; 
  
                if (newDistance < dist[v.node]) 
                    dist[v.node] = newDistance; 
  
                pqueue.add(new Node(v.node, dist[v.node])); 
            } 
        } 
    } 
}
class Main{
    public static void main(String arg[])   { 
        int V = 6; 
        int source = 0; 
        List<List<Node> > adj_list = new ArrayList<List<Node> >(); 
        for (int i = 0; i < V; i++) { 
            List<Node> item = new ArrayList<Node>(); 
            adj_list.add(item); 
        } 

  
        adj_list.get(0).add(new Node(1, 5)); 
        adj_list.get(0).add(new Node(2, 3)); 
        adj_list.get(0).add(new Node(3, 2)); 
        adj_list.get(0).add(new Node(4, 3));
        adj_list.get(0).add(new Node(5, 3));
        adj_list.get(2).add(new Node(1, 2)); 
        adj_list.get(2).add(new Node(3, 3)); 
        Graph_pq dpq = new Graph_pq(V); 
        dpq.algo_dijkstra(adj_list, source); 
  
        System.out.println("The shorted path from source node to other nodes:"); 
        System.out.println("Source\t\t" + "Node#\t\t" + "Distance");
        for (int i = 0; i < dpq.dist.length; i++) 
            System.out.println(source + " \t\t " + i + " \t\t "  + dpq.dist[i]); 
    } 
} 
  
class Node implements Comparator<Node> { 
    public int node; 
    public int cost; 
    public Node() { } 
  
    public Node(int node, int cost) { 
        this.node = node; 
        this.cost = cost; 
    } 
    @Override
    public int compare(Node node1, Node node2) 
    { 
        if (node1.cost < node2.cost) 
            return -1; 
        if (node1.cost > node2.cost) 
            return 1; 
        return 0; 
    } 
}