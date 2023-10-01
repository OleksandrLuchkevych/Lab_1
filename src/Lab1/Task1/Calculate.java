package Lab1.Task1;

public class Calculate {
    public static double Add(final double first ,final double second)
    {
        return first+second;
    }
    public static double Subtract(final double first ,final double second)
    {
        return first-second;
    }
    public static double Multiply(final double first ,final double second)
    {
        return  first*second;
    }
    public static double Divide(final double first ,final double second)
    {
        if(second == 0)
        {
            throw new ArithmeticException("Error: division by zero");
        }
        else
        {return first/second;}
    }
}