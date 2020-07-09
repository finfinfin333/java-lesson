import java.util.Scanner;

public class J23Q1 {

    public int jouzan(int num1, int num2){
        return num1 * num2;
    }

    public static void main(String args[]){
        J23Q1 inst = new J23Q1();
        int ans;

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        System.out.println("数値1[" + num1 + "]");
        int num2 = scan.nextInt();
        System.out.println("数値1[" + num2 + "]");
        ans = inst.jouzan(num1, num2);
        System.out.println("乗算結果[" + ans + "]");
    }

}