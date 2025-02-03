import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int original_n = n;
		int original_nn =n;
		int count=0;
		int check=0;
		while(original_n>0){
			original_n/=10;
			count++;
		}
		while(original_nn>0){
			int rem=original_nn%10;
			check+=Math.pow(rem,count);
			original_nn/=10;
		}
		boolean ans = false;
		if(n==check){
			ans=true;
		}
		else{
			ans=false;
		}
		System.out.print(ans);

	}
}
