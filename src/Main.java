import java.util.Scanner;
import method.Calculator;

public class Main {
    public static void main(String[] args) {

        // 스캐너 생성
        Scanner scanner = new Scanner(System.in);

        // 반복문 생성
        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char c = scanner.next().charAt(0);

            Calculator cal = new Calculator();

            // 결과값 출력 전 정상적인 연산인지 검증
            if (c != '+' && c != '-' && c != '*' && c != '/')
                System.out.println("잘못된 사칙연산 기호입니다.");
            else if (b == 0 && c == '/')
                System.out.println("0으로는 나눌 수 없습니다.");

            // 정상적인 연산일 경우 결과 출력
            else
                System.out.println("결과: " + cal.calculate(a, b, c));


            // 반복문 종료 여부 확인
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = scanner.next();
            if (exit.equals("exit")) {
                break;
            }

        }
    }
}