import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UmayPlustTest {

    @BeforeClass
    public static void beforeAll(){
        System.out.println("beforeAll");
    }

    @Before
    public void beforeEach(){
        System.out.println("beforeEach");
    }

    @Test
    public void login_correctCredentials_success(){
        System.out.println("loginSuccess");
    }

    @Test
    public void applyCard_completeForm_success(){
        System.out.println("applyCardSuccess");
    }

    @Test
    public void applyCard_incompleteForm_validationMessage(){
        System.out.println("applyCardIncompleteForm");
    }
}
