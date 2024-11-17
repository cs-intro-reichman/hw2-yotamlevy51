// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	String w = args [0];
        w = w.toUpperCase();
        int number = Integer.parseInt(args [1]);
        String an = "AEFHILMNORSX";

        for (int i = 0; i < w.length(); i++) {
                boolean TF = false;
                for (int n = 0;  n < an.length() ; n++) {
                        if (w.charAt(i)==an.charAt(n)) {
                                TF = true;
                                
                        }
                    
                }
                if (TF==true) {
                        System.out.println("Give me an " + w.charAt(i) + ": " + w.charAt(i) + "!");
                } else {
                        System.out.println("Give me a  " +  w.charAt(i) + ": " + w.charAt(i) + "!"); 
                        }    
        }
        System.out.println("What does that spell?");
        for (int v = 0; v < number; v++) {
                System.out.println(w + "!!!");
            
        }


        }
}
