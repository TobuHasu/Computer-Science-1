public class ChicagoBikeShare{
   
   //Fields
   private double latitude, longitude;
   private int id, availableDocks, availableBikes, totalDocks;
   
   //Default constructor
   public ChicagoBikeShare(){
      latitude = 0.0;
      longitude = 0.0;
      id = 0;
      availableDocks = 0;
      availableBikes = 0;
      totalDocks = 0;
   }
   
   //Specified Constructor
   public ChicagoBikeShare(double bLat, double bLong, int sId, int aDocks, int aBikes, int tDocks){
      latitude = bLat;
      longitude = bLong;
      id = sId;
      availableDocks = aDocks;
      availableBikes = aBikes;
      totalDocks = tDocks;
   }
   
   //Accessors
   public double getLatitude(){
      return latitude;
   }
   public double getLongitude(){
      return longitude;
   }
   public int getId(){
      return id;
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
   
   //Mutators
   public void setLatitude(double bLat){
      latitude = bLat;
   }
   public void setLongitude(double bLong){
      longitude = bLong;
   }
   public void setId(int sId){
      id = sId;
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
   
   //toString
   public String toString(){
      return "Latitude: " + latitude + "Longitude: " + longitude + "Station ID: " + id + "Available docks: " + availableDocks + "Available bikes: " + availableBikes + "Total docks: " + totalDocks;
   }
}
