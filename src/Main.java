import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 스캐너와 결과 변수 생성
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        // 반복문 생성
        for (int i = 0; i >= 0; i++) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char c = scanner.next().charAt(0);

            // 사칙연산 기호에 따른 결과값 계산
            switch(c) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if(b == 0) { System.out.println("오류입니다."); }
                    result = a / b;
                    break;

                // 정상적인 사칙연산 기호가 아닐 경우
                default:
                    System.out.println("오류입니다.");
                    break;
            }

            // 결과값 출력
            System.out.println("결과: " + result);

            // 반복문 종료 여부 확인
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = scanner.next();
            if (exit.equals("exit")) {
                break;
            }

        }
    }
}