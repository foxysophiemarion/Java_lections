package phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class phonebook {
	public static void main(String[] args) {
		HashMap<String, List<String>> phoneBook = new HashMap<>();

		addContact(phoneBook, "Сян Лин", "123456789");
		addContact(phoneBook, "Райдэн", "777777777");
		addContact(phoneBook, "Тигнари", "555555555");
		addContact(phoneBook, "Син Цю", "111111111");
		addContact(phoneBook, "Нахида", "999999999");
		addContact(phoneBook, "Хэйдзо", "333333333");
		addContact(phoneBook, "Райдэн", "777777777");
		addContact(phoneBook, "Яэ Мико", "888888888");
		addContact(phoneBook, "Ёемия", "975318642");
		addContact(phoneBook, "Тигнари", "444444444");
		addContact(phoneBook, "Син Цю", "246813579");
		addContact(phoneBook, "Райдэн", "755232311");
		addContact(phoneBook, "Е Лань", "73501505");
		addContact(phoneBook, "Син Цю", "4071505");
		addContact(phoneBook, "Кадзуха", "214365879");
		addContact(phoneBook, "Гань Юй", "918273645");
		addContact(phoneBook, "Яэ Мико", "653887543");

		// Сортировка по убыванию числа телефонов
		List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
		sortedEntries.sort((o1, o2) -> o2.getValue().size() - o1.getValue().size());

		// Вывод результата
		for (Map.Entry<String, List<String>> entry : sortedEntries) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public static void addContact(HashMap<String, List<String>> phoneBook, String name, String phoneNumber) {
		// Если имя уже присутствует в телефонной книге
		if (phoneBook.containsKey(name)) {
			List<String> phoneNumbers = phoneBook.get(name);
			// Проверяем, есть ли уже такой номер телефона в списке
			if (!phoneNumbers.contains(phoneNumber)) {
				// Если номера нет, добавляем его
				phoneNumbers.add(phoneNumber);
			}
		} else {
			// Если имя не найдено, создаем новую запись в телефонной книге
			List<String> phoneNumbers = new ArrayList<>();
			phoneNumbers.add(phoneNumber);
			phoneBook.put(name, phoneNumbers);
		}
	}
}
