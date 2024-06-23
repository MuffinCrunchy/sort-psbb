import java.util.*;
import java.util.stream.Collectors;

import static Methods.SortChar.sortChar;
import static Methods.PSBB.psbb;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("""
                    Choose Problem:
                    1. Sort Character
                    2. PSBB
                    3. Exit""");
            System.out.printf("Enter your choice: ");
            String choice = userInput.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Input one line of words (S): ");
                    String str = userInput.nextLine();
                    List<String> sortedX = sortChar(str);
                    System.out.printf("Vowel Characters: %s%nConsonant Characters: %s%n", sortedX.get(0), sortedX.get(1));
                    break;
                case "2":
                    System.out.print("Input the number of families: ");
                    int fam = Integer.parseInt(userInput.nextLine());
                    System.out.print("Input the number of members in the family (separated by a space): ");
                    String memInp = userInput.nextLine();
                    List<Integer> mem = Arrays.stream(memInp.split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
                    int busX = psbb(mem, fam);
                    if (busX == -1) {
                        System.out.println("Input must be equal with count of family");
                    } else {
                        System.out.printf("Minimum bus required is : %d%n", busX);
                    }
                    break;
                case "3":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println();
        }
    }
}