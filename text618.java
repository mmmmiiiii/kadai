import java.util.Scanner;

public class text618{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("配列の行数とそれぞれの行の要素数、要素を指定してください。");
        int[][] c;
        System.out.print("行数: "); int n = stdIn.nextInt();
        c = new int[n][];

        for(int i = 0; i < n; i++){
            System.out.print(i + "行目の要素数: "); int m = stdIn.nextInt();
            c[i] = new int[m];
            for (int j = 0; j < m; j++) {
                System.out.print("c[" + i + "][" + j + "] = ");
                c[i][j] = stdIn.nextInt();
            }
        }
        System.out.println("配列を表示します。");

        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++)
                System.out.printf("%3d", c[i][j]);
            System.out.println();
        }
    }
}