import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        int [][] array = new int [3][3];
        Scanner input=new Scanner(System.in);
for(int row=0;row<array.length;row++){
    for(int colum=0;colum<array[0].length;colum++){
        array[row][colum]=input.nextInt();
    }
}
System.out.println(array[2][2]);
input.close();
    }
}
