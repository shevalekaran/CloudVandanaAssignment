// B. Enter a Roman Number as input and convert it to an integer. (ex IX = 9). CandidateName = Karan_Shewale  www.shevalekaran1@gmail.com


public class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int currValue = getValue(c);
            
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            
            prevValue = currValue;
        }
        
        return result;
    }
    
    private static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    
    public static void main(String[] args) {
        String romanNumeral = "IX";
        int integer = romanToInt(romanNumeral);
        System.out.println("Roman Number: " + romanNumeral);
        System.out.println("Integer: " + integer);
    }
}

//  OUTPUT = Roman Number: IX    Integer: 9