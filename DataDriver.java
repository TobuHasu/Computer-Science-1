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
      
      //Total number of docks? How many are test stations?
      
   }
   
   public static ChicagoBikeShare[] fetchAll(){
      ChicagoBikeShare[] bikeShare = ds.fetchArray("ChicagoBikeShare", "stationBeanList/latitude", "stationBeanList/longitude", "stationBeanList/id", "stationBeanList/availableDocks", "stationBeanList/availableBikes", "stationBeanList/totalDocks", "stationBeanList/testStation");
      return bikeShare;
   }
   //display the JSON structure for available data
   public static void testSource(){
      ds.printUsageString();
   }
}
