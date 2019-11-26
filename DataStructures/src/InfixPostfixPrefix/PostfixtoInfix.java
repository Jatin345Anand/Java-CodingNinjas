package InfixPostfixPrefix;

import java.util.Stack;

import Recursion.TakeData;

public class PostfixtoInfix {
	public static void conversionPostfixtoInfix(String postfix) {
		String infix="";
		String x="",y="";
		Stack<String> expressionSTACK = new Stack<String>();
		char[] expressions =  postfix.toCharArray();
		for(int i=0;i<expressions.length;i++) {
			if((expressions[i]>='A' && expressions[i]<='Z') || (expressions[i]>='a' && expressions[i]<='z')) {
				expressionSTACK.push((expressions[i])+"");
			}
			else {
				System.out.println("Expression "+expressionSTACK);
				y = expressionSTACK.pop();
				x = expressionSTACK.pop();
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
     // Input POSTFIX : AB-DE+F*/
	 // Output INFIX  : (A-B)/((D+F)*F)
	 // Input POSTFIX :  ABCD^E-FGH*+^*+I-
	 // Output infix : ((A+(B*(((C^D)-E)^(F+(G*H)))))-I)
	 System.out.println("Enter Postfix");
	 String postfix = TakeData.TakeString();
	 conversionPostfixtoInfix(postfix);
	}
}
