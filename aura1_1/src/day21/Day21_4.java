package day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Day21_4 {

	public static void main(String[] args) {
		URL url=null;
		try {
			 url = new URL("https://www.baidu.com/?tn=62095104_14_oem_dg");
			System.out.println(url.getProtocol());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try(InputStream in = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in))){
			String s = null;
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
