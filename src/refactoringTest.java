import org.junit.Assert;
import org.junit.Test;

/**
 * Created by praewpatjiradecha on 10/23/2017 AD.
 */
public class refactoringTest {
    private refactoring refactoring = new refactoring();

    @Test
    public void getparameter()
    {
        boolean result = refactoring.getploy(1);
        Assert.assertEquals(true,result);
    }

    @Test
    public void changeBidirection(){

    }
}
