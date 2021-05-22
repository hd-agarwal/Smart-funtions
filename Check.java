class Check
{
    public static boolean isNumber(String s)
    {
        int u;
        for(int i=0;i<s.length();i++)
        {
           u=(int)s.charAt(i);
           if(u<=48||u>=57)
           return false;
        }
        return true;
    }
    public static boolean isBinary(int n)
    {
        int d;
        do
        {
            d=n%10;
            n/=10;
            if(d!=1&&d!=0)
            return false;
        }while(n!=0);
        return true;
    }
}