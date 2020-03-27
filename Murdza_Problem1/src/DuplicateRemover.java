import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {

 // Define a Set to Store Strings
 private Set < String > uniqueWords;

 // Method that Removes Duplicate Words from the Set of Strings
 public void remove(String dataFile) {
	 
	 // Conduct the Removal Process
	 try {
	 String word;
	 
	 // Create a Hash Set
	 uniqueWords = new HashSet < String > ();
	 
	 // Initialize the Scanner
	 Scanner sc = new Scanner(new File(dataFile));
	 
	 	// Run Until the End is Reached
	 	while (sc.hasNext()) {
	 		
	 		// Scan in Word
	 		word = sc.next();
	 		
	 	    // Add Word to Group of Unique Words
	 		uniqueWords.add(word);
	 	}
	 	
	    // Close Scanner
	 	sc.close();
	 	
	 // Tell User if an Exception has Occurred
	 } catch (Exception e) {
         System.out.println(e.getMessage());
     }
 }

 // Method that Prints the Updated Set of Strings to the Output File
 public void Write(String outputFile) {
	 
	 // Conduct the Writing Process
	 try {
	
	 // Variable Declaration	 
	 File f;
	 FileWriter fw = null;

	 // Initialize the File
	 f = new File(outputFile);
	 
	 // Print Data to File as Long as it Exists
	 if (f.exists()) {
		 fw = new FileWriter(f, true);
		 
		 // Initialize Iterator
		 Iterator itr = uniqueWords.iterator();

		 // Run Until the End of Strings is Reaches
		 while (itr.hasNext()) {
			 String str = (String) itr.next();
			 fw.write(str + "\n");
		 }
		 
		 // Close Writer and Send Upload Confirmation to User
		 fw.close();
		 System.out.println("Data Successfully Uploaded to Output File");

	 } else {
		 
		 // Create a New File if One Doesn't Exist
		 f.createNewFile();
		 fw = new FileWriter(f);
		 
		 // Initialize Iterator
		 Iterator itr = uniqueWords.iterator();

		 // Print Strings Until the End is Reached
		 while (itr.hasNext()) {
			 String str = (String) itr.next();
			 fw.write(str + "\n");
		 }
		 // Close Writer and Send Upload Confirmation to User
		 fw.close();
		 System.out.println("Data Successfully Uploaded to Output File");
	 }
	 
	  // Tell User if an Exception has Occurred
	  } catch(Exception e) {
		  System.out.println(e.getMessage());
      }
   }
}