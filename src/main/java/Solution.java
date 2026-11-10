public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    String checkStr;
    String returnStr;
    String checkFront;
    String checkEnd;
    String checkS1;
    String checkS2;

    public boolean endsLy(String x) {
        if (x.length() >= 2) {
            checkStr = x.substring(x.length() - 2);
            if (checkStr.equals("ly")) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
        return false;
        }
    }

    public String conCat(String s1, String s2) {
        if (s1.length() == 0) {
            return s2;
        }
        else if (s2.length() == 0 ) {
            return s1;
        }
        else {
            checkS2 = s2.substring(0, 1);
            checkS1 = s1.substring(s1.length() - 1);
            if (checkS2.equals(checkS1)) {
                returnStr = s1.substring(0, s1.length()) + s2.substring(1);
                return returnStr;
            }
            else {
                returnStr = s1 + s2;
                return returnStr;
            }
        }
    }

    public String withoutX(String s1) {
        returnStr = s1;
        checkFront = s1.substring(0,1);
        checkEnd = s1.substring(s1.length() - 1);
        if ( (checkFront.equals("x")) && (checkEnd.equals("x")) ) {
            returnStr = returnStr.substring(1, s1.length() - 1);
        }
        else if (checkEnd.equals("x")) {
            returnStr = returnStr.substring(0, s1.length() - 1);
        }
        else if (checkFront.equals("x")) {
            returnStr = returnStr.substring(1);
        }
        else {
            returnStr = s1;
        }
        return returnStr;
    }

    public String fizzString(String s1) {
        returnStr = s1;
        checkFront = s1.substring(0,1);
        checkEnd = s1.substring(s1.length() - 1);
        if ( (checkFront.equals("f")) && (checkEnd.equals("b")) ) {
            returnStr = "FizzBuzz";
        }
        else if (checkEnd.equals("b")) {
            returnStr = "Buzz";
        }
        else if (checkFront.equals("f")) {
            returnStr = "Fizz";
        }
        return returnStr;
    }

    public String fizzString2(int x) {
        if ( ((x % 3) == 0) && ((x % 5) == 0) ) {
            returnStr = "FizzBuzz!";
            return returnStr;
        }
        else if ( (x % 3) == 0 ) {
            returnStr = "Fizz!";
            return returnStr;
        }
        else if ( (x % 5) == 0) {
            returnStr = "Buzz!";
            return returnStr;
        }
        else {
            returnStr = x + "!";
            return returnStr;
        }
    }

}
