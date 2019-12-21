
public class Bus {
static int seats;
String color;

  Bus(int seats, String color){
	  this.seats = seats;
	  this.color = color;
	  
  }
  Bus(){
	  this(40);
	  
  }
public Bus(int seats) {
	this(seats, "red");
}
void getDetails() {
	System.out.println("num of seats in bus ::"+seats);
	System.out.println("color of bus ::"+color);
}

}
