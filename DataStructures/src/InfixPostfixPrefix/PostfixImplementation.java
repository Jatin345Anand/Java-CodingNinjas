package InfixPostfixPrefix;

import java.util.Stack;

import Recursion.TakeData;
//import Stack.StackPractice;

public class PostfixImplementation {
	public static void EvaluateToPostfix(String input) {
		int x=0,y=0;
		Stack<Integer> operands = new Stack<Integer>();
		char[]  expressions = input.toCharArray();
		for(char c: expressions) {
			if(c>='0' && c<='9') {
				operands.push((int)(c-'0'));
				System.out.println((int)(c-'0'));
			}
			else {
				y = operands.pop();
				x = operands.pop();
				if(c=='*') {
					operands.push(x*y);
					break;
				}
				else if(c=='+') {
					operands.push(x+y);
					break;
				}
				else if(c=='/') {
					operands.push(x/y);
					break;
				} 
				else if(c=='-') {
					operands.push(x-y);
					break;
				}
			}
		}
		System.out.println(operands);
	}
	public static void main(String[] args) {
          String input = TakeData.TakeString();
          EvaluateToPostfix(input);
	}
}
