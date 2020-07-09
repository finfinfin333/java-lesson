public class J26Q3 {
    public static void main(String args[]) {
        KeyboardInput input;
        input = new KeyboardInput();
        int num1, num2, tmp, n;
        String a;
        int ans = 0;

        try {
            System.out.println("１つ目の数値を入力してください。");
            a = input.inputKeyboard();
            num1 = Integer.parseInt(a);
            System.out.println("２つ目の数値を入力してください。");
            a = input.inputKeyboard();
            num2 = Integer.parseInt(a);

            if (num1 > num2) {
                tmp = num1;
                num1 = num2;
                num2 = tmp;
            }

            n = num1;

            for (ans = 0; n <= num2; n++) {
                ans += n;

            }
            System.out.println("[" + num1 + "]から" + "[" + num2 + "]までの合計：" + ans);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("数値以外が縫う力されました");
        }

    }

}