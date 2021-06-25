
/* program for derive a new sentence from the given sentence 'abc' such that each word in 'abc' is reversed*/


import java.util.Scanner;
public class Strreverse{
    public static void main(String  [] args){
        Scanner s = new Scanner(System.in);
        String abc  = s.nextLine();
        String str [] = abc.split(" ");
        int len = str.length;
        for(int i=0;i<len;i++){
            String k = str[i];
           int num = k.length();
           char c [] = new char[num];
           int d = 0;
           for(int j=num-1;j>=0;j--){
               c[d] = k.charAt(j);
               d++;
           }
           str[i] = new String(c);
        }
        for(int i=0;i<len;i++){
            System.out.print(str[i]+" ");
        }
    }
}