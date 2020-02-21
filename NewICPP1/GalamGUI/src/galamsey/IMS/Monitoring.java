package galamsey.IMS;
import java.util.ArrayList;

/**
 * @author Hussein Fuseini
 *
 */
public class Monitoring {
	
	
	
	private ArrayList<Observatory> Observatories;
	
	/**
     *Monitoring constructor
     * 
     * */
	public Monitoring() {
		Observatories = new ArrayList<>();
	}
	
	/**
     * @return 0
     * 
     * */
	
	
	/**
	 * @param observatory
	 * Takes an instance of an observatory and adds it to 
	 * an instance of the monitoring class
	 */
	public void addObservatory(Observatory Observe) {
		Observatories.add(Observe);
	}
	// This method returns A list of all “galamsey�? recorded with colour 
	// value greater than a given/arbitrary number.
	public ArrayList<Observatory> getObservatories(){
		
		return Observatories;
	}
	// This method returns The observatory with the largest average “galamsey�? colour value.
	
	public String getObservatoryWithLargeAverage() {
		Observatory large = null;
		for(Observatory E:getObservatories())
			if(E.averageGalamseyCValue()>large.averageGalamseyCValue())
				large = E;
		return large.toString();
	}
	public double getLargestAverageGalamseyValue() {
		double large = 0.0;
		for(Observatory E:getObservatories())
			if(E.averageGalamseyCValue()>large)
				large = E.averageGalamseyCValue();
		return large;
	}
	public int largestGalamseyValueEverRecord() {
		int large = 0;
		for(Observatory E:getObservatories())
			if(E.getLargestGalamseyColorV()>large)
				large = E.getLargestGalamseyColorV();
		return large;
	}
	
	public String getAllGalamseyActAboveValueof(int value) {
		String info = "";
		for(Observatory E:getObservatories())
			for(Galamsey A:E.getGalamseyEvents())
				if(A.getColour_val()>value) {
					String y =A+"\n";
					info+=y;
			}
		return info;
	}
	
	public String getAllObservatory() {
		String info = "";
		for(Observatory E:getObservatories()) {
			String y =E+"\n\n";
			info+=y;
		}
		return info;
			
	}
	public String getAllGalam() {
		String info = "";
		for(Observatory E:getObservatories())
			for(Galamsey A:E.getGalamseyEvents()){
					String y =A+"\n\n";
					info+=y;
			}
		return info;
	}
		
}


