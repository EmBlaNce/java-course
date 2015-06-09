package homework11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Prog1 {

	public static void main(String[] args) {
		String text = null;
		
		try {
			text = readFile("read1.txt");
		} 
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			writeFile("write1.txt", text);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static String readFile(String fileName) throws FileNotFoundException, IOException {
		
		FileReader file = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(file);
		StringBuilder stringbuilder = new StringBuilder();
		while (reader.ready()) {
		
			stringbuilder.append(reader.readLine());
		}
		reader.close();
		file.close();
		return stringbuilder.toString();
	}
	
	private static void writeFile(String fileName, String text) throws FileNotFoundException, IOException {
		FileWriter file = new FileWriter(fileName);
		BufferedWriter writer = new BufferedWriter(file);
		
		writer.write(text);
		writer.close();
		file.close();
	}
}