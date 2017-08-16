public class converter
{
	public static void main(String[] args)
	{
		System.out.println("Welcome the metric/imperial converter");

		boolean loop = true;
		while(loop == true){

		char Decider = Input.getChar("Convert to Imperial or Metric (I/M)");

		if(Decider == 'I' || Decider == 'i'){
			if(WeightOrLength() == true)
				weight2Imperial = new weight2Imperial(Input.getDouble("Put in the amount of kilos (0 if none)"), Input.getDouble("Put in the amount of grams (0 if none)"));
			else
				length2Imperial = new length2Imperial(Input.getDouble("Put in the amount of kilometers (0 if none)"), Input.getDouble("Put in the amount of meters (0 if none)"));



			loop = false;
		} else if(Decider == 'M' || Decider == 'm'){
				if(WeightOrLength() == true) {
					weight2metric(Input.getDouble("Put in the number of pounds (0 if none)"), Input.getDouble("Put in the number of ounces"));
				}
				else{
					length2metric(Input.getDouble("Put in the number of miles (0 if none)"), Input.getDouble("Put in the number of feet (0 if none)"));




					loop = false;
		} else {
			continue;
		}
	}

	public void weight2Imperial(double Kilo, double Gram){


		OverConverter(Kilo, 2.2046F, Gram, 0.03527F, 16F, kilograms, grams, pounds, "percentage of the pound");

	}

	public void length2Imperial(double Km, double Me){


		OverConverter(Km, 0.6214F, Me, 3.2808F, 5280F, "kilometers", "meters", "miles", "feet");

	}

	//OverConverter(double a, double c, double b, double c1, double y, String GreaterOg, String LowerOg, String GreaterCon. String LowerCon)

	public static void weight2metric(double Lbs, double Oz){


		OverConverter(Lbs, .4536F, Oz, 0.00285F, 1000F, "pounds", "ounce", "kilogram", "Percentage of kilogram (gram)");


	}

	public static void length2metric(double Miles, double Feet){
        	OverConverter(Miles, 1.61F, Feet, .0003048F, 1000F, "miles", "feet", "kilometers", "meters");

	}

	public static boolean WeightOrLength(){

		Boolean Satin = true;
		Boolean loopin = true;
		char Decider = Input.getChar("Weight or Height (W/H)");

		while (loopin == true) {

			if (Decider == W || Decider == w) {
				Satin = true;
				Loopin = false;
			} else {
				if (Decider == H || Decider == h) {
					Satin = false;
					Looping = false;
				} else {
					continue;
				}
			}
			return Satin;
		}
	}



	public static void OverConverter(double a, double c, double b, double c1, double y, String GreaterOg, String LowerOg, String GreaterCon. String LowerCon)
	{


	double x = a * c;

	double r = b * c1;

	double z = x % y;

	double q = (x - z)/y;

	double m = z + r;

	if(m > z){
		//redoing the orginal computation on the smaller value which has the potential to become larger than the larger denomination
		double n = z % y;
        	double l = (z - n)/y;

		q += l;
		z += n;
	}

	double p = m/y + q;

	System.out.println( a + " " +  GreaterOg  + " & " + b + " " + LowerOg + " in " + GreaterCon +" and " + LowerCon + " is " + q + " " + GreaterCon + " and " + z + " (Or just " + p);
	}

}


