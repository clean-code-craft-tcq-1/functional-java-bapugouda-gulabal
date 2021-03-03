package vitals;
/**
 * @author BUP5KOR
 *
 */
public class LiIonBattery implements Alerts{
	
	 boolean isBatteryOk(float temperature, float soc, float chargeRate) {
	      
		  boolean temperatureOk = istemperatureOK(temperature);
		  boolean socOk = issocOk(soc);
		  boolean chargeRateOk = ischargeRateOk(chargeRate);
		  
		  return temperatureOk&&socOk&&chargeRateOk;
	  }	 
	    	
	boolean istemperatureOK(float temperature) {
			
		 if(temperature < 0 || temperature > 45) 
		 {
			 alertVital("TEMPERATURE", temperature);
			 
			 //if Temperature is out of range
	         return false;
	      } 
			return true;
		}
	
	
	boolean issocOk(float soc) {
		
		if(soc < 20 || soc > 80)
		{
			alertVital("SOC", soc);
			
			//if SOC is out of range
			return false;
		}
		return true;
	}


	boolean ischargeRateOk(float chargeRate) {
		
		if(chargeRate > 0.8)
		{
			alertVital("ChargeRate", chargeRate);
			
			//if ChargeRate is out of range
			return false;
		}
		return true;
	}
	
		public void alertVital(String vital, float val) {
		
		System.out.println(vital+ ":-" +val);
		
	}

}
