import java.util.Arrays;

public class E9 {
    public static void main(String[] args) {
        int[][] numArray3 = new int[][]{{1, 7, 6, 5, 9}, {2, 7, 6, 3, 4}};
        for (int i = 0; i < 5; i++) {
            if (numArray3[1][i] == numArray3[0][i]) {
                System.out.println("["+numArray3[0][i]+"]"+" ["+numArray3[1][i]+"]");
            }
        }
    }
}
