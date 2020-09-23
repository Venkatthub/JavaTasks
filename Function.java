//Interface

public class Function implements Car{
	
public void run() {
		System.out.println("Car is running at "+speed+" KM speed per hour !");
	}

public void stop() {
		System.out.println("Car is not moving");
	}

public static void main(String[] args) {
		Function o=new Function();
		o.run();
		o.stop();
	}

}


interface Car {

public static final int speed=250; 
void run();
void stop();

}