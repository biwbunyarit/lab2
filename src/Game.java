import java.util.Scanner;

public class Game {
    private static OX ox;
    private static Scanner sc = new Scanner(System.in);
    private static int col ;
    private static int row ;


    public static void main(String[] args){
        ox = new OX();
        while(true){
            printtable();
            input();
            ox.switchPlayer();
        }
    }

    private static void input() {
        boolean canPut = true;
        do {
            System.out.println(ox.getCurrentPlayer() + " Col :");
            col = sc.nextInt();
            System.out.println(ox.getCurrentPlayer() + " Row :");
            row = sc.nextInt();
            canPut = ox.put(col, row);
            if (!canPut) {
                System.out.println("Please input number between 0-2 ");
            }
        }while (!canPut);
    }

    private static void printtable() {
        System.out.print(ox.getTableString());
    }
}
