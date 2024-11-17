

public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        String [] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int minutesToAdd = Integer.parseInt(args [1]);
        int totalmin = (hours*60) + minutes + minutesToAdd;
        int totalhour = totalmin/60;
        int newhour = (totalhour%24);
        int newmin = (totalmin - (totalhour*60));
        String updathour = String.valueOf (newhour);
        String updatmin = String.valueOf (newmin);

        if (newhour<10) 
        {
         updathour = "0" + newhour;   
        }
        if (newmin<10)
         {
         updatmin = "0" + newmin;
        }
        System.out.println(updathour + ":" + updatmin);

    }
}
