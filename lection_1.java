/// **
// * lection_1
// */
// public class lection_1 { // Класс
// public static void main(String[] args) { // Метод, который обязательно должен
/// называться main
// System.out.println("bye world");
// }
// }

// КОММЕНТИРОВАНИЕ строчное

/*
 * КОММЕНТИРОВАНИЕ
 * многострочное
 */

// ТИПЫ ДАННЫХ и ПЕРЕМЕННЫХ
// Типы данных:
// 1) Ссылочные
// 2) Примитивные (boolean, int, short, long и т.д., float, double, Chair)

// Создание переменной:
// <тип> <идентификатор>;
// <идентификатор> = <значение>;

// public class lection_1 {
// public static void main(String[] args) {
// String s = null;
// System.out.println(s);
// }
// }

// Тип данных для целых чисел
// public class lection_1 {
// public static void main(String[] args) {
// short age = 10;
// int salary = 12345;
// System.out.println(age);
// System.out.println(salary);
// }
// }

// Тип данных для вещественных чисел
// public class lection_1 {
// public static void main(String[] args) {
// float e = 2.7f; //суфикс F обязателен
// double pi = 3.1415;
// System.out.println(e);
// System.out.println(pi);
// }
// }

// public class lection_1 {
// public static void main(String[] args) {
// String msg = "Hello";
// System.out.println(msg);
// }
// }

// Неявня типизция
// public class lection_1 {
// public static void main(String[] args) {
// var i = 123;
// System.out.println(i);
// }
// }

// СТАТИЧЕСКИЙ ЧЛЕН КЛАССА
// public class lection_1 {
// public static void main(String[] args) {
// var a = 123;
// System.out.println(a);
// var d = 123.456;
// System.out.println(d);
// System.out.println(getType(a));
// System.out.println(getType(d));
// d = 1022;
// System.out.println(d);
// }
// static String getType(Object o) {
// return o.getClass().getSimpleName();
// }
// }

// КЛАССЫ ОБЕРТКИ
// public class lection_1 {
// public static void main(String[] args) {
// int i = 123_123_2141;
// System.out.println(Integer.MAX_VALUE);
// System.out.println(Integer.MIN_VALUE);
// }
// }

// public class lection_1 {
// public static void main(String[] args) {
// String s = "qwer";
// s.charAt(1);
// System.out.println(Integer.MIN_VALUE);
// }
// }

/*
 * ОПЕРАЦИИ
 * "=" - присваивание
 * "*,/,+,-,%,++,--" - арифметические
 * "<,>,==,!=,>=,<=" - сравнения
 * "||, &&,^,!" - логические
 * "<<,>>,&,|,^" - побитовые
 */

// public class lection_1 {
// public static void main(String[] args) {
// int a = 123;
// a = --a - a--;
// System.out.println(a);
// }
// }

// public class lection_1 {
// public static void main(String[] args) {
// boolean f = 123 == 234;
// System.out.println(f);
// }
// }

// public class lection_1 {
// public static void main(String[] args) {
// int a = 18; // 1000
// System.out.println(a >> 1); // 9
// }
// }

// public class lection_1 {

// public static void main(String[] args) {
// int a = 5;
// int b = 2;
// System.out.println(a & b);
// // 101
// // 010
// // 000
// }
// }

// public class lection_1 {

// public static void main(String[] args) {
// int a = 5;
// int b = 2;
// System.out.println(a | b);
// // 101
// // 010
// // 111
// }
// }

// public class lection_1 {

// public static void main(String[] args) {
// int a = 5;
// int b = 2;
// System.out.println(a ^ b);
// // 101
// // 010
// // 111
// }
// }

// public class lection_1 {
// public static void main(String[] args) {
// String s = "qwer1"; // 5, 0..4
// boolean b = s.length() >= 5 && s.charAt(4) == '1';
// System.out.println(b);
// }
// }

// public class lection_1 {
// public static void main(String[] args) {
// String s = "qwe1";
// // boolean b = s.length() >= 5 & s.charAt(4) == '1';
// boolean b = s.length() >= 5 && s.charAt(4) == '1';
// System.out.println(b);
// }
// }

// public class lection_1 {
// public static void main(String[] args) {
// String s = "qwe1";
// // boolean b = s.length() >= 5 | s.charAt(4) == '1';
// boolean b = s.length() >= 5 | s.charAt(4) == '1';
// System.out.println(b);
// }
// }

// МАССИВЫ

// ОДНОМЕРНЫЕ
// public class lection_1 {
// public static void main(String[] args) {
// int[] arr = new int[10];
// System.out.println(arr.length); // 10

// arr = new int[] { 1, 2, 3, 4, 5, 6 };
// System.out.println(arr.length); // 6
// }
// }

// public class lection_1 {
// public static void main(String[] args) {
// int[] arr = new int[10];
// arr[3] = 13;
// System.out.println(arr[3]);
// }
// }

// МНОГОМЕРНЫЕ

// public class lection_1 {
// public static void main(String[] args) {
// int[] arr[] = new int[3][5];
// for (int[] line : arr) {
// for (int item : line) {
// System.out.printf("%d", item);
// }
// }
// System.out.println();
// }
// }

// public class lection_1 {
// public static void main(String[] args) {
// int[][] arr = new int[3][5];
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[i].length; j++) {
// System.out.printf("%d", arr[i][j]);
// }
// }
// System.out.println();
// }
// }

// ПРЕОБРАЗОВНИЯ
// public class lection_1 {
// public static void main(String[] args) {
// int i = 123;
// double d = i;
// System.out.println(i); // 123
// System.out.println(d); // 123.0
// d = 3.1415;
// i = (int) d;
// System.out.println(d); // 3.1415
// System.out.println(i); // 3
// d = 3.9415;
// i = (int) d;
// System.out.println(d); // 3.9415
// System.out.println(i); // 3
// byte b = Byte.parseByte("123");
// System.out.println(b); // 123
// b = Byte.parseByte("1234");
// System.out.println(b); // Exeption
// }
// }

// public class lection_1 {
// public static void main(String[] args) {
// byte b = Byte.parseByte("123");
// System.out.println(b);
// }
// }

// Получение данных из терминала
// import java.util.Scanner;

// public class lection_1 {
// public static void main(String[] args) {
// Scanner iScanner = new Scanner(System.in);
// System.out.printf("name: ");
// String name = iScanner.nextLine();
// System.out.printf("Привет, %s!", name);
// iScanner.close();
// }
// }

// import java.util.Scanner;
// public class lection_1 {
// public static void main(String[] args) {
// Scanner iScanner = new Scanner(System.in);
// System.out.printf("int a: ");
// boolean flag = iScanner.hasNextInt();
// System.out.println(flag);
// int i = iScanner.nextInt();
// System.out.println(i);
// iScanner.close();
// }
// }

// ФОРМАТИРОВАННЫЙ ВЫВОД

// public class lection_1 {
// public static void main(String[] args) {
// int a = 1, b = 2;
// int c = a + b;
// String res = a + " + " + b + " = " + c;
// System.out.println(res);
// }
// }

// public class lection_1 {
// public static void main(String[] args) {
// String s = "qwe";
// int a = 123;
// String q = s + a;
// System.out.println(q);
// }
// }

/**
 * lection_1
 */
// public class lection_1 {
// public static void main(String[] args) {
// int a = 1, b = 2;
// int c = a + b;
// String res = String.format("%d+%d=%d \n", a, b, c);
// System.out.printf("%d+%d=%d \n", a, b, c);
// System.out.println(res);
// }
// }

/*
 * СПЕЦИФИКАТОРЫ
 * %d: целочисленные значения
 * %x: шестнадцатеричные
 * %f: числа с плавающей точкой
 * %e: числа в экспоненциальной форме, 3.1415е+01
 * %c: одиночный символ
 * %s: строковые значения
 */

// Область видимости переменных

// public class lection_1 {
// public static void main(String[] args) {
// {
// int a = 222;
// System.out.println(a);
// }
// int a = 132;
// System.out.println(a);
// }
// }

// МЕТОДЫ
// public class lection_1 {

// public static void main(String[] args) {
// lib.sayHi();
// }
// }

// public class lection_1 {

// public static void main(String[] args) {
// int a = 123;
// switch (a) {
// case 1:
// System.out.println("a");
// break;
// case 2:
// System.out.println("b");
// break;
// case 10:
// System.out.println("b");
// }
// }
// }

// ЦИКЛЫ

// WHILE
// public class lection_1 {
// public static void main(String[] args) {
// int value = 321;
// int count = 0;
// while (value != 0) {
// value /= 10;
// count++;
// }
// System.out.println(count);
// }
// }

// DO WHILE
// public class lection_1 {
// public static void main(String[] args) {
// int value = 321;
// int count = 0;
// do {
// value /= 10;
// count++;
// } while (value != 0);
// System.out.println(count);
// }
// }

/*
 * continue, break
 * Операторы для управления циклами — continue и break.
 * Выполнение следующей итерации цикла — continue.
 * Прерывание текущей итерации цикла — break.
 * ближайшего к оператору
 */

// FOR
// public class lection_1 {
// public static void main(String[] args) {
// int s = 0;
// for (int i = 1; i <= 10; i++) {
// s += i;
// }
// System.out.println(s);
// }
// }

// Вложенные циклы
// public class lection_1 {
// public static void main(String[] args) {
// for (int i = 0; i < 5; i++) {
// for (int j = 0; j < 5; j++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// // * * * * *
// // * * * * *
// // * * * * *
// // * * * * *
// // * * * * *
// }
// }

// for : Работает только для коллекциЙ
// public class lection_1 {
// public static void main(String[] args) {
// int arr[] = new int[10];
// for (int item : arr) {
// System.out.printf("%d ", item);
// }
// System.out.println();
// }
// }

// Работа с файлами
// Создание и запись\ дозапись
// import java.io.FileWriter;
// import java.io.IOException;

// public class lection_1 {
// public static void main(String[] args) {
// try (FileWriter fw = new FileWriter("file.txt", false)) {
// fw.write("line 1");
// fw.append('\n');
// fw.append('2');
// fw.append('\n');
// fw.write("line 3");
// fw.flush();
// } catch (IOException ex) {
// System.out.println(ex.getMessage());
// }
// }
// }

// Чтение, Вариант посимвольно
// import java.io.*;

// public class lection_1 {
// public static void main(String[] args) throws Exception {
// FileReader fr = new FileReader("file.txt");
// int c;
// while ((c = fr.read()) != -1) {
// char ch = (char) c;
// if (ch == '\n') {
// System.out.print(ch);
// } else {
// System.out.print(ch);
// }
// }
// }
// }

// Вариант построчно
// import java.io.*;

// public class lection_1 {
// public static void main(String[] args) throws Exception {
// BufferedReader br = new BufferedReader(new FileReader("file.txt"));
// String str;
// while ((str = br.readLine()) != null) {
// System.out.printf("== %s ==\n", str);
// }
// br.close();
// }
// }
