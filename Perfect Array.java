// { Driver Code Starts
/*package whatever //do not write package name here */


import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    if(obj.IsPerfect(arr, n))
		        System.out.println("PERFECT");
		    else
		        System.out.println("NOT PERFECT");
		}
		
	}
}

// } Driver Code Ends



class Solution{
    
    public boolean IsPerfect(int a[], int n)
    {
        boolean perfect = true;
        int rev[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            rev[n-i-1] = a[i];
        }
        for(int j = 0 ; j < n ; j++)
        {
            if(a[j] != rev[j])
            {
                perfect = false;
            }
        }
        return perfect;
    }
    
}

