package calculator;


/* 2 number simple calculator - Gabe Coones 6/2020
 * This two number simple operation limitation is driving me crazy
 * I want to come back to this when I am better equipped to write a parser
 * to handle input as strings, similar to how entering math at a node.js
 * or any language interpreter typically allows
*/


import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;

class Main {
public static void main(String[] args) {

  //initializations
  Scanner sc = new Scanner(System.in);
  //drop tailing zeros to look prettier
  DecimalFormat dropZeros = new DecimalFormat("0.#");
  //Operators we can handle
  ArrayList<String> validOps = new ArrayList<String>() {{ add("+"); add("-"); add("x"); add("*"); add("/"); add("^");}};


  //variables
  float num1 = 0;
  float num2 = 0;
  String operator = "";


  
  System.out.println("Hello world! I am a calculator, beep boop"); 

//loop forever
while(true){
  //Num1
  while(true) {
	  System.out.println("Please enter a number.."); 
	  try{
		  num1 = sc.nextFloat();
		  break;
	  //catch if we did not receive a number
	  }catch(Exception e){System.out.println("Syntax Error");}  
  } 

  
  //get our operator
  while(true) {
	  System.out.println("Please enter an operator (+,-,x,/,^)");
	  operator = sc.next();
	  if(validOps.contains(operator)){
		  break;
	  }else{System.out.println("Invalid Operator, please try again");}
  }

  
  //get our second number
  while(true) {
	  System.out.println("Please enter a second number.."); 
	  try{
		  num2 = sc.nextFloat();
		  break;
	  //catch if we did not receive a number
	  }catch(Exception e){System.out.println("Syntax Error");}  
  }
  

  //A google search told me this was how to clear the repl console, I have no idea what this is actually doing...
  System.out.print("\033[H\033[2J");
  System.out.flush();

  //calculate and display our answer all pretty like
  System.out.println(dropZeros.format(num1) + operator + dropZeros.format(num2) + '=' + dropZeros.format(calculate(num1,num2, operator)));
}
}


//do our calculation here:
public static Float calculate(float num1, float num2, String op){
	
	Float ans = (float) 0;
	switch(op.charAt(0)) {
	case '+':
		ans = num1 + num2;
		break;
	case '-':
		ans = num1 - num2;
		break;
	case 'x':
		ans = num1 * num2;
		break;
	case '*':
		ans = num1 * num2;
		break;
	case '/':
		ans = num1 / num2;
		break;
	case '^':
		double exponent = Math.pow(num1, num2);
		ans = (float) exponent;
		break;		
	}
  return ans;

}

//unreachable, but as we plant to loop forever, there's no need to close this.
//is garbage collection a thing in Java?
//sc.close();

}