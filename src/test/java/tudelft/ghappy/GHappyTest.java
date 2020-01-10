package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void lowercaseWord(){
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void oneGword(){
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void nonGXWord(){
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxggyygx");
        Assertions.assertFalse(result);
    }

    @Test
    public void randomWords(){
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("gxggx");
        Assertions.assertTrue(result);
    }
}
