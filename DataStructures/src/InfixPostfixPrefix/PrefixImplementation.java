package InfixPostfixPrefix;

import java.util.Stack;

import Recursion.TakeData;

public class PrefixImplementation {
	public static void EvaluateToPrefix(String input) {
		int x=0,y=0;
		Stack<Integer> operands = new Stack<Integer>();
		char[]  expressions = input.toCharArray();
		for(int i=expressions.length-1;i>=0;i--) {
			if(expressions[i]>='0' && expressions[i]<='9') {
				operands.push((int)(expressions[i]-'0'));
				System.out.println((int)(expressions[i]-'0'));
			}
			else {
				x = operands.pop();
				y = operands.pop();
				if(expressions[i]=='*') {
					operands.push(x*y);
					break;
				}
				if(expressions[i]=='+') {
					operands.push(x+y);
					break;
				}
				if(expressions[i]=='/') {
					operands.push(x/y);
					break;
				}
				if(expressions[i]=='-') {
					operands.push(x-y);
					break;
				}
			}
		}
		System.out.println(operands.pop());
	}
	public static void main(String[] args) {
          String input = TakeData.TakeString();
          EvaluateToPrefix(input);
	}
}
