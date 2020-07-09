import java.util.Scanner;

public class J7Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int token = scan.nextInt();

        if (token >= 80) {
            System.out.println("優です。");
        } else if (token >= 65) {
            System.out.println("良です。");
        } else if (token >= 50) {
            System.out.println("可です。");
        } else {
            System.out.println("不可です。");
        }

    }
}