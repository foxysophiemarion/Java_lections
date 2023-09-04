
class Calculator {
	public int calculate(String op, int a, int b) {
		// Введите свое решение ниже
		int result = 0;
		switch (op) {
			case "+":
				result = a + b;
				break;
			case "-":
				result = a - b;
				break;
			case "*":
				result = a * b;
				break;
			case "/":
				result = a / b;
				break;

			default:
				System.out.println("Введите оператор: -, +, *, /");
				break;
		}
		return result;
	}
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Printer {
	public static void main(String[] args) {
		int a = 0;
		String op = " ";
		int b = 0;

		if (args.length == 0) {
			// При отправке кода на Выполнение, вы можете варьировать эти параметры
			a = 3;
			op = "+";
			b = 7;
		} else {
			a = Integer.parseInt(args[0]);
			op = args[1];
			b = Integer.parseInt(args[2]);
		}

		Calculator calculator = new Calculator();
		int result = calculator.calculate(op, a, b);
		System.out.println(result);
	}
}