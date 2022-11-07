import java.util.Scanner;

    public class havadurumu {

     public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        double kaykay =0<<5 , sinema =5<<15 , piknik =15<<25 , yüzme=25<<60,number;

            System.out.print("Hava kaç derece ?\t");

                number =inp.nextDouble();

                if (number <5){System.out.println("Hava çok soğuk tam kaykaylık ");}
    if  (5<=number&&number<=15){System.out.println("Bugün sinemaya mı gitsek ?");}
     if (15<number&&number<=25){System.out.println("Tam pikniklik bir hava");}
      if(number>25){System.out.println("Yüzmek için ne güzel bir gün");}
                
    }
    
}
