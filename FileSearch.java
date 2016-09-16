import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class FileSearch{

	private File file;
	private Scanner fileScanner;
	private int positive , negative;
	
	public void Read(File file){

		try{
		
			fileScanner = new Scanner(file);

			while(fileScanner.hasNext()){
				String word = fileScanner.next();
	
				System.out.println("Document Says: " + word);
				
				if(word.equals("good") || word.equals("rising") || word.equals("profit"))
					positive++;
				else if(word.equals("bad") || word.equals("falling"))
					negative++;

			}

			if((positive - negative) > 0)
				System.out.println("You should invest. " + "Positives: " + positive + " Negatives: " + negative);

		}catch(IOException e){}
		
	}

	public static void main(String[] args){


		FileSearch fs = new FileSearch();
		fs.file = new File("hello.txt");
		fs.Read(fs.file);
		
	}


}
