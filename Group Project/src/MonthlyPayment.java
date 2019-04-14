import java.text.NumberFormat;

public class MonthlyPayment {
	
	
	    //public static void MonthlyPayment(String[] args) {
	public static void main(String[] args) {
	        float principal = 100;
	        float years = 1;
	        float rate = (float) 0.12;
	        float i = (rate / 12); 
	        float n = 12 * years;    
	        
	       // double payment  = (principal * i) / (1 - Math.pow(1+i, -n));
	        float payment = (float) (principal*((i*(Math.pow(1+i, n))/((Math.pow(1+i, n)-1)))));
	        float totalPaid = payment*n;
	        /*double s = (payment *100) %10;
	        double l = s/100;
	        double realPayment = payment - l;
	        double interest = payment * n - principal;
	        */
	        double remainder = (principal*100)%n;
	        double r = remainder/100;
	       // double extra = r*n;
	        
	        //double fpayment = realPayment+extra;
	        
	        //double totalInterest = ((realPayment*n)+extra)-principal;
	     //   double tI = (totalInterest*1000)%10;
	      //  double I = tI/100;
	        //double T = totalInterest - tI;
	        
	      double totalInterest = payment*n -principal;
	      
	        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
	        NumberFormat interestFormat = NumberFormat.getPercentInstance();
	        
	        String t= currencyFormat.format(totalPaid);   
	        String s =currencyFormat.format(payment);
	        
	        //String input = totalLbl.getText();
	        t = t.replace("$","").trim();
	        Double q = Double.parseDouble(t);
	   //   double q = Double.parseDouble(t);
	        s = s.replace("$","").trim();
	        Double m = Double.parseDouble(s);
	    //    double m = Double.parseDouble(s);
	        double extra = q-(m*n);
	     double fpayment = m+extra;	
	        
	        
	             System.out.println("Loan Amount: "+ currencyFormat.format(principal));
	              System.out.println("Loan Term: "+ n+" months");
	              
	             System.out.println("Yearly interest Rate: "+interestFormat.format(rate));
	             
	             System.out.println("Total interest paid: "+ currencyFormat.format(totalInterest));
	             // System.out.println("Total interest paid   = " + totalInterest);
	              
	            // System.out.println("Monthly Payment: "+ currencyFormat.format(payment));
	             System.out.println("Monthly Payment: "+ s);
	             // System.out.println("Monthly payments = " + payment);
	              
	            // System.out.println("Total Paid: "+ currencyFormat.format(totalPaid));
	             System.out.println("Total Paid: "+ t);
	             
	            //  System.out.println("Total paid   = " + totalPaid);
	       
	        System.out.println("Final monthly payment = " + currencyFormat.format(fpayment));
	        
	       
	    }

	}

