import java.util.Arrays;
import java.util.Random;

public class task14 {
    
    public static void shuffle(int[][] m) {
        int rows = m.length;
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            
            int j = random.nextInt(rows);
        
            for (int k = 0; k < m[i].length; k++) {
                int temp = m[i][k];
                m[i][k] = m[j][k];
                m[j][k] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        
        shuffle(m);

        
        System.out.println("Shuffled matrix:");
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }
}
