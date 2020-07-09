public class AisatsuThread1 extends Thread{
    AisatsuThread1(String name){
        super(name);
    }

    public void run(){
        for(int i = 0; i < 20; i++){
            System.out.println(this.getName() + ":" + i);
        }
    }

}