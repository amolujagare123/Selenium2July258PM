package TestNGDemo.paramDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {



    @Parameters({"url","username","password"})
    @Test
    public void classOneTest1(String myUrl,String myUsername ,String myPassword)
    {
        System.out.println("classOneTest1");

        System.out.println("myUrl="+myUrl);
        System.out.println("myUsername="+myUsername);
        System.out.println("myPassword="+myPassword);

    }

    @Test
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }

    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }
}
