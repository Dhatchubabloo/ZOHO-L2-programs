

/*program for find a last duplicate value from the given array
sample input : 7
                1 2 3 4 1 4 1
sample output : the last dulicate value is
                4

*/
import java.util.Scanner;
public class Duplicate{
    public static void main(String  [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++){
            int x = s.nextInt();
            a[i] = x;
        }
        int k=-1;
        int index = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i] == a[j]){
                    index = i;
                    a[j] = k;
                    k--;
                }
            }
        }
        if(index == 0){
            System.out.println("no duplicates found");
        }
        else{
            System.out.println("the last duplicate value is");
            System.out.println(a[index]);
        }
    }
}