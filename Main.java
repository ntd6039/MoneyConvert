import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double usd;
    double yuan;
    double peso;
    double pound;

    // USD to Chinese Yuan conversion
    final double YUAN_CONVERSION_RATE = 6.49;
    // USD to Mexican Peso conversion
    final double PESO_CONVERSION_RATE = 21.32;
    // USD to British Pound conversion
    final double POUND_CONVERSION_RATE = 0.78;

    // User Input here
    System.out.print("Enter amount in USD: ");
    usd = input.nextDouble();

    // Convert USD to Chinese Yuan
    yuan = usd * YUAN_CONVERSION_RATE;
    System.out.printf("%.2f USD is equivalent to %.2f Chinese Yuan.\n", usd, yuan);

    // Convert USD to Mexican Peso
    peso = usd * PESO_CONVERSION_RATE;
    System.out.printf("%.2f USD is equivalent to %.2f Mexican Peso.\n", usd, peso);

    // Convert USD to British Pound
    pound = usd * POUND_CONVERSION_RATE;
    System.out.printf("%.2f USD is equivalent to %.2f British Pound.\n", usd, pound);
  }
}
