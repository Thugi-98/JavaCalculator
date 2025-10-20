import java.util.Scanner;

public class ArithmeticCalculator {

    /* 계산하고 결과값을 반환하는 메서드 생성 */
    public int calculate(int x, int y, OperatorType operator) {
        return operator.calculate(x, y);
    }

    public static void main(String[] args) {

        /* 기본 인스턴스 생성 */
        ArithmeticCalculator calc = new ArithmeticCalculator();

        /* 스캐너 생성 */
        Scanner sc = new Scanner(System.in);

        /* 반복문 시작 */
        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char c = sc.next().charAt(0);

            /* 예외 발생 체크 */
            try {
                OperatorType op = OperatorType.fromType(c);
                int result = calc.calculate(a, b, op);
                System.out.println("결과: " + result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            /* 반복문 종료 여부 확인 */
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String command = sc.next();

            if (command.equals("exit")) break;

        }

    }

}