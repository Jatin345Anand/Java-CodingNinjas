package InfixPostfixPrefix;

import java.util.Stack;

import Recursion.TakeData;

public class PrefixImplementation {
	public static void EvaluateToPrefix(String input) {
		int x=0,y=0;
		Stack<Integer> operands = new Stack<Integer>();
		char[]  expression = input.toCharArray();
		for(int i=expression.length-1;i>=0;i--) {
			if(expression[i]>='0' && expression[i]<='9') {
				operands.push((int)(expression[i]-'0'));
				System.out.println((int)(expression[i]-'0'));
			}
			else {
				x = operands.pop();
				y = operands.pop();
				if(expression[i]=='*') {
					operands.push(x*y);
				}
				if(expression[i]=='+') {
					operands.push(x+y);
				}
				if(expression[i]=='/') {
					operands.push(x/y);
				}
				if(expression[i]=='-') {
					operands.push(x-y);
				}
			}
		}
		System.out.println(operands.pop());
	}
	public static void main(String[] args) {
		// /-AB*F+DE
		// /-45*7+89
		// /-74*1+12
		System.out.println("Enter Prefix value expression");
          String input = TakeData.TakeString();
          EvaluateToPrefix(input);
	}
}
