import java.util.*;
public class RomanNumeralCalcandConverter{
public static Scanner scan = new Scanner (System.in);
public static String userenter; 
   public static void main(String args[]){
   
   
      System.out.println("Valid Roman Numeral Values are as follows: ");
      System.out.println("M = 1000, C = 100, L = 50, X = 10, V = 5, I = 1");
      System.out.println();
   
      int userenter1; 
       
      
      //Creation of menu for program
      do{
      System.out.println();
      System.out.println("Please enter 1 for Roman to Decimal Conversion");
      System.out.println();
      System.out.println("Please enter 2 for Decimal to Roman Numeral Conversion");
      System.out.println();
      System.out.println("Please enter 3 for Roman Numeral Calculator");
      System.out.println();
      System.out.println("Or enter 0 to exit");
      System.out.println();
      userenter1 = scan.nextInt();
   
      switch (userenter1)
      {
         
      case 1: 
      System.out.println();
      System.out.print("Please enter the Roman Numeral you would like to convert: ");
      userenter = scan.next();
      userenter = userenter.toUpperCase();
      System.out.println(romanToDecimal());
      break;
      
      case 2:
      System.out.println();
      System.out.print("Please enter the decimal number you would like to convert: ");
      decimalToRoman();
      break;
      
      case 3: calculator();

      case 0: System.out.println("Thank you, goodbye!");
      System.exit(0);
      break;
      default: System.out.println("Invalid number! Please enter 0, 1, 2, or 3.");
      break;
      }

         }while(userenter1 != 0);
      }
      
   
  
   public static int romanToDecimal()
   {
   int sum = 0;
   
   System.out.println();
   
      //Loops through all numerals entered & stores their equivalent value in 'sum' variable
      for (int i = 0; i < userenter.length(); i++){
   
         if (userenter.charAt(i) == 'M'){
            sum = sum + 1000;
         }
         else if (userenter.charAt(i) == 'C'){
            sum = sum + 100;
         }
         else if (userenter.charAt(i) == 'L'){
            sum = sum + 50;
         }
         else if (userenter.charAt(i) == 'X'){
            sum = sum + 10;
         }
         else if (userenter.charAt(i) == 'V'){
            sum = sum + 5;
         }
         else if (userenter.charAt(i) == 'I'){
            sum = sum + 1;
         }
         else {
            System.out.print("Please enter a VALID Roman Numeral. ");
           }
          }
          
      return sum; 
      }
 
 
      public static void decimalToRoman()
      {
      System.out.println();
      
      String sum = "";
      int userenter = scan.nextInt();

      //loops to atrribute user entered decimal value to equivalent numeral & decrease value of decimal until the value is 1
      while (userenter >= 1000){
         sum = sum + 'M';
         userenter = userenter - 1000;
         }
      
      while (userenter >= 100){
         sum = sum + 'C';
         userenter = userenter - 100;
         }
      
      while (userenter >= 50){
         sum = sum + 'L';
         userenter = userenter - 50;
         }
      
      while (userenter >= 10){
         sum = sum + 'X';
         userenter = userenter - 10;
         }
      
      while (userenter >= 5){
         sum = sum + 'V';
         userenter = userenter - 5;
         }

      while (userenter >= 1){
         sum = sum + 'I';
         userenter = userenter - 1;
         }
         
            System.out.println();
            System.out.println(sum);
      }
         

      public static void calculator()
      {
      System.out.println();
      int decimal1 = 0;
      int decimal2 = 0;
      char operation = '\0';
      

      System.out.print("Please enter the 1st numeral you would like to perform an operation on: ");
      userenter = scan.next();
      decimal1 = romanToDecimal();

      System.out.println();
      
      System.out.print("Please enter the tye of operation you would like to use (Symbols only please '+ / - *'):  ");
      operation = scan.next().charAt(0);
      
      System.out.println();
      
      System.out.print("Please enter the 2nd numeral you would like to perform an operation on: ");
      userenter = scan.next();
      decimal2 = romanToDecimal();


      System.out.println();

      //decisions statements to carryout user's choice of operation
      if (operation == '/'){
         int ans = (decimal1 / decimal2);
         System.out.print("The answer in decimal form is: " + ans);
         System.out.print("The answer in numeral form is: " + quickDecimaltoRoman(ans));
         }
      
      else if (operation == '*'){         
         int ans = (decimal1 * decimal2);
         System.out.print("The answer in decimal form is: " + ans);
         System.out.print("The answer in numeral form is: " + quickDecimaltoRoman(ans));
         }
      
      else if (operation == '-'){
         int ans = (decimal1 - decimal2);
         System.out.print("The answer in decimal form is: " + ans);
         System.out.print("The answer in numeral form is: " + quickDecimaltoRoman(ans));
         }
      
      else if (operation == '+'){
         int ans = (decimal1 + decimal2);
         System.out.print("The answer in decimal form is: " + ans);
         System.out.print("The answer in numeral form is: " + quickDecimaltoRoman(ans));
         }
      
      else {
         System.out.print("Please enter a valid operation symbol.");
         calculator();
         }
      
      System.out.println();
      }
      
      
      public static String quickDecimaltoRoman(int num)
      {
      String roman = "";

      //Same logic as original Deciman to Roman but converts based on answer from decimal form given from calulator functon
      while (num >= 1000){
         roman = roman + 'M';
         num = num - 1000;
         }
      
      while (num >= 100){
         roman = roman + 'C';
         num = num - 100;
         }
      
      while (num >= 50){
         roman = roman + 'L';
         num = num - 50;
         }
      
      while (num >= 10){
         roman = roman + 'X';
         num = num - 10;
         }
      
      while (num >= 5){
         roman = roman + 'V';
         num = num - 5;
         }

      while (num >= 1){
         roman = roman + 'I';
         num = num - 1;
         }
         
            System.out.println();
            return roman;     
       }

     }
  