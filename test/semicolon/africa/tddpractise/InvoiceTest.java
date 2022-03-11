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
    void testGetAmount(){
        //given
        Invoice invoice = new Invoice("76","food",7,7.98);
        //when
        double amount = invoice.getInvoiceAmount(invoice.getQuantity(), invoice.getPrice());
//         double invoiceAmount = invoice.getInvoiceAmount(-3,400);
        //assert
        assertEquals(55.86, amount);

    }



    @Test
    void testQuantityAndPriceNotNegative(){
        //given
        Invoice invoice = new Invoice("76","food",7,7.98);
        //when
        invoice.setQuantity(-3);
        invoice.setPrice(-100);
        double amount = invoice.getInvoiceAmount(invoice.getQuantity(), invoice.getPrice());

//         double invoiceAmount = invoice.getInvoiceAmount(-3,400);
         //assert
        assertEquals(0.0, invoice.getPrice());
        assertEquals(0, invoice.getQuantity());
        assertEquals(0.0, amount);

    }


}