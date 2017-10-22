package avinav.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;

public class BestHotelDeal {
    private final String dealsFileName;
    private final String hotelName;
    private final Date startDate;
    private final int duration;
   // private HashMap<String, List<Deal>> dealsMap = 
    
    public static void main(String []args) {
        BestHotelDeal runner = new BestHotelDeal(args);

        
    }

    public BestHotelDeal(String[] args) {
        if (args.length != 4) {
        System.out.println("Incorrect number of arguments");
        }
        dealsFileName = args[0];
        hotelName = args[1];
        startDate = new Date(args[2]);
        duration = Integer.valueOf(args[3]);
    }

    private void readDealsFile(String fileName) throws Exception {
        BufferedReader br = null;
        String line = "";
        String commaSeparator = ",";

        try {
            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                    // use comma as separator
                String[] details = line.split(commaSeparator);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Done");
      }
    }
}
