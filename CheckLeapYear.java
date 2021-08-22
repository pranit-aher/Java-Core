// To check entered year is leap or not

import java.util.*;
import java.io.*;

class Year
{
static int year;
  
public static void getYear()
{
 System.out.println("Enter the Year");
 Scanner sc=new Scanner(System.in);

 year=sc.nextInt();

 sc.close();

}

public static void showYear()
{
  if((year%4==0) && (year%100!=0))
  {
   System.out.println(year+" Year is Leap");
  }

  else if(year%400==0)
  {
    System.out.println(year+" Year is Leap");
  }

  else
  {
    System.out.println(year+" Year is NOT Leap");
  }
 
}
}

class CheckLeapYear{

public static void main(String s[])
{
   Year.getYear();
  Year.showYear();
}
}