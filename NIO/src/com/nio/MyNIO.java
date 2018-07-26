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
		
			//创建文件输入流
			FileInputStream fin = new FileInputStream(new File( "readandshow.txt" ));
			//构建通道
			FileChannel channel2 = fin.getChannel();
			//缓冲区大小
			ByteBuffer allocate = ByteBuffer.allocate(1024);
			//读取进缓冲区
			channel2.read(allocate);
	}
	
}
