package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			// 기반스트림(byte)
			FileInputStream fis = new FileInputStream("phone.txt");
			
			// 보조스트림1(byte|byte|byte -> char)
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			
			// 보조스트림2(char1|char2|char3|\n -> "char1char2char3")
			br = new BufferedReader(isr);
			
			String line = null;
					
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			
		} catch (UnsupportedEncodingException e) {
			System.out.println("error:" + e);
		} catch(IOException e){
			System.out.println("error:" + e);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("error:" + e);
			}
		}

	}

}
