import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DancingMan dancingMan = new DancingMan();

        System.out.println("Write the number of test cases:");
        int numOfTestCases = scanner.nextInt();
        System.out.println("Write the number of commands:");
        int numOfCommands = scanner.nextInt();

        String command = scanner.nextLine();

        for(int index = 0; index < numOfCommands; index++) {
            command = scanner.nextLine();

            if (command.contains("say")) {
                dancingMan.say(command);
            } else if (command.contains("turn")) {
                dancingMan.turn();
            } else{
                dancingMan.dance(command);
            }
        }
    }
}
