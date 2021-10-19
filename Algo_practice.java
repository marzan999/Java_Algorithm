

/*
Data Structure & Graph Algorithm using User Define Function.
*/


package algo_practice;

import static algo_practice.Radix.radixsort;
import static algo_practice.floadWarshal.INF;
import static algo_practice.heapSort.printArray;
import static algo_practice.huffman.printCode;
import static algo_practice.mergeSort.printArray;
import java.util.*;

public class Algo_practice {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("   -----------------------\n"
                + "          Algorithm           \n"
                + "   -----------------------\n"
                + "   Press 1 for Data structure   \n"
                + "   Press 2 for Graph algorithm");
        System.out.println();
        System.out.print("Enter your choice:  ");
        int choice = s.nextInt();
        System.out.println();

        if (choice == 1) {
            System.out.println("      algorithm \n"
                    + "---------------------\n"
                    + "1. binary search\n"
                    + "2. linear search\n"
                    + "3. Bubble sort\n"
                    + "4. Insertion sort\n"
                    + "5. Selection sort\n"
                    + "6. Quick sort\n"
                    + "7. Merge sort\n"
                    + "8. Heap sort\n"
                    + "9. Radix sort\n"
                    + "10.Bucket sort\n");
            
            System.out.println("Please enter your choice: ");
            int n1 = s.nextInt();
            
            switch(n1){
                case 1:
                    binarySearch bi = new binarySearch();
                    bi.searching();
                    break;
                case 2:
                    linearSearch li = new linearSearch();
                    li.searching();
                    break;
                case 3:
                    bubbleSort bu = new bubbleSort();
                    bu.sorting();
                    break;
                case 4:
                    insertionSort ins = new insertionSort();
                    ins.sorting();
                    break;
                case 5:
                      selectionSort si = new selectionSort();
                      si.sorting();
                    break;
                case 6:
                    quickSort q = new quickSort();
                    q.sorting();
                    break;
                    case 7:
                        int arr[] = { 6, 5, 12, 10, 9, 1 };

    mergeSort ob = new mergeSort();
    ob.mergeSort(arr, 0, arr.length - 1);

    System.out.println("Sorted array:");
    printArray(arr);
                    break;
                case 8:
                    int arr[] = { 12, 11, 13, 5, 6, 7 };
		int n = arr.length;

		heapSort ob = new heapSort();
		ob.sort(arr);

		System.out.println("Sorted array is");
		printArray(arr);
                    break;
                    case 9:
                        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
		int n = arr.length;
		
		radixort(arr, n);
		print(arr, n);
                    break;
                case 10:
                    bucketSort b = new bucketSort();
    float[] arr = { (float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52, (float) 0.37, (float) 0.47,
        (float) 0.51 };
    b.bucketSort(arr, 7);

    for (float i : arr)
      System.out.print(i + "  ");
                    break;
                default:
                    System.out.println("Please enter the correct number.");
                    break;
                    
            }
            
            
        } else if (choice == 2) {
            System.out.println("         Graph \n"
                    + "---------------------\n"
                    + "1. BFS\n"
                    + "2. DFS\n"
                    + "3. Huffman\n"
                    + "4. Topological Sort\n"
                    + "5. Prim's Algorithm\n"
                    + "6. Kruskal Algorithm\n"
                    + "7. Dijkstra Algorithm\n"
                    + "8. Bellman Ford Algorithm\n"
                    + "9. Floyd Warshall Algorithm\n"
                    
                    
            
            );
            
            System.out.println("Please enter your choice: ");
            int n1 = s.nextInt();
            
            switch(n1){
                case 1:
                    bfs g = new bfs(4);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);

    System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

    g.BFS(2);
                    break;
                case 2:
                    dfs d = new dfs(4);

    d.addEdge(0, 1);
    d.addEdge(0, 2);
    d.addEdge(1, 2);
    d.addEdge(2, 3);

    System.out.println("Following is Depth First Traversal");

    d.DFS(1);
                    break;
                case 3:
        
		int n = 6;
		char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
		int[] charfreq = { 5, 9, 12, 13, 16, 45 };

		PriorityQueue<HuffmanNode> q
			= new PriorityQueue<HuffmanNode>(n, new MyComparator());

		for (int i = 0; i < n; i++) {

			HuffmanNode hn = new HuffmanNode();

			hn.c = charArray[i];
			hn.data = charfreq[i];

			hn.left = null;
			hn.right = null;

			q.add(hn);
		}

		HuffmanNode root = null;

		while (q.size() > 1) {

			HuffmanNode x = q.peek();
			q.poll();

			HuffmanNode y = q.peek();
			q.poll();

			HuffmanNode f = new HuffmanNode();

			f.data = x.data + y.data;
			f.c = '-';

			f.left = x;

			f.right = y;

			root = f;

			q.add(f);
		}

		printCode(root, "");
                    
                    break;
                case 4:
                    
		topologicalSort ts = new topologicalSort(6);
		ts.addEdge(5, 2);
		ts.addEdge(5, 0);
		ts.addEdge(4, 0);
		ts.addEdge(4, 1);
		ts.addEdge(2, 3);
		ts.addEdge(3, 1);

		System.out.println("Following is a Topological "
						+ "sort of the given graph");
		ts.topologicalSort();
                    break;
                    
                    case 5:
                        
		MST t = new MST();
		int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
									{ 2, 0, 3, 8, 5 },
									{ 0, 3, 0, 0, 7 },
									{ 6, 8, 0, 0, 9 },
									{ 0, 5, 7, 9, 0 } };

		t.primMST(graph);
                    break;
                    case 6:
                        int vertices = 6; 
    int edges = 8; 
    Graph G = new Graph(vertices, edges);

    G.edge[0].src = 0;
    G.edge[0].dest = 1;
    G.edge[0].weight = 4;

    G.edge[1].src = 0;
    G.edge[1].dest = 2;
    G.edge[1].weight = 4;

    G.edge[2].src = 1;
    G.edge[2].dest = 2;
    G.edge[2].weight = 2;

    G.edge[3].src = 2;
    G.edge[3].dest = 3;
    G.edge[3].weight = 3;

    G.edge[4].src = 2;
    G.edge[4].dest = 5;
    G.edge[4].weight = 2;

    G.edge[5].src = 2;
    G.edge[5].dest = 4;
    G.edge[5].weight = 4;

    G.edge[6].src = 3;
    G.edge[6].dest = 4;
    G.edge[6].weight = 3;

    G.edge[7].src = 5;
    G.edge[7].dest = 4;
    G.edge[7].weight = 3;
    G.KruskalAlgo();
                    break;
                    
                    case 7:
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
                        break;
                        
                        case 8:
                           int V = 5; 
    int E = 8; 

    CreateGraph graph = new CreateGraph(V, E);

 
    graph.edge[0].s = 0;
    graph.edge[0].d = 1;
    graph.edge[0].w = 5;


    graph.edge[1].s = 0;
    graph.edge[1].d = 2;
    graph.edge[1].w = 4;


    graph.edge[2].s = 1;
    graph.edge[2].d = 3;
    graph.edge[2].w = 3;

 
    graph.edge[3].s = 2;
    graph.edge[3].d = 1;
    graph.edge[3].w = 6;

 
    graph.edge[4].s = 3;
    graph.edge[4].d = 2;
    graph.edge[4].w = 2;

    graph.BellmanFord(graph, 0); 
                        break;
                        case 9:
                              int graph[][] = { { 0, 3, INF, 5 }, { 2, 0, INF, 4 }, { INF, 1, 0, INF }, { INF, INF, 2, 0 } };
    floadWarshal a = new floadWarshal();
    a.floydWarshall(graph);
                        break;
                        case 10:
                        break;
                default:
                    System.out.println("Please enter the correct number.");
                    break;
        } 
            

    }

    }
}