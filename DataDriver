import core.data.*;

public class DataDriver{
   
   //Link to Chicago bike share data
   public static String url = "https://feeds.divvybikes.com/stations/stations.json";
   public static DataSource ds = DataSource.connect(url);
   
   //main method
   public static void main(String[] args){
      
      //load the data source
      ds.load();
      
      //reveal the structure of the JSON file
      testSource();
   }
   
   //display the JSON structure for available data
   public static void testSource(){
      ds.printUsageString();
   }
}
