/**
 * The Calcdemo class extends the Calculator class and includes methods for calculating the square,
 * cube, and modulus of two operands.
 */
class Calcdemo {
        /**
         * The function "square" takes a float number as input and returns the square of that number.
         * 
         * @param operand_1 A float value that represents the operand to be squared.
         * @return the square of the operand_1.
         */
        float square(float operand_1){
            return(operand_1*operand_1);
        }
        // The `cube` method in the `Calcdemo` class is calculating the cube of a given operand.
        float cube(float operand_1){
            return(operand_1*operand_1*operand_1);
        }
        /**
         * The function calculates the modulus of two floating-point numbers.
         * 
         * @param operand_1 The first operand for the modulus operation.
         * @param operand_2 The second operand in the modulus operation.
         * @return the modulus (remainder) of operand_1 divided by operand_2.
         */
        float modulus(float operand_1,float operand_2){
            return(operand_1%operand_2);
        }
    }
            

