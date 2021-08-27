package com.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public abstract class TcpApplication { //�߻�޼ҵ�

	public static String IP;
	public static int PORT;
	public static String CONFIG = "config/applicationcontext.ini";	
	
	//[�ʱ�ȭ] IP,PORT �ʱ�ȭ
	public void init() {
		
		//���������ͷκ��� �ʿ��� �׸��� ����
		Properties settings = new Properties();
				
		try {
			settings.load(new FileInputStream(CONFIG)); //load�� ���� ���� ����.
			IP = settings.getProperty("IP"); // "IP"�� ���� ���� ����
			PORT = Integer.parseInt(settings.getProperty("PORT")); //"PORT"�� �������� ����

		}catch (IOException e) {
			System.out.println("��������(applicationcontext.ini)�� ã���� �����ϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);			
				}		
	}	

	public abstract void start();	
	//GameAppServer���� ��ӹ޾Ƽ� ����
	//GameAppClient���� ��ӹ޾Ƽ� ����

}

