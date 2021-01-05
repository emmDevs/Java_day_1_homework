import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void setUp(){
        printer = new Printer(25, 30);
    }

    @Test
    public void getPages(){
        assertEquals(25, printer.getPages());
    }

    @Test
    public void printEnoughPages(){
        printer.print(5, 2);
        assertEquals(15, printer.getPages());

    }

    @Test
    public void printNotEnoughPages(){
        printer.print(5, 6);
        assertEquals(25, printer.getPages());
    }

    @Test
    public void getToner(){
        assertEquals(30, printer.getToner());
    }
}
