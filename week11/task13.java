import java.util.Random;

public class task13 {
    public static void main(String[] args) {
        int maxcount=0;
        int maxrow =0;
        int maxcolum =0;
        Random random = new Random();
        int [][] array = new int [4][4];
for(int row=0;row<array.length;row++){
    for(int colum=0;colum<array[0].length;colum++){
        array[row][colum]=random.nextInt(2);
    }
}
for(int i = 0;i<array.length;i++){
    for(int j=0;j<array[0].length;j++)
    System.out.println(array[i][j]  +" ");
}
for(int i=0;i<array.length;i++){
    int count =0;
    for(int j=0;j<array[0].length;j++){
        if(array[i][j]==1){
        count++;
        }
    }
    if(count>maxcount){
        maxcount=count;
        maxrow=i;
    }
}
for (int j = 0; j < array[0].length; j++) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i][j] == 1) {
            count++;
        }
    }
    if (count > maxcount) {
        maxcount = count;
        maxcolum = j;
    }
}

System.out.println("The largest row index: " + maxrow);
System.out.println("The largest column index: " + maxcolum);
    }
}
