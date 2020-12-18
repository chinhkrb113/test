//viết chương trình java liệt kê tất cả các số nguyên tố có 5 chữ số và tính tổng
package excercise6;

public class Baitap5 {
    public Baitap5(){
        System.out.println("chương trình java liệt kê tất cả các số nguyên tố "
                + "có 5 chữ số và tính tổng");
        int count =0;
        System.out.println("Liệt kê tất cả các số nguyên tố có 5 chữ số: ");
        for( int i = 10001 ; i < 99999 ; i++ ){
            if(Tinh(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Tổng các số nguyên tố có 5 chữ số là: " + count);
    }
    
    public static boolean Tinh(int n){
        if( n < 2 ) return false;
        int SquareRoot = ( int ) Math.sqrt(n);
        for( int i = 2 ; i <= SquareRoot ; i++){
        if( n%i == 0) return false;
        }
    return true;              
    }   
}
