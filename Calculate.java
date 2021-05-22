class Calculate
{
    public static boolean isSunny(double a)
    {
        double sq,d;
        sq=Math.sqrt(a+1);
        d=sq-Math.floor(sq);
        if(d==0.0)
        return true;
        else
        return false;
    }
    public static boolean isUnique(int a)
    {
        int r,d,num,f,c=0;
        for(d=0;d<=9;d++)
        {
            f=0;
            num=a;
            while(num!=0)
            {
                r=num%10;
                num/=10;
                if(r==d)
                ++f;
            }
            if(f>1)
            ++c;
        }
        if(c==0)
        return true;
        else
        return false;
    }
    public static boolean isDuck(int a)
    {
        int r,f=0;
        while(a!=0)
        {
            r=a%10;
            a/=10;
            if(r==0)
            ++f;
        }
        if(f>0)
        return true;
        else
        return false;
    }
    public static boolean isMagic(int a)
    {
        int r,s;
        while(a>9)
        {
            s=0;
            while(a!=0)
            {
                r=a%10;
                a/=10;
                s+=r;
            }
            a=s;
        }
        if(a==1)
        return true;
        else
        return false;
    }
    public static boolean isHappy(int a)
    {
        int r,s;
        while(a>9)
        {
            s=0;
            while(a!=0)
            {
                r=a%10;
                a/=10;
                s+=r*r;
            }
            a=s;
        }
        if(a==1)
        return true;
        else
        return false;
    }
    public static boolean isAutomorphic(int a)
    {
        int d=0,p,sq,rem,n=a;
        sq=a*a;
        while(n!=0)
        {
            ++d;
            n/=10;
        }
        p=(int)Math.pow(10,d);
        rem=sq%p;
        if(rem==a)
        return true;
        else
        return false;
    }
    public static int toDecimal(int a)
    {
        int r,s=0,x=0;
        while(a!=0)
        {
            r=a%10;
            a/=10;
            s+=r*(int)Math.pow(2,x++);
        }
        return s;
    }
    public static int toBinary(int a)
    {
        int r,s=0,x=0;
        while(a!=0)
        {
            r=a%2;
            a/=2;
            s+=r*(int)Math.pow(10,x++);
        }
        return s;
    }
    public static boolean areAmicable(double a,double b)
    {
        a=(int)a;
        b=(int)b;
        int i,s1=0,s2=0;
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            s1+=i;
        }
        for(i=1;i<b;i++)
        {
            if(b%i==0)
            s2+=i;
        }
        if(s1==b&&s2==a)
        return true;
        else
        return false;
    }
    public static boolean isPerfect(double a)
    {
        a=(int)a;
        int i,s=0;
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            s+=i;
        }
        if(s==a)
        return true;
        else
        return false;
    }
    public static boolean isArmstrong(double a)
    {
        a=(int)a;
        int r,d=0,s=0,n1=(int)a,n2=(int)a;
        while(n1!=0)
        {
            ++d;
            n1/=10;
        }
        while(n2!=0)
        {
            r=n2%10;
            n2/=10;
            s=s+(int)Math.pow(r,d);
        }
        if(s==a)
        return true;
        else
        return false;
    }
    public static boolean isDisarium(double a)
    {
        a=(int)a;
        int n1=(int)a,n2=(int)a,d=0,s=0,r;
        while(n1!=0)
        {
            ++d;
            n1/=10;
        }
        while(n2!=0)
        {
            r=n2%10;
            n2/=10;
            s+=(int)Math.pow(r,d--);
        }
        if(s==a)
        return true;
        else
        return false;
    }
    public static boolean isSpecial(double a)
    {
        a=(int)a;
        int n1=(int)a,i,r,f,s=0;
        while(n1!=0)
        {
            r=n1%10;
            n1/=10;
            f=1;
            for(i=1;i<=r;i++)
            {
                f*=i;
            }
            s+=f;
        }
        if(s==a)
        return true;
        else
        return false;
    }
    public static int multifactorial(double a,double x)
    {
        a=(int)a;
        x=(int)x;
        int i,f=1;
        for(i=(int)a;i>=1;i-=x)
        {
            f*=i;
        }
        return f;
    }
    public static boolean isNeon(double a)
    {
        a=(int)a;
        int s=0,sq=(int)a*(int)a,r;
        while(sq!=0)
        {
            r=sq%10;
            sq/=10;
            s+=r;
        }
        if(s==a)
        return true;
        else
        return false;
    }
    public static int reverse(double a)
    {
        a=(int)a;
        int r,rev=0;
        while(a!=0)
        {
            r=(int)a%10;
            rev=rev*10+r;
            a/=10;
        }
        return rev;
    }
    public static boolean isBuzz(double a)
    {
        if(a%7==0||a%10==7)
        return true;
        else
        return false;
    }
    public static boolean isAppropriate(double a)
    {
        if(a%2==0&&a%3==0)
        return true;
        else
        return false;
    }
    public static double hcf(double a,double b)
    {
        double i,h=0.0;
        for(i=1;i<=Math.min(a,b);i++)
        {
            if(a%i==0.0&&b%i==0.0)
            h=i;
        }
        return h;
    }
    public static double lcm(double a,double b)
    {
        double i,l=0;
        for(i=a*b;i>=Math.max(a,b);i--)
        {
            if(i%a==0&&i%b==0)
            l=i;
        }
        return l;
    }
    public static boolean isPrime(double a)
    {
        a=(int)a;
        int i,c=0;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            ++c;
        }
        if(c==2)
        return true;
        else
        return false;
    }
    public static double factorial(double a)
    {
        int i,f=1;
        for(i=1;i<=(int)a;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static boolean isRightTruncatablePrime(int a)
    {
        int i,c=0;
        boolean ch=true;
        while(a!=0)
        {
            c=0;
            for(i=1;i<=a;i++)
            {
                if(a%i==0)
                ++c;
            }
            if(c!=2)
            {
                return false;
            }
            a/=10;
        }
        if(a==0)
        return true;
        else
        return false;
    }
    public static boolean isTwinPrime(double a,double b)
    {
        a=(int)a;
        b=(int)b;
        int i,ca=0,cb=0;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            ++ca;
        }
        for(i=1;i<=b;i++)
        {
            if(b%i==0)
            ++cb;
        }
        if(ca==2&&cb==2&&(a-b==2||b-a==2))
        return true;
        else
        return false;
    }
    public static int sumOfDigits(double a)
    {
        a=(int)a;
        int s=0,d;
        while(a!=0)
        {
            d=(int)a%10;
            a/=10;
            s+=d;
        }
        return s;
    }
    public static int productOfDigits(int a)
    {
        int p=1,d;
        while(a!=0)
        {
            d=a%10;
            a/=10;
            p*=d;
        }
        return p;
    }
    public static boolean isPalindrome(int a)
    {
        int b=a,rev=0,d;
        while(a!=0)
        {
            d=a%10;
            a/=10;
            rev=(rev*10)+d;
        }
        if(b==rev)
        return true;
        else
        return false;
    }
}