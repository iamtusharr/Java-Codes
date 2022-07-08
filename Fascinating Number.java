// { Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}// } Driver Code Ends


class Solution {
    boolean fascinating(long n) 
    {
        
        long mult_2 = n * 2;
        long mult_3 = n * 3;
        String str1 = Long.toString(n);
        String str2 = Long.toString(mult_2);
        String str3 = Long.toString(mult_3);
        String str4 = str1+str2+str3;
        
        char ar[] = str4.toCharArray();
        Arrays.sort(ar);
        if(String.valueOf(ar).equals("123456789"))
        {
            return true;
        }
        return false;
        
        
    }
}
