
 public class task3 {
    public static void main(String[] args) {
        int [][] array = new int [3][3];
for(int row=0;row<array.length;row++){
    for(int colum=0;colum<array[0].length;colum++){
        array[row][colum]=(int) (Math.random() * 20);
    }
}
System.out.println(array[2][2]);
}
 }