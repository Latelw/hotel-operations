public class Reservation {
    private String roomType;
    private int numOfNights;
    private boolean weekend;

    public String getRoomType() {
        return roomType;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public Reservation(String roomType, boolean weekend, int numOfNights) {
        this.roomType = roomType;
        this.weekend = weekend;
        this.numOfNights = numOfNights;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }
    public double getPrice() {
       double price = 0;
       if (this.roomType.equalsIgnoreCase("king")) {
           price = 139.00;
       } else if (this.roomType.equalsIgnoreCase("queen")) {
           price = 124.00;
       }if (weekend){
           price = price + (price * 0.1);
        }


        return price;
    }
    public double getReservation(){
        return getPrice() * getNumOfNights();
    }
}
