package utils;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double DollarToReal(double amount, double precoDolar) {

        return amount * precoDolar * (1.0 + IOF);
    }
}
