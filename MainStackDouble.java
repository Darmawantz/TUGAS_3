
public class MainStackDouble {

	public static void main(String[] args) {
		StackDouble stack = new StackDouble();
		stack.inisiasi(3);
		stack.push(3);
		stack.push(14);
		stack.push(2.2);
		stack.view();
		stack.push(4.5);
		stack.push(1);
		stack.pop();
		stack.pop();
		stack.view();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(6);
		stack.push(4.9);
		stack.push(7.9);
		stack.push(1.9);
		stack.pop();
		stack.view();

	}

}
