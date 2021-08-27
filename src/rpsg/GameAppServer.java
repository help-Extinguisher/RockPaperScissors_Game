package rpsg;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.framework.TcpApplication;

public class GameAppServer extends TcpApplication {

	//TcpApplication�� start �޼ҵ� ����
	@Override
	public void start() {	
		
		System.out.println("���� ������ Ȱ��ȭ�Ǿ����ϴ�.");
		System.out.println();
		System.out.println("PLAYER ������...");
		
		ServerSocket sServer = null;
		Socket cSocket		= null;
		Thread th		= null;		
		
		try {
			// 1. �������� ����
			sServer = new ServerSocket(PORT);			
			// 2. Ŭ���̾�Ʈ�� ����� ���� ����
			while(true) {
				cSocket = sServer.accept();	 // ����: Ŭ���̾�Ʈ�� ���� �ɶ� ���� ���		
				System.out.println("����");
				
				// ������ Ŭ���̾�Ʈ �ۼ����� ����� �����带 �����Ͽ� ����(cSocket)�� �����Ѵ�.
				// ������ ����ŭ �����尡 �����ȴ�. 				
				th = new Thread(new GameTcpServerHandler(cSocket));	
				th.start();				
			}					
			
		}catch (IOException ex) {
			ex.printStackTrace();			
		}	
	}

}
