package com.au.java;

import java.util.Scanner;
import java.util.Stack;
class InfixEvaluationImplementation {

	public Double evaluate(String expression) {
		// stack for operands
		Stack<Double> numberStack = new Stack<>();		
		//stack for characters
		Stack<Character> operatorStack = new Stack<>();
		
		// System.out.println("........................");

		char []expToken = expression.toCharArray();
		for(int i=0; i<expToken.length; i++) {
			
			char ch = expToken[i];
		
			if(Character.isDigit(ch) || ch == '.') {
				StringBuffer buff = new StringBuffer();
				while((i < expToken.length) && (Character.isDigit(expToken[i]) || expToken[i] == '.')) {
					buff.append(expToken[i++]);
				}
				i--;
				numberStack.push(Double.parseDouble(buff.toString()));		
			}
			else if(ch == '(') {
				//push to the operator stack
				operatorStack.push(ch);
			}
			else if(ch == ')') {
				while(operatorStack.peek() != '(') {
					double output = performOperation(numberStack.pop(), numberStack.pop(), operatorStack.pop());
					numberStack.push(output);
				}
				operatorStack.pop();
			}
			else if(isOperator(ch)) {
				while(!operatorStack.isEmpty() && (precedence(ch) < precedence(operatorStack.peek()))) {
					double output = performOperation(numberStack.pop(), numberStack.pop(), operatorStack.pop());
					//System.out.println(output);
					numberStack.push(output);
				}
				operatorStack.push(ch);		
			}	
		}
		
		while(!operatorStack.isEmpty()) {
			double output = performOperation(numberStack.pop(), numberStack.pop(), operatorStack.pop());
			//System.out.println(output);
			numberStack.push(output);
		}
		return numberStack.peek();
	}

	
	public int precedence(char op) {
		if(op == '*' || op == '/' || op=='%') {
			return 2;
		}else if(op == '+' || op == '-') {
			return 1;
		}else if(op == '^') {
			return 3;
		}
		return -1;
	}
	
	public boolean isOperator(char op) {
		return (op == '+' || op == '-' || op == '*' || op == '/' || op == '^' || op =='%');
	}
	
	public double performOperation(Double operator2, Double operator1, Character operand) {
		switch(operand) {
			case '+' : return operator1+operator2;
			case '-' : return operator1-operator2;
			case '*' : return operator1*operator2;
			case '^' : return Math.pow(operator2, operator1);
			case '/' : 
				if(operator2 == 0) {
					throw new UnsupportedOperationException("Cannot divide by 0");
				}else {
					return operator1/operator2;
				}
			case '%': return operator1%operator2;
		}
		return 0;
	}
}

public class InFixEvaluation{
	public static void main(String[] args) {
		
		InfixEvaluationImplementation infixEvaluationObj = new InfixEvaluationImplementation();
		System.out.print("Enter the expression\n");
        Scanner in = new Scanner(System.in); 
        String expression = in.nextLine();
        Double answer = infixEvaluationObj.evaluate(expression);
        System.out.println(answer);
	}
}
