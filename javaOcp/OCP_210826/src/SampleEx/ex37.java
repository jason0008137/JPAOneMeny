package SampleEx;

public class ex37<K, V> {

	private K key;
	private V value;

	public ex37(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public static <T> ex37<T, T> twice(T value) {
		return new ex37<T, T>(value, value);
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}
