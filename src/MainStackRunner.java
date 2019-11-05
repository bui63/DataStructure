
public class MainStackRunner
{
	public static void main(String[] args) {
		Stack s=new Stack(10);
		s.push(10);
		s.push("A");
		s.push("F");
		s.push("b");
		s.push(1);
		System.out.println(s.srearch("A"));
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
	}
}
