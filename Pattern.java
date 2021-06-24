
/*  
sample input : babloo

output:
d     u
 h   h
  a c
   t
  a c
 h   h
d     u


*/


import java.util.Scanner;
public class Pattern{
    public static void main(String  [] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char a [] = str.toCharArray();
        int len = a.length;
        int k = len-1;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(j==i){
                    System.out.print(a[i]);
                }
                else if(j==k){
                    System.out.print(a[j]);
                }
                else
                System.out.print(" ");
            }
            k--;
            System.out.println();
        }
    }
}