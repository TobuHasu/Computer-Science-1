import java.util.Scanner;
import core.data.*;

public class DataDriver{
   
   //Link to Chicago bike share data
   public static String url = "https://feeds.divvybikes.com/stations/stations.json";
   public static DataSource ds = DataSource.connect(url);
   
   //Main Method
   public static void main(String[] args){
      Scanner kb = new Scanner(System.in);
      ds.load();
      testSource();
      ChicagoBikeShare[] bikeShare = fetchAll();

      //Total number of docks? How many docks are available?
      int dockCount = 0;
      int aDockCount = 0;
      for(int i = 0; i < bikeShare.length; i++){
         dockCount += bikeShare[i].getTotalDocks();
         aDockCount += bikeShare[i].getAvailableDocks();
      }
      System.out.println("Total number of docks: " + dockCount);
      System.out.println("Total number of available docks: " + aDockCount);
      
      //Total number of bikes available
      int bikeCount = 0;
      for(int j = 0; j < bikeShare.length; j++){
         bikeCount += bikeShare[j].getAvailableBikes();
      }
      System.out.println("Total number of available bikes: " + bikeCount);
      
      //Prompt user to type in a station id, print the longitude/latitude of that station
      System.out.print("Please enter a station id number from 2 to 663: ");
      int idNum = kb.nextInt();
      for(int num = 0; num < idNum; num++){
         if(idNum <= 663 && idNum >= 2){
            System.out.println();
         }
      }  
   }
   
   public static ChicagoBikeShare[] fetchAll(){
      ChicagoBikeShare[] bikeShare = ds.fetchArray("ChicagoBikeShare", "stationBeanList/latitude", "stationBeanList/longitude", "stationBeanList/id", "stationBeanList/availableDocks", "stationBeanList/availableBikes", "stationBeanList/totalDocks");
      return bikeShare;
   }
   //display the JSON structure for available data
   public static void testSource(){
      ds.printUsageString();
   }
}
