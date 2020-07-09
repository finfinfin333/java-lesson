public class J23Q3 {
    public static void main(String[] args){

        J23Q3 inst;
        int ans = 0;

        inst = new J23Q3();

        try {
            ans = inst.jouzan(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        } catch (Exception e) {
            System.out.println("数値ではない値が渡されました。");
        }
        
        System.out.println("数値1["+ args[0] +"]");
        System.out.println("数値2["+ args[1] +"]");
        System.out.println("乗算結果["+ ans +"]");
    }

    private int jouzan(int num1,int num2){
        return (num1 * num2);
    }

}