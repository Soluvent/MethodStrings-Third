import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    // ЗАДАНИЕ 1
    // Метод, який приймає рядок та повертає true, якщо рядок закінчується на «ed»
    public static void task1() {
        System.out.println("\n=== ЗАДАНИЕ 1 ===");
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        boolean result = text.endsWith("ed");
        System.out.println("Результат: " + result);
    }

    // ЗАДАНИЕ 2
    // Метод, який приймає рядок та повертає суму цифр
    public static void task2() {
        System.out.println("\n=== ЗАДАНИЕ 2 ===");
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        int total = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) {
                total += Character.getNumericValue(c);
            }
        }
        System.out.println("Сумма цифр: " + total);
    }

    //  ЗАДАНИЕ 3
    // Метод, який приймає рядок і повертає довжину найдовшого «блоку» символів
    public static void task3() {
        System.out.println("\n=== ЗАДАНИЕ 3 ===");
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        if (text.isEmpty()) {
            System.out.println("Длина самого длинного блока: 0");
            return;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(i - 1)) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }

        System.out.println("Длина самого длинного блока: " + maxLength);
    }

    //  ЗАДАНИЕ 4
    // Метод, який приймає рядок і виводить у консоль знайдені слова
    public static void task4() {
        System.out.println("\n=== ЗАДАНИЕ 4 ===");
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        String[] words = text.split("\\s+");
        System.out.println("Слова:");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }
    }

    //  ЗАДАНИЕ 5
    // Метод, який приймає два рядки (A і B) і повертає рядок по черзі з їхніх знаків
    public static void task5() {
        System.out.println("\n=== ЗАДАНИЕ 5 ===");
        System.out.print("Введите первую строку: ");
        String strA = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String strB = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        int maxLen = Math.max(strA.length(), strB.length());

        for (int i = 0; i < maxLen; i++) {
            if (i < strA.length()) {
                result.append(strA.charAt(i));
            }
            if (i < strB.length()) {
                result.append(strB.charAt(i));
            }
        }

        System.out.println("Результат: " + result.toString());
    }

    public static void showMenu() {
        System.out.println("=".repeat(52));
        System.out.println("1. Задание 1 - Проверка окончания на 'ed'");
        System.out.println("2. Задание 2 - Сумма цифр в строке");
        System.out.println("3. Задание 3 - Длина самого длинного блока символов");
        System.out.println("4. Задание 4 - Вывод слов из строки");
        System.out.println("5. Задание 5 - Чередование символов двух строк");
        System.out.println("0. Выход");
        System.out.println("=".repeat(52));
    }

    public static void main(String[] args) {
        while (true) {
            showMenu();
            System.out.print("Выберите задание (0-5): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    task1();
                    break;
                case "2":
                    task2();
                    break;
                case "3":
                    task3();
                    break;
                case "4":
                    task4();
                    break;
                case "5":
                    task5();
                    break;
                case "0":
                    System.out.println("\nПрограмма завершена.");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nОшибка! Выберите число от 0 до 5.");
            }

            System.out.print("\nНажмите Enter для продолжения...");
            scanner.nextLine();
        }
    }
}