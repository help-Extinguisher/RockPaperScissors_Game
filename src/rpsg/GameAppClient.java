package rpsg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import com.framework.TcpApplication;

public class GameAppClient extends TcpApplication {
	
	public static PrintWriter pw = null;
	public static BufferedReader keyboard = null;
	public static BufferedReader br = null;
	public static Socket sSock = null;
	static Scanner sc = new Scanner(System.in);
	
	//�⺻ ���� �Ҵ�		   
	static int coin = 10;
	
	// ���� IP �ּ�
	private static String sAddr = null;
	
	// Ŭ���̾�Ʈ ID
	static String id = null;	
	
	// ���ø����̼� �ʱ�ȭ
	@Override
	public void init() {		
		super.init();
	}
	
	//���ø����̼� ����
	@Override
	public void start() {		
		
		try {
			// 1. ��������			
			sSock = new Socket(TcpApplication.IP, TcpApplication.PORT);
			sAddr = sSock.getInetAddress().getHostAddress();
			
		   // 2.1 �۽� ��Ʈ�� ���			
		   pw = new PrintWriter(new OutputStreamWriter(sSock.getOutputStream()));

		   // 2.2 ���� ��Ʈ�� ���
		   br = new BufferedReader(new InputStreamReader(sSock.getInputStream()));
		   
		   // 2.3 Ű���� ��Ʈ�� ���
		   keyboard = new BufferedReader(new InputStreamReader(System.in));
		   			
		   // 3. Ŭ���̾�Ʈ�� id�� �����Ѵ�.
		   System.out.println("������ �����ϼ̽��ϴ�.");
		   System.out.println("ID�� �����ϼ���");
		   System.out.println();
		   System.out.print("ID: ");		   

		   // id ������ ���ۿ� ����� �Է� �� ����
		   id = keyboard.readLine();
		   System.out.println();
		   System.out.println(" ����������������������������������������������������������������������������������	�ȳ�	��������������������������������������������������������������������������������");
		   System.out.println();
		   System.out.println();
		   System.out.println("	[" + id + "]�� ���������� ���ӿ� ���� �ϽŰ� ȯ���մϴ�.           	");
		   System.out.println();
		   System.out.println("	������ ���� COIN �� ȹ�� �Ͻð� ������ �湮�Ͽ� ���ϴ� ��ǰ�� ������ ������.	");
		   System.out.println();
		   System.out.println("	�������ӱ��[ " + coin +"���� ]�� ���� �Ǿ����ϴ�.");
		   
		   // ������ id ����
		   pw.println(id);	 
		   pw.flush();
		   
		   
		  //�ι�° �޴� ���
				showMenu2();
//				while(true) {
					
				int select2 = sc.nextInt();
				switch (select2) {	
				
				case 1:			           
					Game.play();
					break;
					
				case 2:		
					Shop.shopIn();
					break;				
					
				case 0:
					programout();					
					System.out.println("���α׷��� �����մϴ�.");
					pw.close();
					br.close();
					keyboard.close();
					sSock.close();
					System.exit(0);	
					
				default:
					System.out.println("�ٽ� �Է��ϼ���");
				    break;					    
			}
//		} // while�� ������
				// 4. ������ ������ ������ ������ ����� �����带 �����Ͽ� ����
				Thread thread = new Thread(new GameTcpClientHandler());
				thread.start();		
		   
			
		}catch (IOException ex) {
			ex.printStackTrace();
		}		
		   
	}
	public static void showMenu2() {
		  System.out.printf("					          		 \n");
		   System.out.printf("	������ ��Ҹ� �����ϼ��� .          		 \n");
		   System.out.println();
		   System.out.printf("                   			     \n");
		   System.out.printf("           [1] �� ����             ");
	       System.out.printf("[2] �� ����                 ");
	       System.out.printf("[0] �� ������                    \n");
	       System.out.printf("                   			     \n");
	       System.out.println(" ��������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
        
		}
	public static void showMenu5() {
		System.out.printf("					          		 \n");
		System.out.println(" ����������������������������������������������������������������������������������	�ȳ�	��������������������������������������������������������������������������������");
		System.out.printf("					          		 \n");
		System.out.printf("					          		 \n");
		System.out.printf("	������ ��Ҹ� �����ϼ��� .          		 \n");
		System.out.println();
		System.out.printf("                   			     \n");
		System.out.printf("           [1] �� ����             ");
		System.out.printf("[2] �� ����                 ");
		System.out.printf("[0] �� ������                    \n");
		System.out.printf("                   			     \n");
		System.out.println(" ��������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		
		
	         int select2 = sc.nextInt();

	  		switch (select2) {	
	  		
	  		case 1:			           
	  			TcpApplication app = new GameAppClient();	
	  			Game.play();
	  			break;            	
	  			
	  		case 2:
	  			Shop.shopIn();
	 				break;		
	  			
	  		case 0:
	  			programout();
	  			
	  			
	  			break;
	  		}	          
	}
	private static void programout() {
		System.out.println("����� ���α׷��� �����մϴ�.");
		System.out.println();
		try {
			Thread.sleep(1000);
			System.out.println(" ......1");
			System.out.println();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000);
			System.out.println(" ......2");
			System.out.println();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000);
			System.out.println(" ......3");
			System.out.println();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000);
			System.out.println(" ......���α׷� ����");
			System.out.println();
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}	
		try {
			Thread.sleep(1000);			
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}		
	}
	}

