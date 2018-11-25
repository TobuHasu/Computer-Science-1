import java.util.Scanner;
import core.data.*;

public class DataDriver{
   
   //Link to Chicago bike share data
   public static String url = "https://feeds.divvybikes.com/stations/stations.json";
   public static DataSource ds = DataSource.connect(url);
   
   //main method
   public static void main(String[] args){
   Scanner kb = new Scanner(System.in);
      
      //load the data source
      ds.load();
      
      //reveal the structure of the JSON file
      testSource();
      
      //Total number of docks? How many are test stations?
      int dockCount = 0;
      int testCount = 0;
      for(int i = 0; i < bikeShare.length; i++){
         if (bikeShare[i].getTestStation().equals true){
         testCount++;
      }
   }
   
   public static ChicagoBikeShare[] fetchAll(){
      ChicagoBikeShare[] bikeShare = ds.fetchArray("ChicagoBikeShare", "latitude", "longitude", "id", "availableDocks", "availableBikes", "totalDocks", "testStation");
      return bikeShare;
   }
   ChicagoBikeShare[] bikeShare = fetchAll();
   
   //display the JSON structure for available data
   public static void testSource(){
      ds.printUsageString();
   }
}
