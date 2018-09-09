
// Java program to print all combination of size r in an array of size n
import java.io.*;
import java.util.ArrayList;
 
class Combination {
 
	int[] arr;
	int r;
	ArrayList<ArrayList<Integer>> combi_res = new ArrayList<ArrayList<Integer>>();
	
	public void CombinationRepetitionUtil(int[] chosen, int[] arr, int index, int r, int start, int end)
	{
		// Since index has become r, current combination is
		// ready to be printed, print
		if (index == r)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>(); 
			for (int i = 0; i < r; i++)
			{
				System.out.printf("%d ", arr[chosen[i]]);
				temp.add(arr[chosen[i]]);
			}
			combi_res.add(temp); 
			System.out.print("\n");
			return;
		}

		// One by one choose all elements (without considering
		// the fact whether element is already chosen or not)
		// and recur
		for (int i = start; i <= end; i++)
		{
			chosen[index] = i;
			CombinationRepetitionUtil(chosen, arr, index + 1, r, i, end);
		}
		return;
	}

	public void CombinationRepetition(int[] arr, int n, int r)
	{
		// Allocate memory
		int[] chosen = new int[r + 1];

		// Call the recursice function
		CombinationRepetitionUtil(chosen, arr, 0, r, 0, n - 1);
	}

 
    /*Driver function to check for above function*/
    public static void main (String[] args) {
    	Combination ob = new Combination();
    	
    	int ar[] = {0, 1};
    	ob.arr=ar;
    	ob.r=3;
    	
    		int n = ar.length;
 
    		ob.CombinationRepetition(ar, n, ob.r);
    		
    		System.out.print(ob.combi_res);
    		
    }
}
/* This code is contributed by Devesh Agrawal */