import java.math.BigInteger;

public class BigDecimal {
    public static void main(String[] args){
    BigInteger number1 = new BigInteger("2780500000");
    BigInteger number2 = new BigInteger("1832800000");
    BigInteger number3 = new BigInteger("9142400");

    BigInteger total = (number1.add(number2)).multiply(number3);
    System.out.println(total);
    }
}
