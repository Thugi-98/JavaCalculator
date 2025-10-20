public enum OperatorType {

    sum('+') {
        public int calculate(int a, int b) {
            return a + b;
        }
    },
    sub('-') {
        int calculate(int a, int b) {
            return a - b;
        }
    },
    mul('*') {
        int calculate(int a, int b) {
            return a * b;
        }
    },
    div('/') {
        int calculate(int a, int b) {
            /* 0으로 나눌 경우 예외 발생 */
            if(b == 0) throw new IllegalArgumentException("0으로는 나눌 수 없습니다.");
            return a / b;
        }
    };

    /* operator 불변 선언 */
    private final char operator;

    /* 기본 생성자 */
    OperatorType(char operator) {
        this.operator = operator;
    }

    /* 연산자 별 활동 주기 */
    abstract int calculate(int a, int b);

    /* 입력된 문자로 연산 방법 탐색 */
    public static OperatorType fromType(char operator) {
        for (OperatorType op : OperatorType.values()) {
            if (op.operator == operator) return op;
        }
        /* 일치하는 연산자가 없을 경우 예외 발생 */
        throw new IllegalArgumentException("잘못된 사칙연산 기호입니다.");
    }

}