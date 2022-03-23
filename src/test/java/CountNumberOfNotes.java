import java.util.Scanner;

public class CountNumberOfNotes {
    public static void main(String[] args) {
        int notes[] = new int[] {2000, 500, 200, 100, 50,20,10, 5,1};
        int notesCount =0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of notes :");
        int amount = sc.nextInt();

        for(int i=0; i<notes.length ; i++){
            while(amount >=notes[i]){
            notesCount = amount / notes[i];
            System.out.println(notes[i] +"notes are :"+ notesCount);
            amount = amount % notes[i];
            count +=notesCount;}
        }

        System.out.println("no. of notes: "+count);


    }
}
