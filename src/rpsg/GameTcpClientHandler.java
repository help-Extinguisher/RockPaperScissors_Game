package rpsg;

import java.io.IOException;

import org.omg.CORBA.portable.ApplicationException;

/**
 * 
 * 
 * AppClient�� ������ �̿��Ͽ�
 * ������ ���� ����� �����Ѵ�.
 * 
 */
public class GameTcpClientHandler implements Runnable {

	@Override
	public void run() {
		try {
			// �����κ��� �޽��� ����
			String line = null;
			while(true) {
				line = GameAppClient.br.readLine();
				if(line != null) {
					System.out.println(line);
				}
				
			}			
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally {
			try {
				if(GameAppClient.keyboard != null) {GameAppClient.keyboard.close();}
				if(GameAppClient.pw != null) {GameAppClient.pw.close();}
				if(GameAppClient.br != null) {GameAppClient.br.close();}
				if(GameAppClient.sSock != null) {GameAppClient.sSock.close();}
				
			} catch(IOException ex) { ex.printStackTrace();}
		}
				
	}
	
	
	

}
