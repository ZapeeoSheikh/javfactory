import java.util.Scanner;
// Multiplication of two matrix

public class multidimensional_multiply_07 {
    public static void main(String[] args) {
        Scanner zap = new Scanner(System . in);
        System.out.println(" Enter the Dimension of Matrix 01 : ");
        int rows = zap.nextInt();
        int cols = zap.nextInt();

        System.out.println(" Enter the Dimension of Matrix 02 : ");
        int rows2 = zap.nextInt();
        int cols2 = zap.nextInt();

        int [][] a = new int [rows][cols];
        int [][] b = new int [rows2][cols2];
        int [][] c = new int [rows][cols2];

    if (cols != rows2 ){
        System.out.println(" Maltiplication Doesn't Exist ");
        System.exit(0);
    }
        System.out.println(" Enter the entities of Matrix 01 : ");
    for (int i = 0; i <= rows-1; i++){
       for (int j = 0; j <= cols-1; j++){
        a[i][j] = zap.nextInt();
      }
    }
        System.out.println(" Enter the entities of Matrix 02 : ");
    for (int ii = 0; ii <= rows2-1; ii++){
       for (int jj = 0; jj <= cols2-1; jj++){
        b[ii][jj] = zap.nextInt();
      }
    }


        for (int ii = 0; ii <= rows-1; ii++){
            for (int jj = 0; jj <= cols2-1; jj++){
                for (int k = 0; k <= cols-1; k++){
                    c[ii][jj] += a[ii][k]*b[k][jj];

            }
        }}
        System.out.println(" The Multiplication of Matrix 1 and Matrix 02 is : ");
        for (int ii = 0; ii <= rows-1; ii++){
            for (int jj = 0; jj <= cols2-1; jj++){
                System.out.print(c[ii][jj] + " ");

            }
            System.out.println("");
        }

//     Muhammad Rameez
//       0090-Bscs-20
//     Government College University Lahore


    }
}
