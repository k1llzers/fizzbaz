import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FIzzBuzz();

    }
    private static void FIzzBuzz(){
        boolean victory=true;
        int i=1;
        while (victory){
            if(i%3!=0&&i%5!=0) System.out.println(i);
            else{
                if(i%3==0&&i%5!=0) System.out.println("FyCS");
                if(i%5==0&&i%3!=0) System.out.println("Race");
                if(i%5==0&&i%3==0) System.out.println("FyCs Race");
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number: ");
            String n = input.nextLine();

            if((i+1)%3!=0&&(i+1)%5!=0) {
                if (Integer.parseInt(n) != (i + 1)) victory = false;
            }
            else{
                if((i+1)%3==0&&(i+1)%5!=0)
                    if(!n.equals("FyCS")) victory=false;
                if((i+1)%5==0&&(i+1)%3!=0)
                    if(!n.equals("Race"))
                        victory=false;
                if((i+1)%5==0&&(i+1)%3==0) {
                    if (!n.equals("FyCS Race"))
                        victory = false;
                }
            }i+=2;
        }
        if(!victory) System.out.println("You LOSE!!!!!!!!!");
    }
}