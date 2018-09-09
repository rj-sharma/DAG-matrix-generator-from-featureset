import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class EdgelistCreation {
	
	int no_of_vertices;
	int no_of_edges;
	int el_arr[][];
	
	/*public void set(int v, int e, int el_arr[][] ) {
		v= this.v;
		e= this.e;
		el_arr= this.el_arr;
		
	}*/
	
	public void creator_funtion() {
		//Arraylist for each feature
		FetchData FD = new FetchData();
		FD.fetch_data_t1();
		FD.fetch_data_t2();
		FD.fetch_data_t3();
		
		//****************//
		int array[]= {0,1};
		//creating random combination 
		Combination cob = new Combination();
		cob.arr = array;
		cob.r = 3;
		cob.CombinationRepetition(cob.arr, array.length, cob.r);
		//////////////////////////////////
		
		//Selecting a combination 
		ArrayList<Integer> selected_combi = cob.combi_res.get(3);
		
		System.out.println("combination selected "+selected_combi);
		
		//Providing a selected combination from database
		ArrayList<String> FS1 = FD.FT1.get(selected_combi.get(0));
		ArrayList<String> FS2 = FD.FT2.get(selected_combi.get(1));
		ArrayList<String> FS3 = FD.FT3.get(selected_combi.get(2));
		
		//*******************//
		
		//Providing a selected combination from database
		/*ArrayList<String> FS1 = FD.FT1.get(0);
		ArrayList<String> FS2 = FD.FT2.get(0);
		ArrayList<String> FS3 = FD.FT3.get(0);*/
		
		
		/*ArrayList<String> FS1 = new ArrayList<String>();
        FS1.add("a");
        FS1.add("r");
        FS1.add("h");
        FS1.add("d");
	
        ArrayList<String> FS2 = new ArrayList<String>();
        FS2.add("b");
        FS2.add("r");
        FS2.add("t");
        FS2.add("f");
        
        ArrayList<String> FS3 = new ArrayList<String>();
        FS3.add("b");
        FS3.add("r");
        FS3.add("g");
        FS3.add("f");*/
		
		System.out.println("Featute 1 combination selected"+FS1);
		System.out.println("Featute 2 combination selected"+FS2);
		System.out.println("Featute 3 combination selected"+FS3);
        
        HashSet<String> CS = new HashSet<>();
  	  
        for (String s : FS1) {
            CS.add(s);
            //System.out.println("");
        }
        
        for (String s : FS2) {
            CS.add(s);
        }
        
        for (String s : FS3) {
            CS.add(s);
        }
        
    
        //unique Feature list
        ArrayList<String> CSAL = new ArrayList<String>();
        Iterator<String> it = CS.iterator();  // Iterating over hash set items
        while(it.hasNext()){
           CSAL.add(it.next());
        }
        
        // value of v
        System.out.println(CSAL.size());
        
        
        
        //************Input value for adjacency matrix creation****************//
        int v=CSAL.size();
        int edge_list_size= FS1.size()+FS2.size()+FS3.size()-3;
        int edge_array[][] = new int[edge_list_size][2];
       
        
        
        int k=0;
        
        //edgelist_creation using First Feature
        for (int i= 0; i < FS1.size()-1; i++) { 		      
            System.out.println(FS1.get(i) +" " +FS1.get(i+1)); 
            
            edge_array[k][0] = CSAL.indexOf(FS1.get(i)); 
            edge_array[k++][1] = CSAL.indexOf(FS1.get(i+1));
        } 
        
        //edgelist_creation using Second Feature
        for (int i= 0; i < FS2.size()-1; i++) { 		      
            System.out.println(FS2.get(i) +" " +FS2.get(i+1)); 
            
            edge_array[k][0] = CSAL.indexOf(FS2.get(i)); 
            edge_array[k++][1] = CSAL.indexOf(FS2.get(i+1));
        } 
        
        //edgelist_creation using Third Feature
        for (int i= 0; i < FS3.size()-1; i++) { 		      
            System.out.println(FS3.get(i) +" " +FS3.get(i+1)); 
            
            edge_array[k][0] = CSAL.indexOf(FS3.get(i)); 
            edge_array[k++][1] = CSAL.indexOf(FS3.get(i+1));
        } 
        
        for(int i=0; i<edge_list_size; i++) {
        	
        	System.out.println(edge_array[i][0]+ " "+ edge_array[i][1]);
        	//System.out.println(CSAL.get(edge_array[i][0])+ " "+ CSAL.get(edge_array[i][1]));
        }
        
        //Unique list witj index
        for (int i= 0; i < CSAL.size(); i++) { 		      
            System.out.println(CSAL.indexOf(CSAL.get(i))+1 +" " +CSAL.get(i)); 
           
        } 
        
        
        
        
        no_of_vertices = v;
        no_of_edges = edge_list_size;
        el_arr = edge_array;
        EdgelistCreation edlc = new EdgelistCreation();
        edlc.set(v, edge_list_size, edge_array);
		
        //return edlc;
	}
		
	
	
	public static void main(String arg[]) {

        
	}
}
