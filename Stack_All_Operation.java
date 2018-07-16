import java.util.*;
class Sample{
	public static void main(String args[]){
		Stack<Integer> stack=new Stack<>();
			push_ele(stack,1);
			push_ele(stack,2);
			push_ele(stack,3);
			System.out.println(stack.toString());
			System.out.println(peek_ele(stack));
			System.out.println(stack.empty());
			pop_ele(stack);
			pop_ele(stack);
			pop_ele(stack);
			System.out.println(stack.empty());
	}
	
	static void push_ele(Stack<Integer> stack,int ele){
		stack.push(ele);
	}
	
	static int peek_ele(Stack<Integer> stack){
		Integer i=(Integer)stack.peek();
		//System.out.println(i);
		return i;
	}
	static void pop_ele(Stack<Integer> stack){
		stack.pop();
	}
}