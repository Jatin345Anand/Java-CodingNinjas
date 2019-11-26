package InfixPostfixPrefix;

import java.util.Stack;

import Recursion.TakeData;

public class InfixtoPrefix {
	public static void conversionPrefixtoInfix(String infix) {
		Stack<String> prefixStack = new Stack<String>();
		Stack<String> expressionSTACK = new Stack<String>();
		char[] expressions = infix.toCharArray();
		String Y="";
		String X="";
		String PREFIX = "",topmostValue="";
		for (int i = 0; i < expressions.length; i++) {
			if ((expressions[i] >= 'A' && expressions[i] <= 'Z') || (expressions[i] >= 'a' && expressions[i] <= 'z')) {
 				prefixStack.push(expressions[i]+"");
			} else {

				if (expressions[i] == ')') {
					while(!expressionSTACK.isEmpty()) {
						if(expressionSTACK.peek().charAt(0)=='(') {
							expressionSTACK.pop();
							break;
						}
						else {
							Y = prefixStack.pop();
							X = prefixStack.pop();
							System.out.println("x : "+X);
							System.out.println("Operator : "+expressionSTACK.peek());
							System.out.println("y : "+Y);
							System.out.println("Prefix Stack : "+prefixStack);
							System.out.println("Expression Stack : "+expressionSTACK);
							topmostValue =  expressionSTACK.pop() + X + Y;
							PREFIX = topmostValue;
//							System.out.println("Top Most Value : "+topmostValue);
							prefixStack.push(topmostValue);
						}
					}
				}
				else {
					expressionSTACK.push(expressions[i]+"");
				}
 
			}
		}
//		System.out.println(expressionSTACK);
		System.out.println("Prefix : "+PREFIX);
	}
	public static void checkExpression(Stack<String> expressionSTACK,char D,String Postfix ) {
		
		System.out.println("Postfix : "+Postfix+ expressionSTACK.size());
		int l = expressionSTACK.size();
		System.out.println("Stack : "+expressionSTACK);
		while(!expressionSTACK.isEmpty()) {
			System.out.println("Peek : "+expressionSTACK.peek());
			
//			expressionSTACK.pop();
        	if(expressionSTACK.peek().charAt(0)=='(') {
        		System.out.println("append");
        		expressionSTACK.pop();
        		break;
        	}
        	else {
//        		System.out.println("Peek 2  : "+expressionSTACK.peek());
        		Postfix += expressionSTACK.pop();
        	}
	
		}
		System.out.println("Postfix : "+Postfix);
		System.out.println("Stack : "+expressionSTACK);
	}

	public static void main(String[] args) {
		// Input INFIX : ((A-B)/((D+E)*F))
		// Output PREFIX : /-AB*F+DE
		// Input infix : ((A+(B*(((C^D)-E)^(F+(G*H)))))-I)
		// Output PREFIX : -+A*B^-^CDE+F*GHI
		// Input Infix : (A+B/C*(D+E)-F)
	    // Output PREFIX : +A/B*C-+DEF
		// Input Infix : (A+(B/C)*(D+E)-F)
		// Output Prefix : +A*/BC-+DEF
        // Input Infix = ((A-(B/C))*((A/K)-L))
		// Output Prefix : *-A/BC-/AKL
		// Input Infix : ((a-(b/c))*((a/k)-l))
		// Output Prefix : *-a/bc-/akl
		System.out.println("Enter Infix");
		String infix = TakeData.TakeString();
		Stack<String> expressionStack1 = new Stack<String>();
		expressionStack1.push("(");
		Stack<String> expressionStack2 = new Stack<String>();
		expressionStack2.push("(");
		expressionStack2.push("-");
		expressionStack2.push("/");
//		char symbol = TakeData.TakeString().charAt(0);
//		checkExpression(expressionStack1, symbol, postfix);
		conversionPrefixtoInfix(infix);
	}
}
