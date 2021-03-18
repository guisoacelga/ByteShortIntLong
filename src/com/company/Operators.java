package com.company;

public class Operators {
    public static void main(String[] args) {
        int result = 1 + 2;
        result = 3;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4/3) = 1
        System.out.println("4 % 3 = " + result);

        //result = result + 1;
        result ++; // 1 + 1 = 2
        System.out.println("result++ (1 + 1) = " + result);

        //result = result -1;
        result--; // 2 - 1 = 1
        System.out.println("result -- (2 - 1) = " + result);

        //result = result + 2;
        result += 2; //1 + 2 = 3
        System.out.println("result += 2 (1 + 2) = " + result);

        //result = result * 10;
        result *= 10;
        System.out.println("result *= 10 (3 * 10) = " + result);

        //result = result / 3;
        result /= 3;
        System.out.println("result /= 3 (30 / 3) = " + result);

        //result = result - 2;
        result -= 2; //10 - 2 = 8
        System.out.println("result -= 2 (10 - 2) = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!!");
        }

        int topScore = 100;
        if (topScore != 100) {
            System.out.println("You got the high score!");
        }

        if (topScore > 100) {
            System.out.println("You got the high score!");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }




    }


}
