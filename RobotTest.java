package test01;
import java.awt.*;
import java.awt.event.InputEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class RobotTest {

	public static void main(String[] args) throws AWTException, InterruptedException {
			//一定要F8第3小的窗口（差一下就全屏了）。把抽奖窗口放置在；
			System.out.println("输入开卡的数量：");
			@SuppressWarnings("resource")
			Scanner scan =new Scanner(System.in);
			int c =scan.nextInt();
			Robot robot = new Robot();
	    	while (true) {
				Thread.sleep(1000);
				SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
				String now = formatter.format(new Date());
				System.out.println(now);
				if ("00:14:50".equals(now)) {
					break;
				}
		    }		
	while(c>0){	
			robot.mouseMove(200, 440);//进入园区
			MouseTatch(robot);
			

			robot.mouseMove(100, 340);//左下：锐速
			MouseTatch(robot);
			

			robot.mouseMove(150, 200);//左上：翼刃
			MouseTatch(robot);
			

			robot.mouseMove(270, 200);//右上：光速
			MouseTatch(robot);
			
			/*robot.mouseMove(270, 340);//右下：银翼杀手
			MouseTatch(robot);*/
			

			robot.mouseMove(200, 440);//游玩
			MouseTatch(robot);
			
		
			robot.mouseMove(520, 540);//点击确定
			MouseTatch(robot);
			
			c--;
			}
	}
	
	
//延时防检测	
	public static void  RandomDelay(Robot robot){
			Random random =new Random();
			double v = random.nextDouble();
			v = 0.3 + v*(0.2);
			int m = (int)v*1000;
			robot.delay(m);
	} 
	
//模拟按键
	public static void MouseTatch(Robot robot){
			RandomDelay(robot);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			RandomDelay(robot);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			RandomDelay(robot);
	}
}
	