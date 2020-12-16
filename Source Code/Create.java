package /* package name */ ;

import java.util.Random ;

public class Create
{
    protected int [][] table = null ;

    public Create ()
    {
        initializeTable () ;
        printTable () ;
    }

    private void initializeTable ()
    {
        Random random = new Random () ;

        Tables tables = new Tables () ;

        this.table = tables.read(random.nextInt (10)) ;
    }

    protected void printTable ()
    {
        int size = this.table.length + (this.table.length / 3) + 1 ;

        System.out.println () ;

        for (int i = 0 ; i < this.table.length ; i ++)
        {
            if (i % 3 == 0)
            {
                for (int j = 0 ; j < size ; j ++)
                {
                    System.out.print ("* ") ;
                }

                System.out.println () ;
            }

            System.out.print ("* ") ;

            for (int j = 0 ; j < this.table.length ; j ++)
            {
                if (this.table [i][j] == 0)
                {
                    System.out.print("-");
                }

                else
                {
                    System.out.print (this.table [i][j]) ;
                }

                System.out.print (" ") ;

                if ((j + 1) % 3 == 0)
                {
                    System.out.print("* ");
                }
            }

            System.out.println () ;

            if ((i + 1) == this.table.length)
            {
                for (int j = 0 ; j < size ; j ++)
                {
                    System.out.print ("* ") ;
                }

                System.out.println () ;
            }
        }

        System.out.println () ;
    }
}