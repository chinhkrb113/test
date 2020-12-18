//viết chương trình java tìm n dãy số Fibonacci đầu tiên
package excercise6;

import java.util.Scanner;

public class Baitap2 {
    
    public static Scanner scanner = new Scanner(System.in);
    public Baitap2(){
        System.out.println("chương trình java tìm n dãy số Fibonacci đầu tiên");
        System.out.print("Nhập số nguyên dương n ( n > 0): n = ");
        int n = scanner.nextInt();
        while( n < 0){
        System.out.println("Bạn nhập sai mời nhập lại.");
        System.out.print("Nhập số nguyên dương n (n > 0): n = ");
        n = scanner.nextInt();
        }
        System.out.println(n + " số đầu tiên của dãy số fibonacci:");
        for(int i = 0 ; i < n -1; i++){
            System.out.print(Fibonacci(i) +", ");
        } 
        System.out.print(Fibonacci(n-1) +"\n");
    }
    
    public static int Fibonacci(int n){
        if( n == 0 || n == 1) return n;       
        else return + Fibonacci(n - 1) + Fibonacci(n - 2);  
    }   
}
