import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCounter{
  
   // Create a String Map
   private HashMap<String, Integer> wordCounter;
   
   // Extra Method that Initializes the Map
   public DuplicateCounter(){
       wordCounter = new HashMap<String, Integer>();
   }

   // Function that Counts the Occurrences of Unique Words
   public void count(String dataFile){
	   
	   // Resets Count to Zero
       wordCounter.clear();
       
       // Conduct the Counting Process
       try{
    	   // Read the Input File
           Scanner in = new Scanner(new File(dataFile));
           
           // Define Word Variable
           String word;
           
           // Run Loop Until There are No Words Left to Read
           while(in.hasNext()){
               word = in.next();
               
               if(!word.equals("")) {
            	   // Set Count to One if Word Doesn't Repeat
                   if(wordCounter.get(word) == null)
                       wordCounter.put(word, 1);
                   else
                	   // Add One to Count if Word Repeats
                       wordCounter.put(word, wordCounter.get(word) + 1);
               }
           }
           // Close Scanner
           in.close();
           
       // Tell User if an Exception has Occurred
       } catch(Exception e) {
           System.out.println(e.getMessage());
       }
   }

   // Function that Prints the Word and it's Count to the Output File
   public void write(String outputFile){
	   
	   // Initialize Function
       try{
           PrintWriter out = new PrintWriter(new File(outputFile));
           
           // Print the Output
           for(String word : wordCounter.keySet()){
               out.println(word + " -> " + wordCounter.get(word));
           }
           // Close Writer
           out.close();
           
       // Tell User if an Exception has Occurred    
       } catch(Exception e) {
           System.out.println(e.getMessage());
      }
   }
}