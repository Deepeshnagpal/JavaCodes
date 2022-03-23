public class JavaLoops {
    public static void main(String[] args) {
loopsPrint(3);
    }

    public static void loopsPrint(int n){
        int result = 0;
        for(int i =1 ; i<= 10; i++){
          result = n*i;
            System.out.println(n+"x"+i+"="+result);
        }
    }
}
