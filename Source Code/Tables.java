package /* package name */ ;

import java.io.File ;
import java.io.FileNotFoundException;
import java.util.Scanner ;
import java.lang.String ;

public class Tables
{
    File file = null ;

    public int [][] read (int number)
    {
        int [][] array = new int [9][9] ;
        String path = null ;

        switch (number)
        {
            case 0 :
                path = /* path where tables folder is /Tables/first.txt */ ;

                break ;

            case 1  :
                path = /* path where tables folder is /Tables/second.txt */ ;

                break ;

            case 2 :
                path = /* path where tables folder is /Tables/third.txt */ ;

                break ;

            case 3 :
                path = /* path where tables folder is /Tables/fourth.txt */;

                break ;

            case 4 :
                path = /* path where tables folder is /Tables/fifth.txt */ ;

                break ;

            case 5 :
                path = /* path where tables folder is /Tables/sixth.txt */ ;

                break ;

            case 6 :
                path = /* path where tables folder is /Tables/seventh.txt */ ;

                break ;

            case 7 :
                path = /* path where tables folder is /Tables/eigth.txt */ ;

                break ;

            case 8 :
                path = /* path where tables folder is /Tables/ninth.txt */ ;

                break ;

            case 9 :
                path = /* path where tables folder is /Tables/tenth.txt */ ;

                break ;
        }

        this.file = new File (path) ;

        try
        {
            Scanner scanner = new Scanner (this.file) ;

            for (int i = 0 ; i < 9 ; i ++)
            {
                array [i] = add (scanner.nextLine ()) ;
            }
        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        return array ;
    }

    private int [] add (String line)
    {
        int [] array = new int [9] ;

        for (int i = 0 ; i < 9 ; i ++)
        {
            array [i] = Integer.parseInt (Character.toString (line.charAt (i))) ;
        }

        return array ;
    }
}