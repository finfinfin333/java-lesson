public class J7Q9 {
    public static void main(String[] args) {
        int[] seiseki = { 57, 60, 89, 32, 66, 77, 92, 45 };
        int max = 0, min = 100;
        int i = 0;

        while (i < seiseki.length) {
            if (max < seiseki[i]) {
                max = seiseki[i];
            }
            if (min > seiseki[i]) {
                min = seiseki[i];
            }
            i++;
        }
        System.out.printf("最高点は%dです\n", max);
        System.out.printf("最低点は%dです\n", min);
    }

}