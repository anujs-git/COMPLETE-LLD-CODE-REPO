package Parking_Lot.src.main.java.ParkingLot.Parking_Spot;
public class TwoWheelerSpot extends ParkingSpot{
    int twoWheelPrice=10;
    public TwoWheelerSpot(int id){
      super(id);
      this.price=twoWheelPrice;
      this.vehicle=VehicleType.TWO_WHEELER;
    }
}