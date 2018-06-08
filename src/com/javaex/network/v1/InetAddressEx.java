package com.javaex.network.v1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		try {
			//	내 IP 주소 확인
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("IP Address:" + local.getHostAddress());
			
			String hostName = "www.naver.com";
			
			//	www.google.com 의 서버 IP를 받아와 봅시다
			InetAddress[] adrs = InetAddress.getAllByName(hostName);
			for(InetAddress remote:adrs) {
				System.out.println("IP Address:" + 
			remote.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
