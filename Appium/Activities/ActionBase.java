package activity;

import java.util.Arrays;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.AppiumDriver;

import static java.time.Duration.ofMillis;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;

public class ActionBase 
{
	//create pointer
	private static final PointerInput pointer = new PointerInput(Kind.TOUCH, "fingure");
	
	//create action
	public static void doSwip(AppiumDriver driver, Point start, Point end, int duration)
	{
		//create the sequence of actions
		Sequence swipe = new Sequence(pointer, 1)
				.addAction(pointer.createPointerMove(ofMillis(0), viewport(), start.getX(), start.getY()))
				.addAction(pointer.createPointerDown(LEFT.asArg())) //on mouse pointer - 0-LEFT, 1-MIDDLE, 2-RIGHT, 3-BACK, 4-FORWARD
				.addAction(pointer.createPointerMove(ofMillis(duration), viewport(), end.getX(), end.getY()))
				.addAction(pointer.createPointerUp(LEFT.asArg()));
		
		//perform the action
		driver.perform(Arrays.asList(swipe));
	}

}
