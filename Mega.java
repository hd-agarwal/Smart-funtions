import java.io.*;
class Mega
{
    static String mainmenu="\nMAIN MENU\nThe choices are--\nSTRING FUNCTIONS\n0--> To play with WORDS/SENTENCES\n\nMATH FUNCTIONS\n1--> To perform binary related conversions\n2--> To check for a special kind of number\n3--> To find factorial of a no.\n4--> To play with the digits of a no.\n5--> To check for prime nos.\n6--> To find the hcf/lcm of nos.\n7--> To print the table of nos.\n8--> To print the fibo/tribonacci series\n9-->To find the pythagorean triplets\nAny other no.-->To quit";
    static String sub[]={"1-->To check for palindromic sentence\n2-->To reverse a sentence\n3-->To change a name to Indian/American form\n4-->To change a word to piglatin form\n5-->To check if two words are anagrams or not\n6-->To encode/decode a sentence\n7-->To see MAIN MENU\nAny other no.-->To exit","1-->To convert a binary no. to decimal form\n2-->To convert a decimal no. to binary form\n3-->To see MAIN MENU\nAny other no.-->To exit","1-->To check for Sunny no.\n2-->To check for Unique no.\n3-->To check for Duck no.\n4-->To check for Magic no.\n5-->To check for Happy no.\n6-->To check for Automorphic no.\n7-->To check for Amicable nos.\n8-->To check for Perfect no.\n9-->To check for Armstrong no.\n10-->To check for Disarium no.\n11-->To check for Special no.\n12-->To check for Neon no.\n13-->To check for Buzz no.\n14-->To check for Appropriate no.\n15-->To check for Prime no.\n16-->To check for Right Truncatable prime no.\n17-->To check for Twin prime no.\n18-->To check for Palindrome no.\n19-->To see the MAIN MENU\nAny other no.-->To exit","1-->To find the factorial of a no.\n2-->To find the multifactorial of a no.\n3-->To see the MAIN MENU\nAny other no.-->To exit","1-->To reverse the digits of a no.\n2-->To find the sum of digits of a no.\n3-->To find the product of digits of a no.\n4-->To find if a no. is palindrome\n5-->To see the MAIN MENU\nAny other no.-->To exit","1-->To check if a no. is prime or not\n2-->To check if a no. is right truncatable prime or not\n3-->To see the MAIN MENU\nAny other no.-->To exit","1-->To find the hcf of no.\n2-->To find the lcm of no.\n3-->To see the MAIN MENU\nAny other no.-->To exit","1-->To print the table of nos.\n2-->To print the tables of a given range of nos.\n3-->To see the MAIN MENU\nAny other no.-->To exit","1-->To print the fibonacci series\n2-->To print the tribonacci series\n3-->To see the MAIN MENU\nAny other no.-->To exit","1-->To find the pythegorean triplets of a no.\n2-->To find all the pythegorean triplets within a range\n3-->To see the MAIN MENU\nAny other no.-->To exit"};
    static Display dis=new Display();
    static Words wor=new Words();
    static Calculate cal=new Calculate();
    static Check che=new Check();
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("WELCOME!!  This is an interesting program where you'll be able to perform a lot of functions");
        System.out.println("So, Do you want to start?");
        L1:
        for(;;)
        {
            System.out.println("Enter -->1 to START");
            System.out.println("      -->Any other no. to EXIT");
            int c=Integer.parseInt(br.readLine());
            dis.clear();
            switch(c)
            {
                case 1://if the user chooses to start
                L2:
                for(;;)
                {
                    dis.loadMessage();
                    dis.clear();
                    dis.displayMenu();
                    System.out.println("Enter your choice");
                    int c2=Integer.parseInt(br.readLine());
                    dis.clear();
                    dis.loadMessage();
                    dis.clear();
                    if(c2>=0&&c2<=9)
                    {
                        L3:
                        for(;;)
                        {
                            dis.clear();
                            dis.loadMessage();
                            dis.clear();
                            System.out.println("SUB MENU ----->\n");
                            dis.displaySub(c2);
                            System.out.println("\nEnter your choice");
                            int c3=Integer.parseInt(br.readLine());
                            dis.clear();
                            dis.loadMessage();
                            dis.clear();
                            L4:
                            for(;;)
                            {
                                if(c2==0&&c3>=1&&c3<=6)
                                {
                                    System.out.println("\nEnter your String....");
                                    String s=br.readLine();
                                    if(c3==1)
                                    System.out.println(wor.isPalindrome(s)?"Yes, the String is a palindrome":"No, the String is not a palindrome");
                                    else if(c3==2)
                                    System.out.println("Reverse String is --  "+wor.reverse(s));
                                    else if(c3==3)
                                    {   
                                        System.out.println("The Name in Indian form is --  "+wor.toIndianForm(s));
                                        System.out.println("The Name in American form is --  "+wor.toAmericanForm(s));
                                    }
                                    else if(c3==4)
                                    System.out.println("Piglatin form is --  "+wor.toPiglatin(s));
                                    else if(c3==5)
                                    {
                                        System.out.println("Enter another String...");
                                        String s1=br.readLine();
                                        System.out.println(wor.areAnagrams(s,s1)?"Yes, they are anagrams":"No, They are not anagrams");
                                    }
                                    else if(c3==6)
                                    {
                                        System.out.println("Enter 1-->To Encode");
                                        System.out.println("      2-->To Decode");
                                        int ed=Integer.parseInt(br.readLine());
                                        System.out.println("Enter the factor");
                                        int f=Integer.parseInt(br.readLine());
                                        if(ed==1)
                                        System.out.println("Encoded String is --  "+wor.encode(s,f));
                                        else
                                        System.out.println("Decoded String is --  "+wor.decode(s,f));
                                    }
                                }
                                else if(c2==1&&c3>=1&&c3<=2)
                                {
                                    if(c3==1)
                                    {
                                        System.out.println("Enter Binary no. ...");
                                        String bins=br.readLine();
                                        int bin=Integer.parseInt(bins);
                                        int count=0;
                                        for(int l=0;l<bins.length();l++)
                                        {
                                            if(bins.charAt(l)!='1'&&bins.charAt(l)!='0')
                                            count++;
                                        }
                                        System.out.println(count==0?"Decimal form no. is --  "+cal.toDecimal(bin):"It is not a  binary no.");
                                    }
                                    else if(c3==2)
                                    {
                                        System.out.println("Enter Decimal no. ...");
                                        int dec=Integer.parseInt(br.readLine());
                                        System.out.println("Binary form no. is --  "+cal.toBinary(dec));
                                    }
                                }
                                else if(c2==2&&c3>=1&&c3<=18)
                                {
                                    System.out.println("Enter the no. ...");
                                    int a=Integer.parseInt(br.readLine());
                                    if(c3==1)
                                    System.out.println(cal.isSunny((double)a)?"Yes, it is a sunny no.":"No, it is not a sunny no.");
                                    else if(c3==2)
                                    System.out.println(cal.isUnique(a)?"Yes, it is a unique no.":"No, it is not a unique no.");
                                    else if(c3==3)
                                    System.out.println(cal.isDuck(a)?"Yes, it is a duck no.":"No, it is not a duck no.");
                                    else if(c3==4)
                                    System.out.println(cal.isMagic(a)?"Yes, it is a magic no.":"No, it is not a magic no.");
                                    else if(c3==5)
                                    System.out.println(cal.isHappy(a)?"Yes, it is a happy no.":"No, it is not a happy no.");
                                    else if(c3==6)
                                    System.out.println(cal.isAutomorphic(a)?"Yes, it is a Automorphic no.":"No, it is not a Automorphic no.");
                                    else if(c3==7)
                                    {
                                        System.out.println("Enter the second no.");
                                        double b=Double.parseDouble(br.readLine());
                                        System.out.println(cal.areAmicable((double)a,b)?"Yes, they are Amicable nos.":"No, they are not Amicable nos.");
                                    }
                                    else if(c3==8)
                                    System.out.println(cal.isPerfect((double)a)?"Yes, it is a Perfect no.":"No, it is not a Perfect no.");
                                    else if(c3==9)
                                    System.out.println(cal.isArmstrong((double)a)?"Yes, it is a Armstrong no.":"No, it is not a Armstrong no.");
                                    else if(c3==10)
                                    System.out.println(cal.isDisarium((double)a)?"Yes, it is a Disarium no.":"No, it is not a Disarium no.");
                                    else if(c3==11)
                                    System.out.println(cal.isSpecial((double)a)?"Yes, it is a Special no.":"No, it is not a Special no.");
                                    else if(c3==12)
                                    System.out.println(cal.isNeon((double)a)?"Yes, it is a Neon no.":"No, it is not a Neon no.");
                                    else if(c3==13)
                                    System.out.println(cal.isBuzz((double)a)?"Yes, it is a Buzz no.":"No, it is not a Buzz no.");
                                    else if(c3==14)
                                    System.out.println(cal.isAppropriate((double)a)?"Yes, it is a Appropriate no.":"No, it is not a Appropriate no.");
                                    else if(c3==15)
                                    System.out.println(cal.isPrime((double)a)?"Yes, it is a Prime no.":"No, it is not a Prime no.");
                                    else if(c3==16)
                                    System.out.println(cal.isRightTruncatablePrime(a)?"Yes, it is a Right Truncatable Prime no.":"No, it is not a Right Truncatable Prime no.");
                                    else if(c3==17)
                                    {
                                        System.out.println("Enter another no. ...");
                                        int b=Integer.parseInt(br.readLine());
                                        System.out.println(cal.isTwinPrime((double)a,(double)b)?"Yes, they are Twin Prime nos.":"No, they are not Twin Prime nos.");
                                    }
                                    else if(c3==18)
                                    System.out.println(cal.isPalindrome(a)?"Yes, it is a Palindrome no.":"No, it is not a Palindrome no.");
                                }
                                else if(c2==3&&c3>=1&&c3<=2)
                                {
                                    System.out.println("Enter the no. ...");
                                    int a3=Integer.parseInt(br.readLine());
                                    if(c3==1)
                                    System.out.println("Factorial is --  "+cal.factorial((double)a3));
                                    else if(c3==2)
                                    {
                                        System.out.println("Enter the factor for Multifactorial...");
                                        int f3=Integer.parseInt(br.readLine());
                                        System.out.println("Multifactorial is --  "+cal.multifactorial((double)a3,(double)f3));
                                    }
                                }
                                else if(c2==4&&c3>=1&&c3<=4)
                                {
                                    System.out.println("Enter the no. ...");
                                    int a4=Integer.parseInt(br.readLine());
                                    if(c3==1)
                                    System.out.println("The reversed digits are --  "+cal.reverse((double)a4));
                                    else if(c3==2)
                                    System.out.println("Sum of digits is --  "+cal.sumOfDigits((double)a4));
                                    else if(c3==3)
                                    System.out.println("Product of digits is --  "+cal.productOfDigits(a4));
                                    else if(c3==4)
                                    System.out.println(cal.isPalindrome(a4)?"Yes, it is a Palindrome no.":"No, it is not a Palindrome no.");
                                }
                                else if(c2==5&&c3>=1&&c3<=2)
                                {
                                    System.out.println("Enter the no. ...");
                                    int a5=Integer.parseInt(br.readLine());
                                    if(c3==1)
                                    System.out.println(cal.isPrime((double)a5)?"Yes, it is a Prime no.":"No, it is not a Prime no.");
                                    else if(c3==2)
                                    System.out.println(cal.isRightTruncatablePrime(a5)?"Yes, it is a Right Truncatable Prime no.":"No, it is not a Right Truncatable Prime no.");
                                }
                                else if(c2==6&&c3>=1&&c3<=2)
                                {
                                    System.out.println("Enter the two nos. ...");
                                    int n16=Integer.parseInt(br.readLine());
                                    int n26=Integer.parseInt(br.readLine());
                                    if(c3==1)
                                    System.out.println("HCF of the nos. is --  "+cal.hcf((double)n16,(double)n26));
                                    else if(c3==2)
                                    System.out.println("LCM of the nos. is --  "+cal.lcm((double)n16,(double)n26));
                                }
                                else if(c2==7&&c3>=1&&c3<=2)
                                {
                                    System.out.println("Enter the multiple till which the tables are required...");
                                    int m7=Integer.parseInt(br.readLine());
                                    if(c3==1)
                                    {
                                        System.out.println("Enter the no. for which the table is required...");
                                        int a7=Integer.parseInt(br.readLine());
                                        dis.table((double)a7,(double)m7);
                                    }
                                    else if(c3==2)
                                    {
                                        System.out.println("Enter the starting no....");
                                        int n17=Integer.parseInt(br.readLine());
                                        System.out.println("Enter the ending limit");
                                        int n27=Integer.parseInt(br.readLine());
                                        if(n17<=n27)
                                        {
                                            dis.tableRange(n17,n27,m7);
                                        }
                                        else
                                        System.out.println("The starting no. must be less than the ending no.!!");
                                    }
                                }
                                else if(c2==8&&c3>=1&&c3<=2)
                                {
                                    System.out.println("Enter the no. of terms...");
                                    int n8=Integer.parseInt(br.readLine());
                                    if(c3==1)
                                    dis.fibonacci((double)n8);
                                    else if(c3==2)
                                    dis.tribonacci((double)n8);
                                }
                                else if(c2==9&&c3>=1&&c3<=2)
                                {
                                    if(c3==1)
                                    {
                                        System.out.println("Enter the no. ...");
                                        int n9=Integer.parseInt(br.readLine());
                                        dis.pythagoreanTriplets(n9);
                                    }
                                    else if(c3==2)
                                    {
                                        System.out.println("Enter the starting limit...");
                                        int s9=Integer.parseInt(br.readLine());
                                        System.out.println("Enter the ending limit");
                                        int e9=Integer.parseInt(br.readLine());
                                        if(s9<=e9)
                                        dis.pythagoreanTripletsRange(s9,e9);
                                        else
                                        System.out.println("Starting limit must be less than ending limit");
                                    }
                                }
                                else if((c2==0&&c3==7)||(c2==1&&c3==3)||(c2==2&&c3==19)||(c2==3&&c3==3)||(c2==4&&c3==5)||(c2==5&&c3==3)||(c2==6&&c3==3)||(c2==7&&c3==3)||(c2==8&&c3==3)||(c2==9&&c3==3))
                                {
                                    continue L2;
                                }
                                else
                                {
                                    System.out.println("Are you sure you want to exit?");
                                    System.out.println("Enter -->1 to EXIT");
                                    System.out.println("      -->any other no. to CONTINUE");
                                    int df=Integer.parseInt(br.readLine());
                                    dis.clear();
                                    if(df==1)
                                    {
                                        System.out.println("OK");
                                        break L1;
                                    }
                                    else
                                    continue L3;
                                }
                                System.out.println("\n\nEnter 1-->To continue the same function");
                                System.out.println("      2-->To see the SUB MENU");
                                System.out.println("      3-->To see the MAIN MENU");
                                System.out.println("      Any other no.-->To EXIT");
                                int c6=Integer.parseInt(br.readLine());
                                dis.clear();
                                if(c6==1)
                                {
                                    continue L4;
                                }
                                else if(c6==2)
                                {
                                    continue L3;
                                }
                                else if(c6==3)
                                {
                                    continue L2;
                                }
                                else
                                {
                                    System.out.println("Are you sure you want to exit?");
                                    System.out.println("Enter -->1 to EXIT");
                                    System.out.println("      -->any other no. to CONTINUE");
                                    int chd=Integer.parseInt(br.readLine());
                                    dis.clear();
                                    if(chd==1)
                                    {
                                        System.out.println("OK");
                                        break L1;
                                    }
                                    else
                                    continue L3;
                                }
                            }
                        }
                    }
                    else
                    {
                        System.out.println("Are you sure you want to exit?");
                        System.out.println("Enter -->1 to EXIT");
                        System.out.println("      -->any other no. to CONTINUE");
                        int c1=Integer.parseInt(br.readLine());
                        dis.clear();
                        if(c1==1)
                        {
                            System.out.println("OK");
                            break L1;
                        }
                        else
                        continue L2;
                    }
                }
                default://if user chooses exit
                System.out.println("Do you really want to exit?");
                System.out.println("Enter -->1 to EXIT");
                System.out.println("      -->any other no. to CONTINUE");
                int c5=Integer.parseInt(br.readLine());
                dis.clear();
                switch(c5)
                {
                    case 1:
                    System.out.println("OK");
                    break L1;
                    default:
                    continue L1;
                }
            }
        }
    }//end of main
}//end of class EPIC PROGRAM COMPLETE !!!!!    