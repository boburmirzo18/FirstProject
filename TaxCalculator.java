import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculator {

   public static BigDecimal nettoprice;
     public static BigDecimal vatprice;

    public static BigDecimal entireValue;

    public static BigDecimal productWithoutVat;


    public static void main (String[] args) {




        nettoprice = new BigDecimal("9.99");

        vatprice = new BigDecimal("0.23");

        long amountofProducts = 10000;
        // product with Vat
        entireValue = nettoprice.add(nettoprice.multiply(vatprice));
        // product without vat for 10000
        productWithoutVat = entireValue.multiply(new BigDecimal(amountofProducts));


        //Roundind mode half_up . it will round the nearest value. for minimizing bias.
        //Similarly, if you round -2.5, it rounds to -3 because it also rounds away from zero.


        System.out.println("EntreValue(withVat) :" + entireValue.setScale(2, RoundingMode.HALF_UP));


        /* 2: This is the number of decimal places to which the BigDecimal value is to be rounded.
        In this case, you're specifying that you want two decimal places, which is often appropriate for currency values.*/


        System.out.println("ProductWithoutVat):" + productWithoutVat.setScale(2, RoundingMode.HALF_UP));


        /*By using setScale(2, RoundingMode.HALF_UP), you ensure that the results are rounded to two decimal
         places with a consistent and fair rounding method. This helps maintain precision and consistency
         when working with monetary values.*/


    }
}









