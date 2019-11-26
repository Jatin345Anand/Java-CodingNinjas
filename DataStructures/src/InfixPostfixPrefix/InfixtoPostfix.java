package InfixPostfixPrefix;

import java.util.Stack;

import Recursion.TakeData;

public class InfixtoPostfix {
	public static void conversionPostfixtoInfix(String infix) {
		String Postfix = "";
		Stack<String> expressionSTACK = new Stack<String>();
		char[] expressions = infix.toCharArray();
		for (int i = 0; i < expressions.length; i++) {
			if ((expressions[i] >= 'A' && expressions[i] <= 'Z') || (expressions[i] >= 'a' && expressions[i] <= 'z')) {
//				expressionSTACK.push((expressions[i])+"");
				Postfix += expressions[i] + "";
			} else {
				System.out.println("Expression " + expressionSTACK);
//				topMostOperator = expressionSTACK.peek();
				if (expressions[i] == '^') {
					while(!expressionSTACK.isEmpty()) {
 			        	if(expressionSTACK.peek().charAt(0)=='(' || expressionSTACK.peek().charAt(0)=='+' || expressionSTACK.peek().charAt(0)=='-' || expressionSTACK.peek().charAt(0)=='*' || expressionSTACK.peek().charAt(0)=='/') {
 			        		expressionSTACK.push(expressions[i]+"");
			        		break;
			        	}
			        	else {
 			        		Postfix += expressionSTACK.pop();
			        	}
				
					} 
				}
				if(expressions[i] == '/' || expressions[i] == '*') {
					while(!expressionSTACK.isEmpty()) {
 			        	if(expressionSTACK.peek().charAt(0)=='(' || expressionSTACK.peek().charAt(0)=='+' || expressionSTACK.peek().charAt(0)=='-') {
 			        		expressionSTACK.push(expressions[i]+"");
			        		break;
			        	}
			        	else {
 			        		Postfix += expressionSTACK.pop();
			        	}
				
					}
 					
				}
				if (expressions[i] == '+' || expressions[i] == '-') {
					while(!expressionSTACK.isEmpty()) {
 			        	if(expressionSTACK.peek().charAt(0)=='(') {
 			        		expressionSTACK.push(expressions[i]+"");
			        		break;
			        	}
			        	else {
 			        		Postfix += expressionSTACK.pop();
			        	}
				
					}
					
				}
				if (expressions[i] == '(') {
					expressionSTACK.push(expressions[i]+"");
				}
				if (expressions[i] == ')') {
					while(!expressionSTACK.isEmpty()) {
 			        	if(expressionSTACK.peek().charAt(0)=='(') {
 			        		expressionSTACK.pop();
			        		break;
			        	}
			        	else {
 			        		Postfix += expressionSTACK.pop();
			        	}
				
					}	 
				}
 
			}
		}
		System.out.println(expressionSTACK);
		System.out.println("Postfix : "+Postfix);
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
		// Input INFIX : ((A-B)/((D+F)*F))
		// Output POSTFIX : AB-DE+F*/
		// Input infix : ((A+(B*(((C^D)-E)^(F+(G*H)))))-I)
		// Output POSTFIX : ABCD^E-FGH*+^*+I-
		// Input Infix : (A+B/C*(D+E)-F)
		//
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
		conversionPostfixtoInfix(infix);
	}
}
