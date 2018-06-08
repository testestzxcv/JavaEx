package com.javaex.network.v5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		//	서버 소켓을 생성
		ServerSocket serverSocket = null;
		
		try {
			//	바인드
			serverSocket = new ServerSocket();
			InetSocketAddress local = new InetSocketAddress("192.168.1.21", 10001);
			serverSocket.bind(local);
			
			//	시작 메시지를 출력
			System.out.println("<서버 시작>");
			System.out.println("[연결을 기다립니다.]");
			
			//	연결을 기다려 봅니다: 대기 상태
			while(true) {
				Socket socket = serverSocket.accept();
				Thread thread = new ServerThread(socket);
				thread.start();
			}
			
			

			//	후처리
//			System.out.println("============");
//			System.out.println("<서버 종료>");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
