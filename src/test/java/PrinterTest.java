import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void setUp(){
        printer = new Printer(25);
    }

    @Test
    public void getPages(){
        assertEquals(25, printer.getPages());
    }

//    @Test
//    public void printEnoughPages(){
//
//    }
//
//    @Test
//    public void printNotEnoughPages(){
//
//    }
}
