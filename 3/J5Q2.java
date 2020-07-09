public class J5Q2 {
    public static void main (String [] args){
        int[] tbl;
        tbl = new int[4];
        tbl[0] = 100;
        tbl[1] = 200;
        tbl[2] = tbl[0] + tbl[1];
        tbl[3] = tbl[2] * 2;
        System.out.println(tbl[3]);

    }

}