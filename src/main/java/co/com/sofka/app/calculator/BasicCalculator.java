package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }
    public Long resta(Long number1, Long number2) {
        logger.info( "Restando {} + {}", number1, number2 );
        return number1 - number2;
    }
    public Long multiplicacion(Long number1, Long number2) {
        logger.info( "Multiplicando {} + {}", number1, number2 );
        return number1 * number2;
    }
    public Long division(Long number1, Long number2) {
        logger.info( "Dividiendo {} + {}", number1, number2 );
        return number1 / number2;
    }
}
