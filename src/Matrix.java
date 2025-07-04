public class Matrix {
    public static void main(String[] args) {

        int [][] matrix={
                {1,4,7},{4,5,6},{7,5,3}
        };

        int len= matrix.length;

        int length=matrix[0].length;
        System.out.println("Length : "+length);

        int sum=0;


        for(int i=0;i<len;i++){
            for(int j=0;j<matrix[i].length;j++){
                sum+=matrix[i][j];
            }
            System.out.println(sum);
        }
    }
}
