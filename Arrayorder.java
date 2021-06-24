
/*program for sorting array in ascending order based on elements having the no.of 3

sample input :  5
                3,12,3433,33333,33

sample output : 12,3,33,3433,33333

*/
import java.util.Scanner;
public class Arrayorder{
    public static void main(String  [] args){
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int a [] = new int [len];
        for(int i=0;i<len;i++){
            int x = s.nextInt();
            a[i] = x;
        }
        //System.out.println(len);
        int j=0;
        int sum [] = new int[len];
        for(int i=0;i<len;i++){
            int x = a[i];
            int count = 0;
            while(x>0){
                int mod = x%10;
                if(mod == 3){
                    count++;
                }
                x = x/10;
            }
            sum[j] = count;j++;
        }
        int b [] = new int [len];
        int k=0; 
        for(int m=0;m<len;m++){
            int min = sum[0];
            int index = 0;
            for(int i=0;i<len;i++){
                if(sum[i]<min){
                    min = sum[i];
                    index = i;
                }
            }
            b[k] = a[index];
            k++;
            sum[index] = 1000;
        }
        for(int i=0;i<k;i++){
            System.out.print(b[i]+" ");
        }
    }
}