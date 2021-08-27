package rpsg;

import java.util.Scanner;

import com.framework.TcpApplication;

public class GameTcpServer {	
	public static void main(String[] args) {
		
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);		
		// ù��° �޴� �����ֱ�
		showMenu4();
		showMenu();

		int select = sc.nextInt();		
		
		switch (select) {
		//���� Ȱ��ȭ
		case 1:
			TcpApplication app = new GameAppServer();
			app.init();
			app.start();
			sc.close();
			break;
		//���α׷� ����
		case 0:	
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);			
		}//switch scope		

	}//main scope

	private static void showMenu() {
		System.out.printf("                                      \n");
		System.out.printf("                                      \n");
        System.out.printf("          �����������������������������\n");
        System.out.printf("          ��                          ��                        ��\n");
        System.out.printf("          ��      <<< SERVER >>>      ��   <<< 211�� 6�� >>>    ��\n");
        System.out.printf("          ��                          ��                        ��\n");
        System.out.printf("          �����������������������������\n");
        System.out.printf("                                      \n");

        System.out.printf("                                      \n"); 
        System.out.printf("������ Ȱ��ȭ �Ͻðڽ��ϱ�?                   \n");
        System.out.printf("                                      \n");
        System.out.printf("          [1] �� yes            ");
        System.out.printf("[0] �� No                     \n");
        System.out.printf("                                      \n");
        System.out.printf("                                      \n");		
		
	}
	
	public static void showMenu4() {
		System.out.printf("                                      \n");
		System.out.printf("                                      \n");
		System.out.printf("\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				" ��������������������������������������                                       \r\n" + 
				" ��                          .*           *,           *~                ��     \r\n" + 
				" ��      :;;;;: -@    ,@@@@~ .@   ~:   :  @~    $@@@*  @;    :.    :.    ��     \r\n" + 
				" ��      @@@@@@ -@    @#  *@ .@   $@   @  @~   =@  .@  @;    @,    @-    ��     \r\n" + 
				" ��          @$ -@    @    @ .@   $@   @  @~   #*   @* @;    @#$$$$@-    ��     \r\n" + 
				" ��         .@  -@    #@--@@ .@   $@@@@@  @~   !@:-#@  @;    @$====@-    ��     \r\n" + 
				" ��         @@  -@##   #@@$  .@   $@..,@  @@@.  ~@@@   @;    @,    @-    ��     \r\n" + 
				" ��        =@.  -@;;    .-:;;.@   $@   @  @*;.   .,~;;-@;    @@@@@@@-    ��     \r\n" + 
				" ��       @@-   -@   @@@@@@@#.@   $@..,@  @~  *@@@@@@@:@;       @;       ��     \r\n" + 
				" ��     -@@,    -@      *@   .@   $@@@@@  @~      @.   @;       @;       ��     \r\n" + 
				" ��      *      -@      *@   .@           @~      @.   @;  ~~~~~@*~~~~   ��     \r\n" + 
				" ��             -@      *@   .@           @~      @.   @;  @@@@@@@@@@@   ��     \r\n" + 
				" ��             -@      *@   .@           @~      @.   @;                ��     \r\n" + 
				" ��                                                                      ��     \r\n" + 
				" �������������������������������������� \n");


		
		System.out.printf("                                      \n");	
	}	

}
