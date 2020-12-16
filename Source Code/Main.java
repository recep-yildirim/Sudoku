package /* package name */ ;

import java.util.Scanner ;

public class Main
{
    public static void main (String [] args)
    {
        Check check = new Check () ;

        do
        {
            check.userInputs () ;

        }   while (! (check.finishChecker ())) ;

        System.out.println ("Congratulations.!") ;
        System.out.println ("You won.") ;
    }
}