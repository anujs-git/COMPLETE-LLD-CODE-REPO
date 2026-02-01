package Parking_Lot.src.main.java.ParkingLot.Parking_Spot;

public class FourWheelerSpot extends ParkingSpot{
    int fourWheelprice=20;
    public FourWheelerSpot(int id){
        super(id);
        this.price=fourWheelprice;
        this.vehicle=VehicleType.FOUR_WHEELER;
    }
}
