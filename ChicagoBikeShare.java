public class ChicagoBikeShare{
   
   //Fields
   private double latitude, longitude;
   private int availableDocks, availableBikes, totalDocks;
   private boolean testStation;
   
   //Default constructor
   public ChicagoBikeShare(){
      latitude = 0.0;
      longitude = 0.0;
      availableDocks = 0;
      availableBikes = 0;
      totalDocks = 0;
      testStation = false;
   }
   
    //Specified Constructor
   public ChicagoBikeShare(double bLat, double bLong, int aDocks, int aBikes, int tDocks, boolean station){
      latitude = bLat;
      longitude = bLong;
      availableDocks = aDocks;
      availableBikes = aBikes;
      totalDocks = tDocks;
      testStation = station;
   }
   
   //Accessors
   public double getLatitude(){
      return latitude;
   }
   public double getLongitude(){
      return longitude;
   }
   public int getAvailableDocks(){
      return availableDocks;
   }
   public int getAvailableBikes(){
      return availableBikes;
   }
   public int getTotalDocks(){
      return totalDocks;
   }
   public boolean getTestStation(){
      return testStation;
   }
   
   //Mutators
   public void setLatitude(double bLat){
      latitude = bLat;
   }
   public void setLongitude(double bLong){
      longitude = bLong;
   }
   public void setAvailableDocks(int aDocks){
      availableDocks = aDocks;
   }
   public void setAvailableBikes(int aBikes){
      availableBikes = aBikes;
   }
   public void setTotalDocks(int tDocks){
      totalDocks = tDocks;
   }
   public void setTestStation(boolean station){
      testStation = station;
   }
   
   //toString
   public String toString(){
      return "Latitude: " + latitude + "Longitude: " + longitude + "Available docks: " + availableDocks + "Available bikes: " + availableBikes + "Total docks: " + totalDocks + "Test Station: " + testStation;
   }
}
