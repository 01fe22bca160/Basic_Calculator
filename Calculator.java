class Calculator{

    /**
     * The function "addition" takes two float operands and returns their sum.
     * 
     * @param operand_1 The first operand for addition. It is a float data type.
     * @param operand_2 The second operand in the addition operation.
     * @return The sum of operand_1 and operand_2 is being returned.
     */
    float addition(float operand_1,float operand_2){
        return(operand_1+operand_2);

    }
    /**
     * The function "substraction" takes two float operands and returns their difference.
     * 
     * @param operand_1 The first operand for the subtraction operation.
     * @param operand_2 The second operand in the subtraction operation.
     * @return the result of subtracting operand_2 from operand_1.
     */
    float substraction(float operand_1,float operand_2){
        return(operand_1-operand_2);

    }
    // The `multiplication` method in the `Calculator` class takes two float operands, `operand_1` and
    // `operand_2`, and returns their product. It multiplies `operand_1` by `operand_2` and returns the
    // result.
    float multiplication(float operand_1,float operand_2){
        return(operand_1*operand_2);

    }
    /**
     * The division function takes two float operands and returns their quotient.
     * 
     * @param operand_1 The first operand of the division operation.
     * @param operand_2 The second operand in the division operation.
     * @return The division of operand_1 by operand_2 is being returned.
     */
    float division(float operand_1,float operand_2){
        return(operand_1/operand_2);

    }
    /**
     * The function "square" takes a float number as input and returns the square of that number.
     * 
     * @param operand_1 A float value representing the operand to be squared.
     * @return the square of the operand_1.
     */
    float square(float operand_1){
        return(operand_1*operand_1);
    }

    public static void main(String[] args) {
        Calculator calc=new Calculator();
        float operand_1=10;
        float operand_2=5;
        float add_result=calc.addition(operand_1, operand_2);
        System.out.println("Result is:"+add_result);
        float sub_result=calc.substraction(operand_1, operand_2);
        System.out.println("Result is:"+sub_result);
        float mul_result=calc.multiplication(operand_1, operand_2);
        System.out.println("Result is:"+mul_result);
        float div_result=calc.division(operand_1, operand_2);
        System.out.println("Result is:"+div_result);
        
        float squ_reslt=calc.square(operand_1);
        System.out.println("Result is:"+squ_reslt);
    }
}