package peterparker;



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Numberspell
{
    
    
    private static String numberToWord(int number) {
                 
                String words = "";
		String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", 
                                "seven", "eight", "nine", "ten", "eleven", "twelve",
                                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                                "eighteen", "nineteen" };
		String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                                 "sixty", "seventy", "eighty", "ninety" };
 
		if (number == 0) {
			return "zero";
		}
		if (number < 0) { 
                        String numberStr = "" + number;
                        numberStr = numberStr.substring(1);
                        return "minus " + numberToWord(Integer.parseInt(numberStr));
                } 
		if ((number / 1000) > 0) {
			words += numberToWord(number / 1000) + " thousand ";
			number %= 1000;
		}
		
		if ((number / 100) > 0) {
			words += numberToWord(number / 100) + " hundred ";
			number %= 100;
		}
 
		if (number > 0) {
			if (number < 20) {
                                 words += unitsArray[number];
                        } else { 
                                words += tensArray[number / 10]; 
                                if ((number % 10) > 0) {
				   words += " " + unitsArray[number % 10];
                            }  
			}
		}
 
		return words;
	}
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
   
        try
        {
       InputStreamReader r=new InputStreamReader(System.in);
       BufferedReader sc =new BufferedReader(r);
       
          String data =  sc.readLine();
          
          String dat[] = data.split("/s+");
          int a,b;
          
          if(dat.length==2)
          {
          a = Integer.valueOf(dat[0]);
          b = Integer.valueOf(dat[1]);
          
          
             if(a < 90000 && b < 90000)
             {
          
          int c1 =a;
          int c2=b;
          while(a!=b)
          {
              
             int a1=a;
             int b1=b;
             
             
             if(a > 99999 || b > 99999)
             {
                 System.out.print("Out of bounds");
                 break;
             }
             
             String aw = numberToWord(a1);
             String bw = numberToWord(b1);
             
          
              if(aw.compareTo(bw) < 0)
              {
                  a1=a;
             b1=b;
           
                  
              }
              
              else
              {
                   a1=b;
                   b1=a;
           
                  
              }
              
             c1 = a+a1;
              c2 = b +b1;
             
             
              a = c1;
              b =c2;
             if(c1==c2)
             {
                  System.out.print(c1);
                 break;
             }
              
              
          }
          
          
          
             }
          
          
          }
        
        }
        
        catch(Exception ee)
        {
            
        }
    }
    
}

