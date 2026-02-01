package Parking_Lot.src.main.java.ParkingLot.Parking_Spot;

public class ParkingSpot{
   int id;
   Boolean isEmpty;
   int price;
   VehicleType vehicle;

   public ParkingSpot(int id){
    this.id=id;
    this.isEmpty=true;
   }

   public void freeSpot(){
    isEmpty=true;
   }
   public void occupySpot(){
    isEmpty=false;
   }

   public int getPrice(){
      return price;
   }
   
   public int getId(){
      return id;
   }


}