public class Main {
    public static void main(String[] args)
    {

        int birthMonth = 8 ;
        if (birthMonth <= 12 && birthMonth >= 1) //if birthmonth is between 1 and 12 then the code in the block executes
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else if (birthMonth > 12 || birthMonth < 1) // if birthmonth is outside the range of 1-12 an output is returned that the month is invalid
        {
            System.out.println("You entered and incorrect birth month value: " + birthMonth);
        }

    }
}