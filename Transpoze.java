import java.util.Arrays;

public class Transpoze {
    public static void main(String[] args) {

        int[][] arr = {
                {5, 7, 11, 2},
                {4, 6, 8, 10},
                {13, 16, 18, 21}
        };
        int[][] arr2 = new int[4][3];
        for (int i = 0; i<arr.length; i++) {
            for (int k = 0; k<arr[i].length; k++) {

                System.out.print(arr[i][k]+" ");
            }
            System.out.println();
        }
        System.out.println("=========TRANSPOZE========");
        for (int i = 0; i<arr2.length; i++) {
            for (int k = 0; k<arr2[i].length; k++) {

            arr2[i][k] = arr[k][i];
                System.out.print(arr2[i][k]+" ");
            }
            System.out.println();
        }
    }

}
