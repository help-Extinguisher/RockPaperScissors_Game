package rpsg;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

import com.framework.TcpApplication;

public class Game extends GameAppClient  {			
	
public static void play() {	         

        //�Է� �޼��� ��üȭ
        Scanner sc = new Scanner(System.in);        
        //��ǻ�Ϳ� ������ ������ �������� Ȯ��
        String comStr="",userStr="";        
        //���
        int fail=0;
        
        //���� ����
        System.out.println("\r\n" + 
                "������������������������������������\r\n" +
                "������������������������������������\r\n" +
                "\r\n"+
        		"   _____   ___  ___  ___ _____   _____  _____   ___  ______  _____ \r\n" + 
        		"  |  __ \\ / _ \\ |  \\/  ||  ___| /  ___||_   _| / _ \\ | ___ \\|_   _|\r\n" + 
        		"  | |  \\// /_\\ \\| .  . || |__   \\ `--.   | |  / /_\\ \\| |_/ /  | |  \r\n" + 
        		"  | | __ |  _  || |\\/| ||  __|   `--. \\  | |  |  _  ||    /   | |  \r\n" + 
        		"  | |_\\ \\| | | || |  | || |___  /\\__/ /  | |  | | | || |\\ \\   | |  \r\n" + 
        		"   \\____/\\_| |_/\\_|  |_/\\____/  \\____/   \\_/  \\_| |_/\\_| \\_|  \\_/  \r\n" + 
        		"                                                                 \r\n" + 
        		"                                                                 \r\n" + 
        		  "������������������������������������\r\n" +
        		  "������������������������������������\r\n" +
        		"");
        System.out.println();
        System.out.println(" ��			��");
        System.out.println("	�ܿ�����: " + coin);
        System.out.println(" ��			��");
        System.out.println();
        System.out.println();
        System.out.println("����[1] ����[2] ��[3] ������[0]");
        System.out.println();
                
        for(int i=0; i<1000; i++) {
            //1~3�� ���� ����
            int computer =(int)(Math.random()*3)+1;
            //����� �Է°�
            int user = sc.nextInt();
            //��ǻ�� ��
            if(computer == 1) {
                comStr="����";
            }else if(computer == 2) {
                comStr="����";
            }else if(computer == 3) {
                comStr="��";
            }else {
                comStr="�ý��� ����";
            }
            //������ ��
            if(user == 1) {
                userStr="����";
            }else if(user == 2) {
                userStr="����";
            }else if(user == 3) {
                userStr="��";
            }else {
                userStr="�հ��� ����";
            }if(user == 0) { // ���� ������
            	
            	GameAppClient.showMenu5();
            	
            	int select2 = sc.nextInt();

        		switch (select2) {	
        		
        		case 1:        			
        			Game.play();
        			break;            	
        			
        		case 2:
        			Shop.shopIn();
					break;		
        			
        		case 0:
        			System.out.println("���α׷��� �����մϴ�.");
        			pw.close();		      	
        			
        			System.exit(0);   		
        		} 
            }
            
            if(user >= 1 && user <= 3) {
                if((computer == 1 && user == 2) || (computer == 2 && user == 3) || (computer == 3 && user == 1)) {                    
                    coin = coin+2;
                    System.out.println("���������������������� [ �¸� ] ����������������������");
                    System.out.println();
                    System.out.println(" [����] "+userStr+"  =VS= "+comStr+" [��ǻ��] ");
                    System.out.println();
                    System.out.println(" 2���� ȹ��!");
                    System.out.println();
                    System.out.println(" �ܿ�����: " + coin);
                    System.out.println();
                    System.out.println("����������������������������������������������������������������");
                    
                }else if(computer == user) {                                        
                    System.out.println("�������������������� [ ���º� ] ��������������������");
                    System.out.println();   
                    System.out.println(" [����] "+userStr+"  =VS= "+comStr+" [��ǻ��] ");
                    System.out.println();
                    System.out.println(" ��������!");
                    System.out.println();
                    System.out.println(" �ܿ�����: " + coin);
                    System.out.println();
                    System.out.println("����������������������������������������������������������������");
                 
                }else {                   
                    coin = coin-2;
                    System.out.println("���������������������� [ �й� ] ����������������������");
                    System.out.println();
                    System.out.println(" [����] "+userStr+"  =VS= "+comStr+" [��ǻ��] ");
                    System.out.println();
                    System.out.println(" 2���� �ս�!");
                    System.out.println();
                    System.out.println(" �ܿ�����: " + coin);
                    System.out.println();
                    System.out.println("����������������������������������������������������������������");
                    if(coin == 0) {
                   	 System.out.println();
                	 System.out.println("������ ��� ���� �Ͽ����ϴ�.");
                	 System.out.println();    
                    System.out.println("����� ����ȭ������ ���ư��ϴ�..");
                    System.out.println();
                    try {
            			Thread.sleep(1000);
            			System.out.println(" 1......");
            			System.out.println();
            		} catch (InterruptedException e) {			
            			e.printStackTrace();
            		}
                    try {
                    	Thread.sleep(1000);
                    	System.out.println(" 2......");
                    	System.out.println();
                    } catch (InterruptedException e) {			
                    	e.printStackTrace();
                    }
                    try {
                    	Thread.sleep(1000);
                    	System.out.println(" 3......");
                    	System.out.println();
                    } catch (InterruptedException e) {			
                    	e.printStackTrace();
                    }
                    try {
                    	Thread.sleep(1000);  
                    	System.out.println("�ذ��� ����ģ������ �ǰ��� ��ӽ��ϴ�...");
                    } catch (InterruptedException e) {			
                    	e.printStackTrace();
                    }
                    try {
                    	Thread.sleep(1000);                    	
                    } catch (InterruptedException e) {			
                    	e.printStackTrace();
                    }
                    
                    showMenu5();
                    	
                    }
                 
                }
            }else {
                fail++;
                System.out.println("���� �߸� �Է� �Ͽ����ϴ�.");    
            }
     
            System.out.println();       
            System.out.println();  
        }        
 
        sc.close();
    }
}
 

	


