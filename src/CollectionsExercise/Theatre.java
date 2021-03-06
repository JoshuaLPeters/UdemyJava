//package CollectionsExercise;
//
//import java.util.ArrayList;
//
//public class Theatre {
//    private final String theatreName;
//    private list<Seat> seats = new ArrayList<>();
//
//    public Theatre(String theatreName, int numRows, int seatsPerRow) {
//        this.theatreName = theatreName;
//
//        int lastRow = 'A' + (numRows -1);
//        for(char row = 'A'; row <= lastRow; row++){
//            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
//                Seat seat = new Seat(row + String.format("%02d", seatNum));
//                seats.add(seat);
//            }
//        }
//
//    }
//
//    public boolean reserveSeat(String seatNumber){
//        Seat requestSeat = null;
//        for (Seat seat : seats){
//            if(seat.getSeatNumber().equals(seatNumber)){
//                requestSeat = seat;
//                break;
//            }
//        }
//        if(request.Seat == null){
//            System.out.println("There is no seat" + seatNumber);
//            return false;
//        }
//        return requestedSeat.reserve();
//    }
//
//
//    public String getTheatreName() {
//        return theatreName;
//    }
//
//    //testing
//    public void getSeats(){
//        for(Seat seat : seats){
//            System.out.println(seat.getSeatNumber());
//        }
//    }
//
//    private class Seat{
//        private final String seatNumber;
//        private boolean reserved = false;
//
//        public Seat(String seatNumber) {
//            this.seatNumber = seatNumber;
//        }
//    }
//    public boolean reserve(){
//        if(!this.reserved){
//            this.reserved = true;
//            System.out.println("Seat" + seatNumber + " reserved");
//        } else {
//            return false;
//        }
//    }
//}
