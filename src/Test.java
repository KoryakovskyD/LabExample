import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] a = new int[3][4];



        for (int i = 0; i< a.length; i++) {
            for (int j = 0; j<a[i].length; j++) {
                a[i][j] = j*2;
            }
        }

        System.out.println(Arrays.deepToString(a));


        int aa = 4;
        short b = (short) aa;

        short r = 12;
        int result = aa;
        System.out.println(aa);

    }
}
