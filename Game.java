import java.util.Scanner;

public class Game {
    private Scanner sc = new Scanner(System.in);
    public Game(String choosenType){
        this.startNewGame(choosenType);
    }

    public void startNewGame(String choosenType){
        if(choosenType.equals("a")){
            Photo ph1 = new Photo();
            sc.close();
        } else if(choosenType.equals("b")){
            Apple appleToApple = new Apple();
            sc.close();
        } else if(choosenType.equals("c")){
            Butterfly butfly = new Butterfly();
            sc.close();
        } else{
            System.out.print("please type a b or c: ");
            this.startNewGame(sc.nextLine());
        }
    }
}
