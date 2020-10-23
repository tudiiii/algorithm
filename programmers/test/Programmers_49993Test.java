import org.junit.Assert;
import org.junit.Test;

public class Programmers_49993Test {

    Programmers_49993 s = new Programmers_49993();

    @Test
    public void test(){
        //Assert.assertEquals(s.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}),2);
        //Assert.assertEquals(s.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA", "AQWER"}),3);
        Assert.assertEquals(s.solution("CBDK", new String[]{"CB", "CXYB", "BD", "AECD", "ABC", "AEX", "CDB", "CBKD", "IJCB", "LMDK"}),4);
    }

}