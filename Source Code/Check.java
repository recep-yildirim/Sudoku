package /* package name */ ;

import java.util.Scanner ;

public class Check extends Create
{
    private Scanner scanner = new Scanner (System.in) ;

    private int row = 0 , column = 0 ;
    private int value = 0 ;

    public void userInputs ()
    {
        System.out.print ("Enter the row number : ") ;

        do
        {
            row = scanner.nextInt () - 1 ;

            if (row < 0 || row > 8)
            {
                System.out.println ("Row number must be between 1 and 9.") ;
                System.out.print ("Please try again : ") ;
            }

        } while (row < 0 || row > 8) ;

        System.out.print ("Enter the column number : ") ;

        do
        {
            column = scanner.nextInt () - 1 ;

            if (column < 0 || column > 8)
            {
                System.out.println ("Column number must be between 1 and 9.") ;
                System.out.print ("Please try again : ") ;
            }

        } while (column < 0 || column > 8) ;

        System.out.print ("Enter your value : ") ;

        do
        {
            value = scanner.nextInt () ;

            if (value < 1 || value > 9)
            {
                System.out.println ("Your value must be between 1 and 9.") ;
                System.out.print ("Please try again : ") ;
            }

        } while (value < 1 || value > 9) ;

        checkInputs () ;
    }

    private void checkInputs ()
    {
        boolean column = checkColumn () ;
        boolean row = checkRow () ;
        boolean block = checkBlock () ;

        if (column && row && block)
        {
            this.table [this.row][this.column] = value ;

            this.printTable () ;
        }

        else
        {
            if (column)
            {
                System.out.println ("There is already this value in the same row or block.") ;
            }

            else if (row)
            {
                System.out.println ("There is already this value in the same column or block.") ;
            }

            else if (block)
            {
                System.out.println ("There is already this value in the same column or row.") ;
            }

            else
            {
                System.out.println ("There is already this value in the same column and row and block.") ;
            }

            System.out.println ("Please try again.") ;

            userInputs () ;
        }
    }

    private boolean checkColumn ()
    {
        for (int i = 0 ; i < this.table.length ; i ++)
        {
            if (this.table [i][this.column] == this.value)
            {
                return false ;
            }
        }

        return true ;
    }

    private boolean checkRow ()
    {
        for (int i = 0 ; i < this.table.length ; i ++)
        {
            if (this.table [row][i] == this.value)
            {
                return false ;
            }
        }

        return true ;
    }

    private boolean checkBlock ()
    {
        int [] block = findBlock () ;

        for (int i = block [0] ; i <= block [0] + 2 ; i ++)
        {
            for (int j = block [1] ; j <= block [1] + 2 ; j ++)
            {
                if (this.table [i][j] == this.value)
                {
                    return false ;
                }
            }
        }

        return true ;
    }

    private int [] findBlock ()
    {
        int [] block = new int [2] ;

        if (row >= 0 && row <= 2)
        {
            block [0] = 0 ;
        }

        else if (row >= 3 && row <= 5)
        {
            block [0] = 3 ;
        }

        else
        {
            block [0] = 6 ;
        }

        if (column >= 0 && column <= 2)
        {
            block [1] = 0 ;
        }

        else if (column >= 3 && column <= 5)
        {
            block [1] = 3 ;
        }

        else
        {
            block [1] = 6 ;
        }

        return block ;
    }

    public boolean finishChecker ()
    {
        for (int i = 0 ; i < this.table.length ; i ++)
        {
            for (int j = 0 ; j < this.table.length ; j ++)
            {
                if (this.table [i][j] == 0)
                {
                    return false ;
                }
            }
        }

        return true ;
    }
}