import java.util.Scanner;
 
class Temperature {

  	public static void main(String[] args) {

    double fahrenheit = 0;
    double celsius = 0;
    String temperature_units;

    final double CONSTANTE_1 = 32;
    final double CONSTANTE_2 = (.55556);
    

    Scanner in = new Scanner(System.in);  

 	System.out.println("We are going to convert temperature");
    System.out.println("Choose the units of your temperature");
    System.out.println("celsius or fahrenheit");
    temperature_units = in.nextLine();

    if (temperature_units.equals("celsius")) {

    	System.out.println("Type the temperature");
    	celsius = in.nextDouble();
    	double fahrenheit_temperature = (celsius * 1.8) + CONSTANTE_1;

    	System.out.println("Your temperature in fahrenheit is: " + fahrenheit_temperature + "ºF");
    }

    else if (temperature_units.equals("fahrenheit")) {
    	
    	System.out.println("Type the temperature");
    	fahrenheit = in.nextDouble();

    	double celsius_temperature = (fahrenheit - CONSTANTE_1) * CONSTANTE_2;

    	System.out.println("Your temperature in celsius is: " + celsius_temperature + "ºC");

    }

 
   
  }


}