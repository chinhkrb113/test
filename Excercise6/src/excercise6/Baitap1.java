//viết chương trình java giải pt bậc 2

package excercise6;

import java.util.Scanner;

public class Baitap1 { 

    public static Scanner scanner = new Scanner(System.in);
    public Baitap1(){
        System.out.println("chương trình java giải pt bậc 2");
        System.out.print("Nhập hệ số bậc 2, a = ");
        float a = scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = scanner.nextFloat();
        Giaipt(a, b, c);
        }  
    
    public static void Giaipt(float a, float b, float c){
        if( a == 0 ){
            if( b == 0){
                System.out.println("Phương trình vô nghiệm.");
            } else {
                System.out.println("Phuơng trình có một nghiệm: x = " + (-c/b));
            }
            return;
        }
        float delta= b*b - 4*a*c ;
        float x1, x2;
        if(delta > 0){
            x1 = (float) ((-b + Math.sqrt(delta))/ (a*2));
            x2 = (float) ((-b - Math.sqrt(delta))/ (a*2));
            System.out.println("Phương trình có 2 nghiệm là:"
                    + "x1 = " + x1 +" x2 = " +x2);
        }else {
            if(delta == 0 ){
            x1 = ( -b/2*a);
            System.out.println("Phương trình có nghiệm kép là:"
                    + "x1 = x2 = " + x1);
            }else System.out.println("Phương trình vô nghiệm");
        }
    }
}
