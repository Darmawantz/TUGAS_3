
public class MainStackFloat {

	public static void main(String[] args) {
		StackFloat stack = new StackFloat();
		stack.inisiasi(3);
		stack.push(2.3);
		stack.push(3.4);
		stack.push(2.4);
		stack.view();
		stack.push(8.5);
		stack.push(1.7);
		stack.pop();
		stack.pop();
		stack.view();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(5.6);
		stack.push(8.6);
		stack.push(7.9);
		stack.push(2.1);
		stack.pop();
		stack.view();

	}

}
