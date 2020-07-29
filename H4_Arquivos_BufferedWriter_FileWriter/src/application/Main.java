package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "/Users/lucasmourapereira/out.txt";
		
		//recria o arquivo sempre que o programa é rodado
		
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
//			for(String line : lines) {
//				bw.write(line);
//				bw.newLine();
//			}
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
		
		//adiciona o conteudo sempre no mesmo arquivo (Acrescenta o parametro true)
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}		
}
