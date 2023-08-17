package application;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory); //cria um vetor de files contendo as pastas do path
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);//cria um vetor de files contendo os arquivos do path
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();//cria uma subpasta no path
		System.out.println("Directory created successfuly: " + success);
		
		
		
		sc.close();

	}

}
