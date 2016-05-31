
public class Berechnung {
	
	public static double[] berechnung(double sekundenSprint, double sprungDistanz, double wurfDistanz, boolean gJunge) {
		
		
		double punkteSprint, punkteSprung, punkteWurf;
	
		if (gJunge == true) {
			punkteSprint = (75 / (sekundenSprint + 0.24) - 4.1) / 0.00664;
			punkteSprung = ((Math.sqrt(sprungDistanz)) - 1.15028) / 0.00219;
			punkteWurf = ((Math.sqrt(wurfDistanz)) - 1.936) / 0.0124;
		} else {
			punkteSprint = (75 / (sekundenSprint + 0.24) - 3.998) / 0.0066;
			punkteSprung = ((Math.sqrt(sprungDistanz)) - 1.0935) / 0.00208;
			punkteWurf = ((Math.sqrt(wurfDistanz)) - 1.4149) / 0.01039;
		}
		
		double[] werte = {punkteSprint,punkteSprung,punkteWurf};
		
		return werte;

	}
}
