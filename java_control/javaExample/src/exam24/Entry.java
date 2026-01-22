package exam24;

// k와 v, 두 개의 타입을 피라미터로 정의
public class Entry<k,V> {
	private k key;
	private V value;
	
	public Entry(k key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public k getKey() { return key;}
	public V getValue() { return value;}
	
	public void display() {
		System.out.println("Key: " + key + " (Type: " + key.getClass().getSimpleName() + ")");
		System.out.println("Value : " + value + " (Type: " + value.getClass().getSimpleName() + ")");
	}
	
	
	
	

}
