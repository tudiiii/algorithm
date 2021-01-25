import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateImageTest {

    RotateImage s = new RotateImage();

    @Test
    public void test(){
        Assert.assertArrayEquals(s.rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}}), new int[][]{{7,4,1},{8,5,2},{9,6,3}});
    }

}