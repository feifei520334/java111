import java.util.Scanner;

public class task12 {


    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0.0;
        for (double[] row : m) {
            sum += row[columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];

    
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("Sum of the elements at column 0 is " + sumColumn(matrix, 0));
        System.out.println("Sum of the elements at column 1 is " + sumColumn(matrix, 1));
        System.out.println("Sum of the elements at column 2 is " + sumColumn(matrix, 2));
        System.out.println("Sum of the elements at column 3 is " + sumColumn(matrix, 3));

        input.close();
    }
}