class AmstrongNum
 {
  /*An Armstrong number is a special kind of number in math. 
  It's a number that equals the sum of its digits, each raised to a power. 
  */
 public static void main(String[]args)
   {
     int num=153;
     int num1=num;
     int num2=num;
     int count=0;
     int result =0;

     while(num>0)
       {
        count++;
        num=num/10;
       }
      System.out.println("count of digit="+count);
   
     while(num1>0)
      {
       int rem=num1%10;
       int power=1;

        for(int i=1;i<=count;i++)
         {
          power=power*rem;
         }
          result=result+power;
          num1=num1/10;
      }

     if(num2==result)
        {
         System.out.println("num is amstrong num");
        }
     else 
        {
         System.out.println("num is not amstrongnum");
        }
    }
 }//it is armstrong num