import comm.SerialEvent;
import conf.SerialConf;

public class Serial {
	public static void main(String[] args) {
		try {
			SerialEvent serialEvent = new SerialEvent();
			serialEvent.handle();			
		} catch (Exception e) {
			System.out.println("Error: handle!!!");
			e.printStackTrace();
		}
	}
}
