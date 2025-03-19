package session4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 
{
	public static void main(String[] arg) throws IOException
	{
		File file = new File("C:\\Users\\002B1S744\\Documents\\My_Certifications\\FullStack\\newdoc.txt");
		
		if(file.createNewFile())
		{
			System.out.println("New file got created - " + file);
		}
		else
		{
			System.out.println("File already exists at this path - " + file);
		}
		
		//get the file Object
		File fileUtil = FileUtils.getFile(file);
		//Read file
		System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
	
		FileWriter writer = new FileWriter(file);
        writer.write("Hello, World..!! \n This is a new line.");
        writer.close();
        System.out.println("Successfully wrote to the file.");
        
        System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
        
		//Create directory
		File destDir = new File("C:\\Users\\002B1S744\\Documents\\My_Certifications\\FullStack\\resources");
		//Copy file to directory
		FileUtils.copyFileToDirectory(file, destDir);
		System.out.println(file + " file copied to Directory - " + destDir);
		
		//Get file from new directory
		File newFile = FileUtils.getFile(destDir, "newdoc.txt");
		//Read data from file
		String newFileData = FileUtils.readFileToString(newFile, "UTF8");
		
		System.out.println("Data in new file: " + newFileData);
	}
}
