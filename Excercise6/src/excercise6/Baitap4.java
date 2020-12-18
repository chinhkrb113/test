////viết chương trình java liệt kê tất cả các số nguyên tố nhỏ hơn n
package excercise6;

import java.util.Scanner;

public class Baitap4 {
    
    public static Scanner scanner = new Scanner(System.in);
    public Baitap4(){
System.out.println("chương trình java liệt kê tất cả các số nguyên tố nhỏ hơn n");
        System.out.print("Nhập n (n > 0) = ");
        int n = scanner.nextInt();
        while( n <= 0 ){
            System.out.println("Bạn nhập sai mời nhập lại.");
            System.out.print("Nhập n (n > 0) = ");
            n = scanner.nextInt();
        }
        if(n < 2) System.out.println("Không có số nguyên tố nào nhỏ hơn "+ n);
        else{
            System.out.println("Tất cả các số nguyên tố nhỏ hơn " + n + " là:");
            for(int i = 2; i < n ; i += 1){
                if(Tinh(i)) System.out.print(i + " ");
            }
        } System.out.println("");       
    }
    
    public static boolean Tinh( int n){
        int SquareRoot = ( int) Math.sqrt(n);
        for( int i = 2; i <= SquareRoot ; i++){
            if( n%i == 0) return false;
        }
        return true;
    }
}
