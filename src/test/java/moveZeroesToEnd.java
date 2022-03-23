public class moveZeroesToEnd {
    public static void main(String[] args) {
        //firstSolution();
        secondSolution();
    }
        //first solution
        public static void firstSolution() {
            int[] arr = {0,1,0,3,12};
            for(int i=0, j=0 ; i<arr.length && j<arr.length; j++){
                if(arr[j]!=0){
                    int temp = arr[i];
                    arr[i++] = arr[j];
                    arr[j] = temp;
                }
            }
            for(int k =0 ; k<arr.length; k++){
                System.out.println(arr[k]);
            }
        }


        //second solution
      public static void secondSolution(){
          int[] arr = {0,1,0,3,12};
        int index = 0;
        for(int i =0 ; i<arr.length; i++){
            if(arr[i]!=0){
                arr[index++] = arr[i];
            }
        }
        for(int i = index ; i<arr.length; i++){
            arr[i] =0;
        }
          for(int k =0 ; k<arr.length; k++){
              System.out.println(arr[k]);
          }

      }
    }

