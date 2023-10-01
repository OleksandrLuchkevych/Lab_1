package Lab1.Task3;

public class Validation {
    public static void main(String[] args)
    {
        String email = "wer12b@gmail.com";

        if(validateEmail(email)){
            System.out.println("Email valid");}
        else {
            System.out.println("Invalid email!");
        }
    }

    private static boolean validateEmail(final String email) {
        if (email.isEmpty() || email == null )
        {return false;}

        final String[] emailPart = email.split("@");
        if(emailPart.length != 2 || emailPart[0].isEmpty() || emailPart[1].isEmpty() || !emailPart[1].contains("."))
        {return false;}

       return true;
    }
}
