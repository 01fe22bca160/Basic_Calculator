class Calculator extends Calcdemo{

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

    // The `public static void main(String[] args)` method is the entry point of the Java program. It
    // is the method that is executed when the program is run.
    public static void main(String[] args) {
        // The code is creating an instance of the `Calculator` class called `calc`. It then assigns
        // the values 10 and 5 to the variables `operand_1` and `operand_2` respectively.
        Calculator calc=new Calculator();
        float operand_1=10;
        float operand_2=5;
        // The code is performing arithmetic operations using the `Calculator` class.
        // The code is calling the `addition` method of the `Calculator` class and passing `operand_1`
        // and `operand_2` as arguments. The method returns the sum of the two operands, which is then
        // assigned to the variable `add_result`. Finally, the result is printed to the console using
        // `System.out.println`.
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

        // The code is calling the `square` method of the `Calculator` class and passing `operand_1` as
        // an argument. The method calculates the square of `operand_1` and returns the result, which
        // is then assigned to the variable `squ_result`. Finally, the result is printed to the console
        // using `System.out.println`.
        float squ_result=calc.square(operand_1);
        System.out.println("Result of square is:"+squ_result);

        // The code `float cub_result=calc.cube(operand_1); System.out.println("Result of cube
        // is:"+cub_result);` is calling a method named `cube` on the `calc` object of the `Calculator`
        // class. However, the `cube` method is not defined in the given code, so it will result in a
        // compilation error.
        float cub_result=calc.cube(operand_1);
        System.out.println("Result of cube is:"+cub_result);

        float mod_result=calc.modulus(operand_1, operand_2);
        System.out.println("Result of modulus is:"+mod_result);
        
    }
}