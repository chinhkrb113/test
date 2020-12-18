
package excercise6;

import java.util.Scanner;
public class run {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        do{
        System.out.println("Nhập:\n"
                + "1. để chạy bài tập 1\t "
                + "2. để chạy bài tập 2\t "
                + "\n3. để chạy bài tập 3\t "
                + "4. để chạy bài tập 4\t "
                + "\n5. để chạy bài tập 5\t "
                + "0. để dừng ");
        System.out.print("Lệnh bạn chọn là: ");
        n = scanner.nextInt();
        switch(n){
            case 0: System.out.println("Đã dừng chương trình."); break;
            case 1: new Baitap1(); break;
            case 2: new Baitap2(); break;
            case 3: new Baitap3(); break;
            case 4: new Baitap4(); break;
            case 5: new Baitap5(); break;
    }}while( n !=0);
    }
}
