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
			BufferedReader br = new BufferedReader(new FileReader("D:\\small-test.in.txt"));			
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\small-test.out.txt"));			
			int ci = Integer.parseInt(br.readLine());
			for (int i = 0; i < ci; i++) {				
		    	String[] words = br.readLine().split("\\s");
		    	String first = words[0];
		    	String second = words[1];
		    	Labirint labir = new Labirint();
		    	List<String> l = new ArrayList<>();		
		    	l = labir.labirnt(first,second);				
	            bw.write("Case #"+ (i+1) +":"+ "\n");
	            for (int j = 0; j < l.size(); j++) {       	
	            	bw.write(l.get(j) + "\n");
				}
	            bw.flush();
		    }			
			 br.close();
	         bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Файл не найден!");			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Готово!");
		}	
	}
}