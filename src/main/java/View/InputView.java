package View;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static int getInt(){
        int result = Integer.parseInt(scanner.nextLine());
        return result;
    }
}
