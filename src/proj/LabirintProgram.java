package proj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LabirintProgram {
	
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(""));			
			BufferedWriter bw = new BufferedWriter(new FileWriter(""));			
			int ci = Integer.parseInt(br.readLine());
			for (int i = 0; i < ci; i++) {				
		    	String[] words = br.readLine().split("\\s");
		    	String first = words[0];
		    	String second = words[1];
		    	Labirint labir = new Labirint();
		    	List<String> l = new ArrayList<>();		
				}	            
		    			
			 br.close();
	         bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("������!");			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}