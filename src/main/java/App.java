import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter the length of your rectangle:");
    int intLength = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter the width of your rectangle:");
    int intWidth = Integer.parseInt(myConsole.readLine());
    Rectangle rectangle = new Rectangle(intLength, intWidth);
    boolean squareResult = rectangle.isSquare();
    System.out.println("Is your rectangle a square, too?: " + squareResult);
  }
}
