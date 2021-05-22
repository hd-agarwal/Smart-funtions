class Words
{
       public static boolean isPalindrome(String a)
       {
           int i,l=a.length();
           char ch;
           String rev="";
           for(i=l-1;i>=0;i--)
           {
               ch=a.charAt(i);
               rev+=ch;
           }
           if(rev.equalsIgnoreCase(a))
           return true;
           else
           return false;
       }
       public static String reverse(String a)    
       {
           int i,l=a.length();
           String rev="";
           char ch;
           for(i=0;i<l;i++)
           {
              ch=a.charAt(i);
              rev=ch+rev;
           }
           return rev;
       }
       public static String toIndianForm(String a)
       {
           a=" "+a.trim();
           int i,pos=a.lastIndexOf(' ');
           String s="";
           for(i=0;i<pos;i++)
           {
                if(a.charAt(i)==' ')
                s=s+a.charAt(i+1)+".";
           }
           s=s+a.substring(pos+1);
           return s;
       }
       public static String toAmericanForm(String a)
       {
           a=" "+a.trim();
           int i,pos=a.lastIndexOf(' ');
           String s="";
           s=s+a.substring(pos+1)+" ";
           for(i=0;i<pos;i++)
           {
               if(a.charAt(i)==' ')
               s=s+a.charAt(i+1)+".";
           }
           return s;
       }
       public static boolean areAnagrams(String a,String b)
       {
           a=a.toLowerCase();b=b.toLowerCase();
           int i;
           char c,cha,chb;
           String a1="",b1="";
           if(a.length()==b.length())
           {
               for(c='a';c<='z';c++)
               {
                   for(i=0;i<a.length();i++)
                   {
                       cha=a.charAt(i);
                       if(c==cha)
                       a1+=cha;
                       chb=b.charAt(i);
                       if(c==chb)
                       b1+=chb;
                   }
               }
               if(a1.equals(b1))
               return true;
               else
               return false;
           }
           else
           return false;
       }
       public static String toPiglatin(String a)
       {
           int c=0,i;
           char ch;
           String s="";
           for(i=0;i<a.length();i++)
           {
               ch=a.charAt(i);
               if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
               {
                   ++c;
                   if(Character.isLowerCase(a.charAt(0)))
                   s=a.substring(i)+a.substring(0,i)+"ay";
                   else
                   s=a.substring(i)+a.substring(0,i)+"AY";
                   break;
               }
           }
           if(c==0)
           s=a;
           return s;
       }
       public static String encode(String a,int n)
       {
           int i,l=a.length();
           char ch;
           String s="";
           for(i=0;i<l;i++)
           {
               ch=a.charAt(i);
               if(Character.isLetter(ch))
               {
                   if(Character.isUpperCase(ch))
                   {
                       ch+=n;
                       while(ch>90)
                       {
                           ch-=26;
                       }
                   }
                   else
                   {
                       ch+=n;
                       while(ch>122)
                       {
                           ch-=26;
                       }
                   }
               }
               s+=ch;
           }
           return s;
       }
       public static String decode(String a,int n)
       {
           int i,l=a.length();
           char ch;
           String s="";
           for(i=0;i<l;i++)
           {
               ch=a.charAt(i);
               if(Character.isLetter(ch))
               {
                   if(Character.isUpperCase(ch))
                   {
                       ch-=n;
                       while(ch<65)
                       {
                           ch+=26;
                       }
                   }
                   else
                   {
                       ch-=n;
                       while(ch<97)
                       {
                           ch+=26;
                       }
                   }
               }
               s+=ch;
           }
           return s;
       }
}