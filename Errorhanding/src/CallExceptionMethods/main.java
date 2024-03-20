package CallExceptionMethods;

public class Main {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("结果: " + result);
        } catch (ArithmeticException e) {
            System.out.println("捕获到算术异常：" + e.getMessage()); // 显示错误信息
        }
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("不能除以零");
        }
        return dividend / divisor;
    }
}