class Display
{
    static Mega meg=new Mega();
    public static void pythagoreanTriplets(int a)
    {
        int sq,b,c;
        sq=a*a;
        b=sq/2;
        c=b+1;
        System.out.println("Pythagorean triplets are "+a+","+b+","+c);
    }

    public static void pythagoreanTripletsRange(int a,int b)
    {
        int n1,n2,n3;
        System.out.println("Pythagorean triplets within "+a+" to "+b+" are:-");
        for(n1=a;n1<=b;n1++)
        {
            for(n2=n1+1;n2<=b;n2++)
            {
                for(n3=n2+1;n3<=b;n3++)
                {
                    if(n1*n1+n2*n2==n3*n3)
                        System.out.println(n1+" , "+n2+" , "+n3);
                }
            }
        }
    }

    public static void fibonacci(double a)
    {
        a=(int)a;
        int i,x,y,z;
        x=0;
        y=1;
        System.out.print(x+","+y);
        for(i=1;i<=a-2;i++)
        {
            z=x+y;
            System.out.print(","+z);
            x=y;
            y=z;
        }
    }

    public static void tribonacci(double a)
    {
        a=(int)a;
        int i,w,x,y,z;
        w=0;
        x=1;
        y=2;
        System.out.print(w+","+x+","+y);
        for(i=1;i<=a-3;i++)
        {
            z=w+x+y;
            System.out.print(","+z);
            w=x;
            x=y;
            y=z;
        }
    }

    public static void table(double a,double b)
    {
        a=(int)a;
        b=(int)b;
        for(int i=1;i<=b;i++)
        {
            System.out.println(a+"*"+i+"="+(a*i));
        }
    }

    public static void tableRange(int a,int b,int c)
    {
        for(int i=1;i<=c;i++)
        {
            for(int j=a;j<=b;j++)
            {
                System.out.print(j+"x"+i+" = "+(j*i));
                String s=Integer.toString((j*i));
                String t=Integer.toString(i);
                for(int k=1;k<=10-(s.length()+t.length());k++)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void loadMessage()
    {
        String w="LOADING";
        //keeda(w);
        line(w);
        //dance(w);
    }

    public static void clear()
    {
        System.out.print('\u000C');
    }

    public static void displayMenu()
    {
        System.out.println(meg.mainmenu);
    }

    public static void displaySub(int a)
    {
        System.out.println("Sub-category functions are:");
        System.out.println("Enter your choice");
        System.out.println(meg.sub[a]);
    }

    public static void keeda(String mes)
    {
        int i;
        long d;
        for(i=0;i<=3;i++)
        {
            System.out.print('\u000C');
            System.out.print(mes+"-");
            for(d=0;d<=399999999l;d++);
            System.out.print('\u000C');
            System.out.print(mes+"_");
            for(d=0;d<=399999999l;d++);
        }
    }

    public static void line(String mes)
    {
        int i,d,p,del;

        for(d=1;d<=30;d++)
        {
            System.out.print(mes);
            for(p=1;p<d;p++)
            {
                System.out.print(".");
            }
            System.out.print("-");
            for(p=d+1;p<=30;p++)
            {
                System.out.print(".");
            }
            for(del=1;del<=49999999l;del++);
            System.out.print('\u000C');
        }

    }

    public static void dance(String mes)
    {
        System.out.print(mes);
        for(int i=0;i<10;i++)
        {
            for(long j=0;j<99999999;j++);
            System.out.print(".");
        }
    }
}