package InfixPostfixPrefix;

import java.util.Stack;

import Recursion.TakeData;

public class PrefixtoInfix {
	public static void conversionPrefixtoInfix(String postfix) {
		String x="",y="";
		Stack<String> expressionSTACK = new Stack<String>();
		char[] expressions =  postfix.toCharArray();
		for(int i=expressions.length-1;i>=0;i--) {
			if((expressions[i]>='A' && expressions[i]<='Z') || (expressions[i]>='a' && expressions[i]<='z')) {
				expressionSTACK.push((expressions[i])+"");
			}
			else {
				System.out.println("Expression "+expressionSTACK);
				x = expressionSTACK.pop();
				y = expressionSTACK.pop();
				if(expressions[i]=='*') {
					expressionSTACK.push("("+x+"*"+y+")");
				}
				if(expressions[i]=='+') {
					expressionSTACK.push("("+x+"+"+y+")");
				}
				if(expressions[i]=='/') {
					expressionSTACK.push("("+x+"/"+y+")");
				}
				if(expressions[i]=='-') {
					expressionSTACK.push("("+x+"-"+y+")");
				}
				if(expressions[i]=='^') {
					expressionSTACK.push("("+x+"^"+y+")");
				}
			}
		}
		System.out.println(expressionSTACK);
	}
	public static void main(String[] args) {
     // Input PREFIX : /-AB*F+DE
	 // Output INFIX  : ((A-B)/((D+F)*F))
	 System.out.println("Enter Prefix");
	 String postfix = TakeData.TakeString();
	 conversionPrefixtoInfix(postfix);
	}
}
