package day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Day21_1 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.taobao.com/");
			System.out.println(url.getProtocol());
			url.getHost();
			url.getPort();
			InputStream in =url.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String s = null;
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

}
