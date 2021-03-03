package vitals;
/**
 * @author BUP5KOR
 *
 */
public class Vitals {
	
      public static void main(String[] args) {
    	  
    	  LiIonBattery lionBattery = new LiIonBattery();
    	 
    	assert(lionBattery.isBatteryOk(25, 70, 0.7f) == true); 
        assert(lionBattery.isBatteryOk(50, 85, 0.0f) == false);
        
        assert(lionBattery.isBatteryOk(25, 20, 0.9f) == false); 
        assert(lionBattery.isBatteryOk(25, 55, 0.9f) == false);
        assert(lionBattery.isBatteryOk(55, 65, 0.7f) == false);
        assert(lionBattery.isBatteryOk(15, 85, 0.7f) == false);
        assert(lionBattery.isBatteryOk(15, 15, 0.7f) == false);
        assert(lionBattery.isBatteryOk(15, 25, 0.9f) == false);
        assert(lionBattery.isBatteryOk(45, 80, 0.8f) == true);
        assert(lionBattery.isBatteryOk(50 , 90, 0.9f) == false);
        assert(lionBattery.isBatteryOk(-1 , 40, 0.6f) == false);
    	                
       System.out.println("Testing Finished!!");
    }

}

