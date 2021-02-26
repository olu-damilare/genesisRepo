package chapterFour;

public class BinaryToDecimal {

    public int convertBinaryToDecimal(int binaryValue){
        int multipleOfTwo = 0;
        int startValue = 0;

        int remainder = binaryValue % 10;
            multipleOfTwo *= 2;
            if (remainder ==1)
                startValue += multipleOfTwo;

            return startValue;

    }
}
