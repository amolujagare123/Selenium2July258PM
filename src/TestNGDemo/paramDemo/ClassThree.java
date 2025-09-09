package TestNGDemo.paramDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {

    @Parameters({"url","username","password"})
    @Test
    public void classThreeTest1(String myUrl,String myUsername ,String myPassword)
    {
        System.out.println("classThreeTest1");

        System.out.println("myUrl="+myUrl);
        System.out.println("myUsername="+myUsername);
        System.out.println("myPassword="+myPassword);

    }


    @Test
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }

    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }
}
