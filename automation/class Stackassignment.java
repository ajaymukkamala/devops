public class Stackinclassassignment {
//instance parameters, an array and an int 
	private String[] list;
	private int numOfValues;

//constructor
	public Stack(int storageSize) {
		this.list = new String[storageSize];
		this.numOfValues = 0;
	}

//push method. We'll check the size and number of values
	public boolean push(String x) {
		if (list.length > this.numOfValues) {
			this.list[this.numOfValues] = x;
			this.numOfValues += 1;
			return true;
		} else {
			return false;
		}
	}

//remove the top element and reduce index by 1
	public String pop() {
		if (this.numOfValues == 0) {
			return null;
		} else {
			String x = this.list[this.numOfValues - 1];
			this.numOfValues = this.numOfValues - 1;
			return x;
		}
	}

//checks if the stack is full
	public boolean isFull() {
		return this.numOfValues == this.list.length;
	}

//checks if the stack is empty
	public boolean isEmpty() {
		return this.numOfValues == 0;
	}
	public static void main(String[] args) {
		Stack stack = new Stack(3);
		System.out.println(stack.push("apple"));
		System.out.println(stack.push("orange"));
		System.out.println(stack.push("ok"));
		System.out.println(stack.isFull());
		System.out.println(stack.push("final"));
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());

	}
}