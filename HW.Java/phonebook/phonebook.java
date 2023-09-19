package phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class phonebook {
	public static void main(String[] args) {
		HashMap<String, List<String>> phoneBook = new HashMap<>();

		addContact(phoneBook, "Петр", "123456789");
		addContact(phoneBook, "Ульяна", "777777777");
		addContact(phoneBook, "Толя", "555555555");
		addContact(phoneBook, "Иван", "111111111");
		addContact(phoneBook, "Николай", "999999999");
		addContact(phoneBook, "Харитон", "333333333");
		addContact(phoneBook, "Ульяна", "777777777");
		addContact(phoneBook, "Йохан", "888888888");
		addContact(phoneBook, "Леонид", "975318642");
		addContact(phoneBook, "Олег", "444444444");
		addContact(phoneBook, "Иван", "246813579");
		addContact(phoneBook, "Ульяна", "755232311");
		addContact(phoneBook, "Борис", "73501505");
		addContact(phoneBook, "Иван", "4071505");
		addContact(phoneBook, "Йохан", "214365879");
		addContact(phoneBook, "Центурион", "918273645");
		addContact(phoneBook, "Алексей", "653887543");

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
