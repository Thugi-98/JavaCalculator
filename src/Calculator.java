import java.util.ArrayList;

public class Calculator {

    /* 결과값을 저장하는 컬렉션 생성 */
    private ArrayList<Integer> record = new ArrayList<>();

    /* 사칙연산 수행 후 결과값을 반환하는 메서드 구현 */
    public int calculate(int a, int b, char c) {

        /* 결과값을 출력할 result 변수 생성 */
        int result = 0;

        /* 어떤 사칙연산인지 확인 후 결과값 저장 */
        switch (c) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
        }

        /* 결과값 반환 */
        return result;
    }

    /* 컬렉션에서 가장 먼저 저정된 데이터 삭제 기능 */
    public void removeResult() {
        record.remove(0);
    }

    /* 연산 결과 컬렉션 가져오기 기능 */
    public void getResult() {
        System.out.println(record);
    }

    /* 연산 결과 컬렉션에 저장하는 기능 */
    public void setResult(int result) {
        record.add(result);
    }
}
