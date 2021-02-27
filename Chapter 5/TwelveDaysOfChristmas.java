package chapterFive;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        int dayCounter = 1;
        String day = "";

        while (dayCounter <= 12) {

            System.out.println("Verse " + dayCounter);

            if (dayCounter == 1)
                day = "first";
            else if (dayCounter == 2)
                day = "second";
            else if (dayCounter == 3)
                day = "third";
            else if (dayCounter == 4)
                day = "fourth";
            else if (dayCounter == 5)
                day = "fifth";
            else if (dayCounter == 6)
                day = "sixth";
            else if (dayCounter == 7)
                day = "seventh";
            else if (dayCounter == 8)
                day = "eighth";
            else if (dayCounter == 9)
                day = "ninth";
            else if (dayCounter == 10)
                day = "tenth";
            else if (dayCounter == 11)
                day = "eleventh";
            else if (dayCounter == 12)
                day = "twelfth";

            String statement = "On the " + day + " day of Christmas, my true love sent to me; ";

            switch (dayCounter) {
                case 1 -> System.out.println(statement);
                case 2 -> System.out.println(statement);
                case 3 -> System.out.println(statement);
                case 4 -> System.out.println(statement);
                case 5 -> System.out.println(statement);
                case 6 -> System.out.println(statement);
                case 7 -> System.out.println(statement);
                case 8 -> System.out.println(statement);
                case 9 -> System.out.println(statement);
                case 10 -> System.out.println(statement);
                case 11 -> System.out.println(statement);
                case 12 -> System.out.println(statement);
            }

            switch (dayCounter) {
                case 12:
                    System.out.println("Twelve drummers drumming,");
                case 11:
                    System.out.println("Eleven pipers piping");
                case 10:
                    System.out.println("Ten lords a-leaping");
                case 9:
                    System.out.println("Nine ladies dancing");
                case 8:
                    System.out.println("Eight maids a-milking");
                case 7:
                    System.out.println("Seven swans a-swimming");
                case 6:
                    System.out.println("Six geese a-laying");
                case 5:
                    System.out.println("Five golden rings");
                case 4:
                    System.out.println("Four calling birds");
                case 3:
                    System.out.println("Three French hens");
                case 2:
                    System.out.println("Two turtle doves");
                case 1:
                    if (dayCounter == 1)
                        System.out.println("A partridge in a pear tree");
                    else
                        System.out.println("And a partridge in a pear tree");
                    break;
            }
            dayCounter++;
            System.out.println();
        }
//    }
//        public static void main(String[] args) {
//
//            int dayCounter = 1;
//
//            System.out.println("12 Days Of Christmas Song");
//            while(dayCounter <= 12) {
//                System.out.printf("Verse %d\n", dayCounter);
//                System.out.print("On the ");
//                printDay(dayCounter);
//                System.out.print(" day of Christmas my true love sent to me");
//                printRemainingVerses(dayCounter);
//                ++dayCounter;
//            }
//        }
//
//        public static void printDay(int dayCounter){
//            switch (dayCounter){
//                case 1:
//                    System.out.print("first");
//                    break;
//                case 2:
//                    System.out.println("second");
//                    break;
//                case 3:
//                    System.out.println("third");
//                    break;
//                case 4:
//                    System.out.println("fourth");
//                    break;
//                case 5:
//                    System.out.println("fifth");
//                    break;
//                case 6:
//                    System.out.println("sixth");
//                    break;
//                case 7:
//                    System.out.println("seventh");
//                    break;
//                case 8:
//                    System.out.println("eighth");
//                    break;
//                case 9:
//                    System.out.println("ninth");
//                    break;
//                case 10:
//                    System.out.println("tenth");
//                    break;
//                case 11:
//                    System.out.println("eleventh");
//                    break;
//                case 12:
//                    System.out.println("twelfth");
//            }
//        }
//
//        public static void printRemainingVerses(int dayCounter){
//            switch (dayCounter){
//                case 12:
//                    System.out.println("Twelve drummers drumming");
//                case 11:
//                    System.out.println("Eleven pipers piping");
//                case 10:
//                    System.out.println("Ten lords a-leaping");
//                case 9:
//                    System.out.println("Nine ladies dancing");
//                case 8:
//                    System.out.println("Eight maids a-milking");
//                case 7:
//                    System.out.println("Seven swans a-swimming");
//                case 6:
//                    System.out.println("Six geese a-laying");
//                case 5:
//                    System.out.println("Five golden rings");
//                case 4:
//                    System.out.println("Four calling birds");
//                case 3:
//                    System.out.println("Three french hens");
//                case 2 :
//                    System.out.println("Two turtle doves");
//                case 1:
//                    if (dayCounter == 1){
//                        System.out.println("A partridge in a pear tree ");
//                    }
//                    else {
//                        System.out.println("And a partridge in a pear tree");
//                    }
//                    break;
//            }
//        }
    }
}
