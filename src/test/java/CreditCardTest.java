import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pl.pdudek.creditcard.CreditCard;

import java.math.BigDecimal;


public class CreditCardTest {

    @Test
    void itAllowsToAssignLimitToCreditCard(){
        //A Arrange // Given
        CreditCard creditCard = new CreditCard();
        //A Act // When
        creditCard.assignLimit(BigDecimal.valueOf(1000));

        //A Assert // Then / Expected
        assertEquals(BigDecimal.valueOf(1000), creditCard.getBalance());
    }
}
