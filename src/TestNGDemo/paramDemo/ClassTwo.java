package TestNGDemo.paramDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {

    @Parameters({"url","username","password"})
    @Test
    public void classTwoTest1(String myUrl,String myUsername ,String myPassword)
    {
        System.out.println("classTwoTest1");

        System.out.println("myUrl="+myUrl);
        System.out.println("myUsername="+myUsername);
        System.out.println("myPassword="+myPassword);

    }


    @Test
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }

    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }
}
