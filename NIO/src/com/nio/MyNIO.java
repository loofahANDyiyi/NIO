package com.nio;

import java.awt.Event;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;

public class MyNIO {
	Socket socket;
	Channel channel;
	Event event;
	public static void main(String[] args) throws IOException {
		
			//�����ļ�������
			FileInputStream fin = new FileInputStream(new File( "readandshow.txt" ));
			//����ͨ��
			FileChannel channel2 = fin.getChannel();
			//��������С
			ByteBuffer allocate = ByteBuffer.allocate(1024);
			//��ȡ��������
			channel2.read(allocate);
	}
	
}
