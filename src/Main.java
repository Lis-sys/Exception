import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин:");
        String login = scanner.nextLine();

        System.out.println("Введите пароль:");
        String password = scanner.nextLine();

        System.out.println("Подтвердите пароль:");
        String confirmPassword = scanner.nextLine();

        try {
            System.out.println(validate(login, password, confirmPassword));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            System.out.println(false);
        }
    }

    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || !login.matches("\\w*")) {
            throw new WrongLoginException("Неверный логин");
        }

        if (password.length() > 20 || !password.matches("\\w*") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Неверный пароль");
        }

        return true;
    }
}

class WrongLoginException extends Exception {
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
