package test01;
import java.util.Date;
import java.text.SimpleDateFormat;
public class time {	
    public static void main(String[] args) throws InterruptedException { 
    	while (true) {
			Thread.sleep(500);
			SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
			String now = formatter.format(new Date());
			System.out.println(now);
			if ("23:36:21".equals(now)) {
				break;
			}
	    }
    	
    	System.out.println("!!!!ok");
    }
}
