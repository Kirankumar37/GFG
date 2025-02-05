class Solution {
    public boolean isPalindrome(String s) {
        String Check ="";
        String check="";
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            if(Character.isLetterOrDigit(s.charAt(i))){
                Check=Check+s.charAt(i);
            }
        }
        for(int k=0;k<n;k++){
            if(Character.isLetterOrDigit(s.charAt(k))){
                check+=s.charAt(k);
            }
        }
        check=check.toLowerCase();
        Check=Check.toLowerCase();
        int x=Check.length();
        for(int j=0;j<x;j++){
            if(Check.charAt(j)!=check.charAt(j)){
                return false;
            }
        }
        return true;
            

    }
}
