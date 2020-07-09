public class J26Q1 {
    public static void main(String args[]){

        KeyboardInput input;
        input = new KeyboardInput();
        String name, num;

        System.out.println("名前を入力してください。");
        name = input.inputKeyboard();
        System.out.println("回数を入力してください。");
        num = input.inputKeyboard();

        System.out.println("***今から表示します***");
        for(int i = 0; i < Integer.parseInt(num); i++){
            System.out.println(name);
        }
        System.out.println("***表示を終了しました***");
    }

}