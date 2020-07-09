import java.util.Scanner;

public class J7Q1 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
 
        if (num >= 0){
            System.out.printf("変数%dは正の数です。", num);
        }
        else{
            System.out.printf("変数%dは負の数です。", num);
        }
        scan.close();
    }

}