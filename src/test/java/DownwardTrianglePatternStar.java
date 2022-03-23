public class DownwardTrianglePatternStar {
    public static void main(String[] args) {
        int n =5;
        int j;

        for(int i =n-1; i>=0 ; i--){

            for(j = 0 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
