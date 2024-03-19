package dividedbyzero;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.out.printf("捕获的运行时异常：%s\n", e.getMessage());
        }
	}

}
