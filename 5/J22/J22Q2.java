public class J22Q2 {
    public static void main(String args[]){
        Syain2 s2 = new Syain2(2, "開発", "もえ", 2000000);

        System.out.println("社員番号[" + s2.getnum() + "]");
        System.out.println("部署名[" + s2.getbusyo() + "]");
        System.out.println("名前[" + s2.getname() + "]");
        System.out.println("基本給[" + s2.getmoney() + "]");
    }

}