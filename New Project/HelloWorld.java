public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        Joystick a = new Joystick(1);
		Joystick b = new Joystick(1);
		Xbox x = (Xbox) b; //this is what I wanted to do
		//Xbox_1 = new Xbox_1(b); //this is what I ended up doing
     }
}
