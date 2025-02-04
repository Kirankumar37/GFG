//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> ans = new ArrayList<>();
        long i=1;
        while(fact(i)<=n){
            if(fact(i)<=n){
                ans.add(fact(i));
                i++;
            }
            else{
               break; 
            }
            
        }
        return ans;
        
    }
    long fact(long num){
        if(num==1){
            return 1;
        }
        return num*fact(num-1);
    }
    
}
