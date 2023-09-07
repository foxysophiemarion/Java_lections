// N-ое треугольное число

// Вычислить n-ое треугольного число(сумма чисел от 1 до n).

// Внутри класса Answer напишите метод countNTriangle, который принимает число n
// и возвращает его n-ое треугольное число.

// Пример

// n = 4 -> 10

// n = 5 -> 15

// public class Answer {
// public int countNTriangle(int n) {
// // Введите свое решение ниже
// if (n <= 0) {
// return -1; // Возвращаем -1 в качестве индикатора ошибки
// }
// // Используем формулу для вычисления n-го треугольного числа
// return n * (n + 1) / 2;
// }

// public static void main(String[] args) {
// int n = 0;

// if (args.length == 0) {
// // При отправке кода на Выполнение, вы можете варьировать эти параметры
// n = 4;
// } else {
// n = Integer.parseInt(args[0]);
// }

// // Вывод результата на экран
// Answer ans = new Answer();
// int itresume_res = ans.countNTriangle(n);
// System.out.println(itresume_res);
// }
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Напишите функцию printPrimeNums, которая выведет на экран все простые числа в
// промежутке от 1 до 1000, каждое на новой строке.

// Напишите свой код в методе printPrimeNums класса Answer.

// Пример

// 1
// 2
// 3
// 5
// 7
// 11
// ...

// class Answer {
// public void printPrimeNums() {
// // Напишите свое решение ниже
// for (int i = 1; i <= 1000; i++) { // цикл по всем числам от 2 до 1000
// boolean isPrime = true; // флаг, который показывает, является ли число
// простым
// int limit = (int) Math.sqrt(i); // верхняя граница для проверки делителей
// for (int j = 2; j <= limit; j++) { // цикл по всем возможным делителям от 2
// до корня из i
// if (i % j == 0) { // если i делится на j без остатка
// isPrime = false; // то i не простое число
// break; // и можно прервать цикл
// }
// }
// if (isPrime) { // если i простое число
// System.out.println(i); // то вывести его на экран
// }
// }
// }

// public static void main(String[] args) {

// Answer ans = new Answer();
// ans.printPrimeNums();
// }
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// HW_2

// class Answer {
// public static StringBuilder answer(String QUERY, String PARAMS) {
// String paramsNew = PARAMS.replace('{', ' ').replace('}', ' ');
// String[] params = paramsNew.split(",");
// StringBuilder stringBuilder = new StringBuilder(QUERY);

// for (int i = 0; i < params.length; i++) {
// String[] elements = params[i].replace('"', ' ').split(":");
// if (!"null".equals(elements[1].trim())) {
// stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
// if (i < params.length - 2)
// stringBuilder.append(" and ");
// }
// }
// return stringBuilder;
// }

// public static void main(String[] args) {
// String QUERY = "";
// String PARAMS = "";

// if (args.length == 0) {
// QUERY = "select * from students where ";
// PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\",
// \"age\":\"null\"} ";
// } else {
// QUERY = args[0];
// PARAMS = args[1];
// }

// Answer ans = new Answer();
// System.out.println(ans.answer(QUERY, PARAMS));
// }
// }
