package method;

import java.util.ArrayList;

public class Calculator {

    /* 결과값을 저장하는 컬렉션 생성 */
    private ArrayList<Integer> record = new ArrayList<>();

    /* 사칙연산 수행 후 결과값을 반환하는 메서드 구현 */
    public int calculate(int a, int b, char c) {

        int result = 0;

        switch (c) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
        }

        return result;
    }

    public void removeResult() {
        record.remove(0);
    }

    public void getResult() {
        System.out.println(record);
    }

    public void setResult(int result) {
        record.add(result);
    }
}
