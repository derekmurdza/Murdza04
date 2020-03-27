import java.io.IOException;

public class Application {

   public static void main(String[] args) throws IOException {
       
	   // Initialize the Removal Class
	   DuplicateRemover dr = new DuplicateRemover();
       
	   // Run Both Methods using the Given File Names
       dr.remove("problem1.txt");
       dr.Write("unique_words.txt");
   }
}