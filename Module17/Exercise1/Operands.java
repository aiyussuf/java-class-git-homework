/*
Using the file Operands linked in the homework, create an instance of the class Operands and invoke the method executBinaryOperation twice. Once with the a lambda expression implementing addition and once with a lambda expression implementing multiplication.
Hint: The method executeBinaryOperation expects a Lambda backed by the built-in Functional Interface DoubleBinaryOperator which is defined like this:
*/

import java.util.function.DoubleBinaryOperator;


public class Operands {
    private double operand1;
    private double operand2;

    public Operands(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }


    public double executBinaryOperation(String operationName, DoubleBinaryOperator operation) {
        double answer = operation.applyAsDouble(operand1, operand2);
        System.out.println("Executing " + operationName + " on " + operand1
                + " and " + operand2 + " resulted in " + answer);
        return answer;
    }


  public static void main(String[] args) {
    Operands operation = new Operands(4.0,5.0);
    operation.executBinaryOperation("addition", ( x, y) -> x + y);
    DoubleBinaryOperator add = (x, y) -> x + y;
		System.out.println( "Addition: " + add.applyAsDouble( 4.0, 5.0));

    operation.executBinaryOperation("multiplication", (x, y) -> x * y);
    DoubleBinaryOperator multiply = (x, y) -> x * y;
		System.out.println( "Multiplication: " + multiply.applyAsDouble( 4.0, 5.0));


    }
}
