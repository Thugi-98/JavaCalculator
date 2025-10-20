import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        /* Calculator 인스턴스 생성 */
        Calculator cal = new Calculator();

        /* 스캐너 생성 */
        Scanner scan = new Scanner(System.in);

        int exitCode = 0;

        /* 반복문 시작 */
        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = scan.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = scan.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char c = scan.next().charAt(0);

            /* 결과값 출력 전 정상적인 연산인지 검증 */
            if (c != '+' && c != '-' && c != '*' && c != '/')
                System.out.println("잘못된 사칙연산 기호입니다.");
            else if (b == 0 && c == '/')
                System.out.println("0으로는 나눌 수 없습니다.");

            /* 정상 연산일 경우, 결과 출력 및 컬렉션에 결과값 저장 */
            else {
                System.out.println("결과: " + cal.calculate(a, b, c));
                cal.setResult(cal.calculate(a, b, c));
            }

            /* 반복문 종료 여부 확인 */
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String command = scan.next();

            switch (command) {
                /* 반복문 종료 */
                case "exit" -> exitCode = 1;

                /* 컬렉션 확인 후 삭제 */
                case "remove" -> {
                    System.out.print("삭제 전: ");
                    cal.getResult();
                    System.out.print("삭제 후: ");
                    cal.removeResult();
                    cal.getResult();
                }
            }

            if (exitCode == 1)
                break;

        }
    }
}