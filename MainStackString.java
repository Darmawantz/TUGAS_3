public class MainStackString{
public static void main(String[] args)
{
StackString stack = new StackString();
stack.inisiasi(3);
stack.push("naruto");
stack.push("sasuke");
stack.push("neji");
stack.view();
stack.push("pain");
stack.push("minato");
stack.pop();
stack.pop();
stack.view();
stack.pop();
stack.pop();
stack.pop();
stack.push("iruka");
stack.push("shino");
stack.push("kiba");
stack.push("rock lee");
stack.pop();
stack.view();
}
}
