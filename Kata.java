package Exercise;

public class Kata {
    public double calculateAverage(int firstValue, int secondValue, int thirdValue){
        double average = ((double)(firstValue + secondValue + thirdValue))/3;
        return average;
    }
    public String calculateGrade(int score){
        if(score > 100)
            return "Invalid Score";
        else if (score < 0)
                return "invalid score";
        else if (score >= 90)
            return "Grade A";
            else if (score >= 80)
                return "Grade B";
            else if (score >= 70)
                return "Grade C";
                else if(score >= 60)
                    return "Grade D";
                    else
                        return "Fail";
    }
    public boolean isEven(int number){
        if(number % 2 == 0)
            return true;
            else
                return false;
    }
}
