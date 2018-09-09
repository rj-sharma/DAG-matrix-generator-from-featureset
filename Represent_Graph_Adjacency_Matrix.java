
import java.util.Scanner;

 
public class Represent_Graph_Adjacency_Matrix 
{
    private final int vertices;
    private int[][] adjacency_matrix;
 
    public Represent_Graph_Adjacency_Matrix(int v) 
    {
        vertices = v;
        adjacency_matrix = new int[vertices + 1][vertices + 1];
    }
 
    public void makeEdge(int to, int from, int edge) 
    {
        try 
        {
            adjacency_matrix[to][from] = edge;
        }
        catch (ArrayIndexOutOfBoundsException index) 
        {
            System.out.println("The vertices does not exists");
        }
    }
 
    public int getEdge(int to, int from) 
    {
        try 
        {
            return adjacency_matrix[to][from];
        }
        catch (ArrayIndexOutOfBoundsException index) 
        {
            System.out.println("The vertices does not exists");
        }
        return -1;
    }
 
    public static void main(String args[]) 
    {
        int v, e, count = 1, to = 0, from = 0,k=0;
        Scanner sc = new Scanner(System.in);
        
        EdgelistCreation elc = new EdgelistCreation();
        elc.creator_funtion();
        
        Represent_Graph_Adjacency_Matrix graph;
        try 
        {
           // System.out.println("Enter the number of vertices: ");
           // v = sc.nextInt();
        	v = elc.no_of_vertices;
        	System.out.println("Enter the number of Vertices: "+v);
           // System.out.println("Enter the number of edges: ");
           // e = sc.nextInt();
        	e = elc.no_of_edges;
        	System.out.println("Enter the number of edges: "+e);
        	
        	int arr[][] = elc.el_arr;
        	
        	System.out.println("Edgelist :");
        	for(int i=0; i<arr.length; i++) {
        		System.out.println(arr[i][0]+" "+arr[i][1]);
        	}
        	
            graph = new Represent_Graph_Adjacency_Matrix(v);
 
            //System.out.println("Enter the edges: <to> <from>");
            while (count <= e) 
            {
                to = arr[k][0]+1;
                from = arr[k++][1]+1;
 
                graph.makeEdge(to, from, 1);
                count++;
            }
 
            System.out.println("The adjacency matrix for the given graph is: ");
           /* System.out.print("  ");
            for (int i = 1; i <= v; i++)
                System.out.print(i + " ");
            System.out.println();*/
 
            for (int i = 1; i <= v; i++) 
            {
                //System.out.print(i + " ");
                for (int j = 1; j <= v; j++) 
                    System.out.print(graph.getEdge(i, j) + ",");
                System.out.println();
            }
 
        }
        catch (Exception E) 
        {
            System.out.println("Somthing went wrong");
        }
 
        sc.close();
    }
}
