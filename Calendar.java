// Name: Manahari Dahal     Date Assigned: 13 April 2017

// Course: CSCI 2003 42733  Date Due: 27 April 2017

// Instructor: Ms. Greer
//
// File name: Calendar
//
// Program Description: A program that creates a single month of a calendar based on user input and asks the
//                      user for the year, month, and day of the week of the first day of the month
//


// importing Scanner class
import java.util.Scanner;
import java.util.*;     // importing other classes
import java.io.*;


// creating public class Calendar
public class Calendar
{
   
   // main method
   public static void main(String[] args)
   {
      
      // creating Scanner object to allow user to input their data
      Scanner in = new Scanner(System.in);
      
      
      // setting leapyear to false so that we can use the condition based on it's value i.e false
      boolean leapyear = false;
      
      
      /* 
      initializing instance variables
      */
      int noOfDays = 0;
      int day = 0;
      int month = 0;
      int year = 0;
      
      
      // creating an array of twelve months
      String[] months = {"January", "February", "March", "April", "May",
                         "June", "July", "August", "September", "October", "November", "December"};
      
      
      
      
      // printing user's desired layout
      System.out.println("Create a Calendar");
      System.out.println("=================\n");
 
      do
      {
         try // using try, catch to determine the invalid input by the user
         {
            
            System.out.print("Enter Year: ");
            year = in.nextInt(); 
            
         }
         catch (InputMismatchException error) // throwing away the InputMismatchException error
         {
         }
         
         
         // not allowing buffer extension
         in.nextLine();
      }
      
      
    
      while (year > 5000 || year <= 0);
      
      
      // checking if the entered year is a leap year or not
      if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 ))
      {
         leapyear = true;
      }
      
      
      
      // allows user to enter a month   
      System.out.println("\nEnter Month");
      System.out.print("-----------\n");
      
      
      
      // displaying months with user's desired layout
      System.out.println("1. January    5. May       9. September");
      System.out.println("2. February   6. June     10. October");
      System.out.println("3. March      7. July     11. November");
      System.out.println("4. April      8. August   12. December\n");
      
      do
      {
         
         // // using try, catch to determine the invalid input by the user
         try 
         {
            System.out.print("Enter Month (1 - 12): ");
            month = in.nextInt();
         } 
         
         
         catch (InputMismatchException error) 
         {
         }
         
         // not allowing buffer extension
         in.nextLine();
      }
      
         
      while (month <= 0 || month > 12);
      
      // checks which months has 30 days or 31 days
      if(month == 2)
      {
         if (leapyear == true)
         {
               noOfDays = 29;
         }
         
         else
         {
               noOfDays = 28;   // prints 29 days if its leap year otherwise it prints 28 for February
         }}
                 
      else if(month == 1)
      {
         noOfDays = 31;
      }

      else if(month == 3)
      {
         noOfDays = 31;
      }

      else if(month == 4)
      {
         noOfDays = 30;         // prints the respective number of days for respective months
      }

      else if(month == 5)
      {
         noOfDays = 31;
      }

      else if(month == 6)
      {
         noOfDays = 30;
      }

      else if(month == 7)
      {
         noOfDays = 31;
      }
      else if(month == 8)
      {
         noOfDays = 31;
      }
      else if (month == 9)
      {
          noOfDays = 30;
      }
      else if (month == 10)
      {
         noOfDays = 31;
      }
      else if (month == 11)
      {
         noOfDays = 30;
      }
      else if  (month == 12)
      {
         noOfDays = 31;
      }
      
      
      // allows user to choose the first day of a week
      System.out.println("\nChoose Day of Week of the 1st Day");
      System.out.print("---------------------------------\n");
      
      // prints days with user's desired layout
      System.out.println("1. Sunday       5. Thursday");
      System.out.println("2. Monday       6. Friday");
      System.out.println("3. Tuesday      7. Saturday");
      System.out.println("4. Wednesday");
      
      System.out.println();
      do 
      {
         
         // using try, catch to determine the invalid input by the user
         try 
         {
               
               // allowing user to enter the day of the week
               System.out.print("Enter Day of the Week (1 - 7): ");
               day = in.nextInt();
         } 
         catch (InputMismatchException error) 
         {
         }
         
         // not allowing buffer extension
         in.nextLine();
      } 




      // displaying the respective months and days
      while (day <= 0 || day > 7);
      
      
      // displaying user's desired layout
      System.out.printf("\n\n %-10s%10d",months[month-1],year);
      System.out.println("\n --------------------");
      System.out.println("  S  M  T  W  T  F  S");
      System.out.println(" --------------------");
      
      
      // initializing instance variables
      String total_weeks = "";
      int start_day = 1;
      String initial_week = "";
      int[][] first_day= new int[6][7];     // array for holding 6 rows and 7 columns for days and weeks respectively
      
      
      // printing the day that starts in the first week of a month   
      for (int rows = 0; rows < first_day.length; rows++)
      {
         if (rows == 0)
         {
            for (int column = day -1; column <first_day[rows].length; column++ )
            {
               first_day[rows][column] = start_day;
               start_day++;
               
               initial_week += first_day[rows][column]+"  ";
            }
            System.out.printf("%23s\n",initial_week);
          }
      
      
      
      // printing days followed by the first days of a month
      else
      {
         for (int nRows = 0; nRows < first_day[rows].length; nRows++)
         {         
            if (start_day > noOfDays)
            {
               break;
            }
 
               first_day[rows][nRows] = start_day;
               start_day++;
               total_weeks =+ first_day[rows][nRows] + "";
               
               System.out.printf("%3s",total_weeks);

         }
         System.out.println();
      }

}}}