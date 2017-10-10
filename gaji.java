
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meadow
 */
public class gaji {
     public static void main(String args[])
            {
                Scanner input=new Scanner(System.in);
                           int jum;
 
System.out.println("Nama:");
String nama=input.next();
System.out.println("bilangan jam sehari");
int bil_jam=input.nextInt();
 if(bil_jam>9);
 {System.out.println("Bilangan jam sehari tidak bole melebihi 9jam,sila masukkan bilangan jam yang betul");
 }
 System.out.println("bilangan hari");
int bil_hari=input.nextInt();
 if(bil_hari>30);
 {
 System.out.println("Bilangan hari bekerja tidak bole melebihi 30hari,sila masukkan bilangan hari yang betul");
 }
System.out.println("bilangan jam ot");
int ot=input.nextInt();
 if(ot>30);
 {
 System.out.println("Bilangan jam kerja lebih masa tidak boleh melebihi 50jam,sila masukkan bilangan jam yang betul");
 }
 jum=(bil_jam*bil_hari*20)+(ot*15);
  
    System.out.println("Rumusan gaji bulanan:"+nama);
System.out.println("Jumlah bilangan jam bekerja:"+bil_jam);
System.out.println("Jumlah bilangan hari bekerja:"+bil_hari);
System.out.println("Jumlah bilangan jam lebih masa bekerja:"+ot);
System.out.println("Jumlah gaji: RM"+jum);
 }
  }
