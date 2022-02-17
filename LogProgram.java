import java.util.Scanner;

class LogProgram {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.print("How long are the logs: ");
    String lenLogsString = myObj.nextLine();
    float lenLogsFloat = Float.parseFloat(lenLogsString);
    float numLogs = 1100 / (20 * lenLogsFloat);
    System.out.println("You can fit " + numLogs + " logs on the truck");
  }
}
