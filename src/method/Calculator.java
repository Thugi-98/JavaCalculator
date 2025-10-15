package method;

public class Calculator {

    int a;
    int b;
    char c;

    public int calculate(int a, int b, char c) {

        this.a = a;
        this.b = b;
        this.c = c;

        return switch (c) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
    }
}
