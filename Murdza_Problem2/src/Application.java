public class Application{
   
	public static void main(String[] args){
      
       // Initialize the Counter Class
       DuplicateCounter dc = new DuplicateCounter();
       
       // Run Both Methods Using the Given File Names
       dc.count("problem2.txt");
       dc.write("unique_word_counts.txt");
       
       // Print Confirmation to User
       System.out.println("Data Successfully Uploaded to Output File");
   }
}