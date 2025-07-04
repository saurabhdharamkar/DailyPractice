public class MatrixCount {

    public static void main(String[] args) {

        int [][] matrix={{1,1,0},{0,1,0},{0,0,1}};

        int one=0;
        int zero=0;

        for (int [] arr:matrix){
            for(int num:arr){
                if(num==0){
                    ++zero;
                }else if(num==1){
                    ++one;
                }
            }
        }
        System.out.println(one);
        System.out.println(zero);
    }
}
