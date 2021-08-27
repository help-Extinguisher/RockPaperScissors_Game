package rpsg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shop extends GameAppClient {
	
	String bookName = "å�̸�";
	int bookCoin = 0;

      public static void shopIn() { // �޼ҵ�� �����־��� (ȣ���ϸ� �ݺ��ϰ�)   
    	  
       Scanner sc = new Scanner(System.in);   
    	
    	shopMain();
    	shopManu();
     	  
      while(true) {   
    	  
      int select2 = sc.nextInt();             
      switch (select2) {
      case 1 : menuSwitch("�߾��� �˵��", 3); break;
      case 2 : menuSwitch("�̻������� ��η�", 5); break;
      case 3 : menuSwitch("������ ������", 4); break;      
      case 4 : menuSwitch("���ֿ� ���ٸ�", 6); break;
      case 5 : menuSwitch("������", 99); break;
      case 0 :     	  
    	  GameAppClient.showMenu5();   

  		switch (select2) {	
  		
  		case 1:			           
  			Game.play();
  			break;
  			
  		case 2:		
  			Shop.shopIn();
  			break;				
  			
  		case 0:
  			System.out.println("���α׷��� �����մϴ�.");
  			
  			System.exit(0);	
  			
  		default:
  			System.out.println("�ٽ� �Է��ϼ���");
  		    break;		
  		}      
    	  
    	  break;                     
      default : System.out.println("�޴��� ���� �׸��Դϴ� �ٽ� �����ϼ���");
                System.out.print("   > ");      
                continue;             
      }
  }// while ������    
      
    
 
 } //shopIn() ������     
  
   public static void shopMain() { 
	     System.out.println(" ������������������������������������������������������������������������������������������������������������������������������������������������ ");
         System.out.println("                                                      ");
         System.out.println("                                                     \r\n" + 
               "    ______             ____      _____  _   _  _____ ______    \r\n" + 
               "    | ___ \\           / ___|    /  ___|| | | ||  _  || ___ \\   \r\n" + 
               "    | |_/ /  ______  / /___     \\ `--. | |_| || | | || |_/ /   \r\n" + 
               "    | ___ \\ |______| | ___ \\     `--. \\|  _  || | | ||  __/    \r\n" + 
               "    | |_/ /          | \\_/ |    /\\__/ /| | | |\\ \\_/ /| |       \r\n" + 
               "    \\____/           \\_____/    \\____/ \\_| |_/ \\___/ \\_|       \r\n" + 
               "                                                               \r\n" + 
               "                                                               " );
         System.out.println(" ������������������������������������������������������������������������������������������������������������������������������������������������ ");      
      }
      
   public static void shopManu() {    
       System.out.println();

       System.out.println("\r\n" + 
             "\r\n" + 
             "		___  ___ _____  _   _  _   _ \r\n" + 
             "		|  \\/  ||  ___|| \\ | || | | |\r\n" + 
             "		| .  . || |__  |  \\| || | | |\r\n" + 
             "		| |\\/| ||  __| | . ` || | | |\r\n" + 
             "		| |  | || |___ | |\\  || |_| |\r\n" + 
             "		\\_|  |_/\\____/ \\_| \\_/ \\___/ \r\n" + 
             "                             \r\n" + 
             "                             \r\n" + 
             "" 
             );
//       System.out.println(" ���������������������������������������������������������������������������������������������������������������������������������������� ");
       System.out.println();
       System.out.println("    1. �߾��� �˵��  ���������������������� (3����)");
       System.out.println("    2. �̻������� ��η�  �������������� (5����)");
       System.out.println("    3. ������ ������  �������������������������� (4����)");
       System.out.println("    4. ���ֿ� ���ٸ�   ������������������������ (6����)");
       System.out.println("    5. ������   ���������������������������������� (99����)");
       System.out.println();
       System.out.println();
       System.out.println(" ��������������������������������������������������������������  ");
       System.out.println();
       System.out.println("    0. ����ȭ������ ");
       System.out.println();
       System.out.println();
       System.out.println(" ���������������������������������������������������������������������������������������������������������������������������������������� ");
       System.out.println();
       System.out.println("   �� [" + id +"���� ���� ���� : " + coin + "]");
       System.out.println("   �����Ͻ� ��ǰ�� ��ȣ�� �Է��ϼ���.");
       System.out.println();
       System.out.print("   > ");         
   }   
   
   static void menuSwitch(String bookName, int bookCoin) {
   
   System.out.println();
   System.out.println(" > [" + bookName + "]��(��) [" + bookCoin + "����]�Դϴ�. �����ұ��? ");
   System.out.println("   �� (" + id + "���� ���� ���� :" + coin + ")");
   System.out.println();
   System.out.println("      �� 1. YES      �� 2. NO      ");
   System.out.print("   > ");
   System.out.println();
   
   int select2 = sc.nextInt();
   
   
// ���� ���κ��� ����� ��ǰ�� Ŭ���� �����޽��� ����ϰ���
   if (coin >= bookCoin) {
   
   switch (select2) {
   
   case 1 :
	   coin = coin-bookCoin;
	   System.out.println(bookName + "�����߽��ϴ�.");
	   System.out.println();
	   System.out.println(id+"���� �ܿ� ����: " + (coin) );
	   System.out.println();
	   try {
			Thread.sleep(1000);
			System.out.println();
			System.out.println(" ......3");
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
		   try {
			   Thread.sleep(1000);
			   System.out.println();
			   System.out.println(" ......2");
		   } catch (InterruptedException e) {		
			   e.printStackTrace();
		   }
		   try {
			   Thread.sleep(1000);
			   System.out.println();
			   System.out.println(" ......1");
		   } catch (InterruptedException e) {		
			   e.printStackTrace();
		   }	   
		   try {
			   Thread.sleep(1000);
		
		   } catch (InterruptedException e) {		
			   e.printStackTrace();
		   }	   
	   shopManu();
	   break;
	   
   case 2 :
	   System.out.println();
	   System.out.println(bookName + "���Ÿ� ��� �Ͽ����ϴ�.");
	   System.out.println();	
	   System.out.println("3���Ŀ� �޴��� ���� ���ϴ�.");
	   
	   try {
		Thread.sleep(1000);
		System.out.println();
		System.out.println(" 3");
	} catch (InterruptedException e) {		
		e.printStackTrace();
	}
	   try {
		   Thread.sleep(1000);
		   System.out.println();
		   System.out.println(" 2");
	   } catch (InterruptedException e) {		
		   e.printStackTrace();
	   }
	   try {
		   Thread.sleep(1000);
		   System.out.println();
		   System.out.println(" 1");
	   } catch (InterruptedException e) {		
		   e.printStackTrace();
	   }	   
	   
	   shopManu();
   
	   break;
   }
   
   } else {
       System.out.println (" > ������ �����մϴ�. �ٽ� Ȯ�����ּ���.");
       System.out.println(" ���Ÿ� ����ϰ� �޴� ȭ������ ���ư��ϴ�. ");
      System.out.println("3���Ŀ� �޴��� ���� ���ϴ�.");
      try {
      Thread.sleep(3000);
      System.out.println();
      System.out.println(" 3");
   } catch (InterruptedException e) {      
      e.printStackTrace();
   }
       shopManu();

   
   }  

   }
}
