package lambda;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Stepik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sender = scanner.nextLine();
        String receiver = scanner.nextLine();
        String signature = scanner.nextLine();

        Function<String, String> emailFormatter = text -> text.concat("|").concat(text) ; // modify the lambda expression

        System.out.println(emailFormatter.apply(scanner.nextLine()));
    }
}