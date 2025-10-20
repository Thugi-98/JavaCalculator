package method;

import java.util.ArrayList;

public class Calculator {

    int a;
    int b;
    char c;

    private static ArrayList<Integer> record = new ArrayList<>();

    public int calculate(int a, int b, char c) {

        this.a = a;
        this.b = b;
        this.c = c;

        int result;

        switch (c) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            default -> result = 0; /* 사칙연산 기호가 아닐 경우에도 반환되는 값은 존재해야 함 */
        }

        record.add(result);

        return result;
    }

    public void removeResult() {
        record.remove(0);
    }

    public void getResult() {
        System.out.println(record);
    }

    public void setResult() {
        record.add(0);
    }
}
