package com.mycompany.yakittutari;

import java.util.Scanner;


public class main {
     public static void main(String[] args) {
    /*
    Bir aracın kilometrede ne kadar yaktığı ve kaç kilometre yol yaptığı bilgilerini alın ve sürücünün
    toplam ne kadar ödemesi gerektiğini hesaplayınız


   */

         Scanner scanner = new Scanner(System.in);

         System.out.println("Araciniz kilometre basina kaç kurus yakiyor :(örnek :0,35)");
         double kurus = scanner.nextDouble();
        
         System.out.println("Araciniz kac kilometre gitti? :");
         int km = scanner.nextInt();
        
         System.out.println("Toplam odemeniz gereken tutar :" + (kurus * km ) + " TL 'dir...");
         
    }
}
