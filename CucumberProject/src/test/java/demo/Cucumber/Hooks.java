package demo.Cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

@Before
public void beforeScenerio()
{
	System.out.println("This will run before scenerio");
}
@After
public void afterScenerio()
{
	System.out.println("This will run after scenerio");
}

}
