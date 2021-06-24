

/* program for find the sum of 1st half of the odd/even digit integer as well find the sum of 2nd half of the integer.

sample input : 9876543219
output : sum of first half of the integer : 19
         sum of second half of the integer : 35 
*/ 

import java.util.Scanner;
public class Numtraverse{
    public static void main(String  [] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long n1 = n;
        long n2 = n;
        long mul =0;
        int count =0;
        while(n1>0){
            long r = n1%10;
            n1 = n1/10;
            count++;
            mul = (mul*10)+r;
        }
        long x = count/2;
        long y =1;
        while(x>0){
            y = y*10;
            x--;
        }
        if(count%2!=0){
            long res1 = n/y;
            long sum1 =0;
            while(res1>0){
                long mod1 = res1%10;
                sum1 = sum1+mod1;
                res1 = res1/10;
            }
            System.out.println("sum of first half of the integer : "+sum1);
            long min = mul/10;
            long res2 = min/y;
            long sum2 =0;
            while(res2>0){
                long mod2 = res2%10;
                sum2 = sum2+mod2;
                res2 = res2/10;
            }
            System.out.println("sum 0f second half of the integer : "+sum2);
        }
        else{
            long res1 = n/y;
            long sum1 =0;
            while(res1>0){
                long mod1 = res1%10;
                sum1 = sum1+mod1;
                res1 = res1/10;
            }
            System.out.println("sum of first half of the integer : "+sum1);
            long res2 = mul/y;
            long sum2 =0;
            while(res2>0){
                long mod2 = res2%10;
                sum2 = sum2+mod2;
                res2 = res2/10;
            }
            System.out.println("sum 0f second half of the integer : "+sum2);
        }
    }
}