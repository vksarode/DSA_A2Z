package sorting;

public class TwoDArrayZeros {
    public static void main(String[] args) {

        TwoDArrayZeros obj = new TwoDArrayZeros();
        int[][] matrix = { { 0,1,2,0 }, { 3,4,5,2 },{1,3,1,5} };
        int n= matrix.length;
        int m= matrix[0].length;



        obj.setZeroes(matrix);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = -1;
                    matrix[0][j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == -1) {
                for (int j = 0; j < m; j++) {
                    if(i != 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == -1) {
                for (int i = 0; i < n; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < m; j++) {

                        matrix[i][j] = 0;

                }
            }
        }

    }
}
