import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


public class FunctionsTest {
    private Functions functions = new Functions();

    @Test
    public void linearFunctionTest(){
        int result = functions.linearFunction(2,3,2);
        assertEquals(7,result);

    }

    @Test
    public void quadraticFunctionTest(){
        double result = functions.quadraticFunction(4,-6,2,1);
        Assertions.assertEquals(0,result);

    }
    @Test
    public void getRootsHasRootsTest(){
        double[] result = functions.getRoots(4,-6,2);
        double[] compare = new double[2];
        compare[0]=1.0;
        compare[1]=0.5;
        Assertions.assertArrayEquals(compare,result);
    }

    @Test
    public void getRootsHasNotRootsTest(){
        double[] result = functions.getRoots(1,3,3);
        double[] compare = new double[2];
        compare[0]=-1.0;
        compare[1]=-1.0;
        Assertions.assertArrayEquals(compare,result);
    }

    @Test
    public void absoluteValueWhenXIsNonNegativeTest(){
        double result = functions.AbsoluteValue(2.0,2.0);
        Assertions.assertEquals(4,result);
    }

    @Test
    public void absoluteValueWhenXIsNegativeTest(){
        double result = functions.AbsoluteValue(2.0,-2.0);
        Assertions.assertEquals(4,result);
    }



}
