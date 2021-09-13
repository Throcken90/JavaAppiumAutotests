import org.junit.Test;

public class MainClassTest {
    MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber() {
        int res;
        res = mainClass.getLocalNumber();
        if (res == 14) {
            System.out.println("Result is OK");
            return;
        } else {
            System.out.println("Wrong result");
            return;
        }
    }

    @Test
    public void testGetClassNumber() {
        int res;
        res = mainClass.getClassNumber();
        if (res > 45) {
            System.out.println("Result is OK");
            return;
        } else {
            System.out.println("Result is wrong: the number is not greater than 45");
            return;
        }
    }

    @Test
    public void testGetClassString()

    {
        String output;
        output = mainClass.getClassString();
        if (output.matches("hello")||output.matches("Hello"))
        {
                System.out.println("Result is OK");
            } else
        System.out.println("The string does not match regex \"Hello\" or \"hello\"");

            }
        }


