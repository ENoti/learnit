import testingsystem.TestAPI;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Привет! Это демоверсия системы тестов, где нужно расставить слова " +
                "в предложении в правильном порядке. В случае успешного прохождения теста, разрешается перейти " +
                "к следующей теме.");

        while (true){
            System.out.println("""
                    Команды:
                    /test - начать тест
                    /putNewTest - предполагается наличие права доступа
                    /exit - выйти""");
            int ourID = 5;          //идентификатор пользователя, проходящего тест
            switch (in.nextLine()) {
                case "/test" -> TestAPI.startTest(ourID);
                case "/putNewTest" -> {
                    System.out.println("Номер темы добавляемого теста и путь через пробел:");
                    int lesson_id = in.nextInt();
                    String path = in.nextLine().trim();
                    try {
                        TestAPI.putNewTest(lesson_id, path);
                    } catch (IOException | SQLException e) {
                        System.out.println("Что-то пошло не так");
                    }
                }
                case "/exit" -> {
                    in.close();
                    return;
                }
            }
        }
    }
}
