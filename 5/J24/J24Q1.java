
public class J24Q1 {
    public static void main(String args[]) {
        AisatsuThread1 Thread1, Thread2;
        Thread1 = new AisatsuThread1("おはよう");
        Thread2 = new AisatsuThread1("こんにちは");

        Thread1.start();
        Thread2.start();
    }

}