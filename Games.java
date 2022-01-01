import java.util.Scanner;

public class Games {
    public Scanner sc = new Scanner(System.in);
    public String getTheInput(String something){
        System.out.print("enter " + something + " :");
        return this.sc.nextLine();
    }
}
