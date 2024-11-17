
public  class  TestRandom {
	public static void main(String[]  args) {
	    int numberOfTest = Integer.parseInt(args [0]);
		double smallerThen = 0;
		double biggerthan = 0;
		

		for (int i = 0; i < numberOfTest; i++) {
			double random = Math.random();
		 
				if (random < 0.5) {
				smallerThen = smallerThen + 1;
				}
				if (random >= 0.5) {
					biggerthan = biggerthan + 1;	
				}
			}
				System.out.println ("> 0.5: " + (int) smallerThen);
				System.out.println ("<= 0.5: " + (int) biggerthan);

				if (smallerThen == 0) {
					System.out.println(" ");
				} else if (biggerthan == 0) {
					System.out.println(" ");
                } else if (smallerThen < biggerthan) {
			    System.out.println ("Ratio: " + smallerThen / biggerthan);
				} else if (biggerthan < smallerThen) {
				System.out.println("Ratio: " + biggerthan / smallerThen);
				} else if (smallerThen == 0) {
					System.out.println(" ");
				} else if (biggerthan == 0) {
					System.out.println(" ");
				} 
				}
					
				}
				
				
				
				
				
			
		
	

