import java.util.Scanner;

public class file{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("a.The Photographer b.apple and apple c.the butterfly \nchoose a mad libs: ");
        String choosenType = sc.nextLine().toLowerCase();
        Game g1 = new Game(choosenType);
        sc.close();
    }
}