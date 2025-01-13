public class StringMethod {
    public static void main(String[] args) {
        //user input process can also be used rather than giving manual inputs
        String first="Online ";
        String second="Coding";
        String both=first+second;

        String Trick="Welcome"+" to "+"Online Coding Class";
        String codingalCapital=both.toUpperCase();
        String codingalSmall = codingalCapital.toLowerCase();        
        
        int lengthOfBothSentence=both.length();
        int lengthOfTrick=Trick.length();
        int sum=lengthOfBothSentence + lengthOfTrick;
    
        //Guess the answer before running
        // a msg can also be added for the output screen if required
        System.out.println(both);
        System.out.println(Trick);
        System.out.println(codingalCapital);
        System.out.println(codingalSmall);
        System.out.println("Total length of the first of 2 sentences above = " + sum + " characters");
    
      }
}
