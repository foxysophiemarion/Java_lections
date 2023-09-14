import java.util.LinkedList;

class MyQueue<T> {
	LinkedList<T> queque;

	public void enqueue(T element) {
		if (queque == null) {
			queque = new LinkedList<>();
			queque.addLast(element);
		} else
			queque.addLast(element);
	}

	public T dequeue() {
		if (queque == null) {
			return null;
		} else {
			return queque.removeFirst();
		}
	}

	public T first() {
		if (queque == null) {
			return null;
		} else {
			return queque.get(0);
		}
	}

	public LinkedList<T> getElements() {
		return queque;
	}

	public static void main(String[] args) {
		MyQueue<Integer> queue;
		queue = new MyQueue<>();

		if (args.length == 0) {
			// При отправке кода на Выполнение, вы можете варьировать эти параметры
			queue.enqueue(1);
			queue.enqueue(10);
			queue.enqueue(15);
			queue.enqueue(5);
		} else {
			queue.enqueue(Integer.parseInt(args[0]));
			queue.enqueue(Integer.parseInt(args[1]));
			queue.enqueue(Integer.parseInt(args[2]));
			queue.enqueue(Integer.parseInt(args[3]));
		}

		System.out.println(queue.getElements());

		queue.dequeue();
		queue.dequeue();
		System.out.println(queue.getElements());

		System.out.println(queue.first());
	}
}