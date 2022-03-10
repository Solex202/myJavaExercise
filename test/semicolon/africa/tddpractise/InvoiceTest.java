package semicolon.africa.tddpractise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void testThatInvoiceHasInformation(){
        //given
        Invoice invoice = new Invoice("76","food",7,7.98);
        //assert
        assertNotNull(invoice, invoice.toString());
    }

    @Test
    void testThatYouCanSetAndGetPartNumber(){
        //given
        Invoice invoice = new Invoice("76","food",7,7.98);
        //when
        invoice.setPartNumber("77");
        //assert
        assertEquals("77", invoice.getPartNumber());
    }


    @Test
    void testThatYouCanSetAndGetPartDescription(){
    //given
        Invoice invoice = new Invoice("76","food",7,7.98);
        //when
        invoice.setPartDescription("food");
        //assert
        assertEquals("food", invoice.getPartDescription());
    }

    @Test
    void testThatYouCanSetAndGetQuantity(){
        //given
        Invoice invoice = new Invoice("76","food",7,7.98);
        //when
        invoice.setQuantity(15);
        //assert
        assertEquals(15,invoice.getQuantity());
    }

    @Test
    void testThatYouCanSetAndGetPrice(){
        //given
        Invoice invoice = new Invoice("76","food",7,7.98);
        //when
        invoice.setPrice(45.87);
        //assert
        assertEquals(45.87,invoice.getPrice());
    }

    @Test
    void testQuantityAndPriceNotNegative(){
        //given
        Invoice invoice = new Invoice("76","food",7,7.98);
        //when
         double invoiceAmount = invoice.getInvoiceAmount(-3,400);
         //assert
        assertEquals(0.0,invoiceAmount);

    }


}