import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestTenth {
    @Test
    public void testDivision(){
        Tenth math = Tenth.getInstance();
        Assertions.assertNotNull(math);
        Assertions.assertEquals(math.division(4, 2), 2);
        Assertions.assertEquals(math.division(5, 3), 1);

        try{
            math.division(5, 0);
            Assertions.fail();
        }catch (Exception e){
            Assertions.assertTrue(e instanceof ArithmeticException);
        }
    }

}
