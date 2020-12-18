//viết chương trình java tìm USCLN và BSCNN của 2 số nguyên dương
package excercise6;

import java.util.Scanner;

public class Baitap3 {
    
    public static Scanner scanner = new Scanner(System.in);
    public Baitap3(){
        System.out.println("chương trình java tìm USCLN và BSCNN của 2 số nguyên dương");
        int c,d;
        System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        while( a < 0 ){
            System.out.println("Bạn nhập sai mời nhập lại.");
            System.out.print("Nhập số nguyên dương a = ");
            a = scanner.nextInt();
        }
        System.out.print("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();
        while( b < 0 ){
            System.out.println("Bạn nhập sai mời nhập lại");
            System.out.print("Nhập số nguyên dương b =");
            b = scanner.nextInt();
        }
        c = UCLN(a,b);
        d = (a*b)/c;
        System.out.println("USCLN của " + a + " và " + b + " là: " + c );
        System.out.println("BSCNN của " + a + " và " + b + " là: " + d );
    }
    
    public static int UCLN( int a, int b){
        if(a == 0 || b == 0) return a;
        while( a != b){
            if( a > b ) a-=b;
            else b-=a;
        }
        return a;        
    }
}
