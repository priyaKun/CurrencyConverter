import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to Currency Converter. Convert and know the value!");
            System.out.println("1. USD to Rupee");
            System.out.println("2. Rupee to USD");
            System.out.println("3. Euro to Rupee");
            System.out.println("4. Rupee to Euro");
            System.out.println("5. USD to Korean Won");
            System.out.println("6. Korean Won to USD");
            System.out.println("7. USD to Japanese Yen");
            System.out.println("8. Japanese Yen to USD");
            System.out.println("9. USD to Chinese Yuan");
            System.out.println("10. Chinese Yuan to USD");
            System.out.println("11. Exit");
            System.out.print("Enter your choice (1-11): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount in USD: ");
                    double USD = scanner.nextDouble();
                    double RupeeFromUSD = usdToRupee(USD);
                    System.out.println("Converted amount in Rupee: " + RupeeFromUSD);
                    break;
                case 2:
                    System.out.print("Enter the amount in Rupee: ");
                    double Rupee = scanner.nextDouble();
                    double USDFromRupee = rupeeToUsd(Rupee);
                    System.out.println("Converted amount in USD: " + USDFromRupee);
                    break;
                case 3:
                    System.out.print("Enter the amount in Euro: ");
                    double Euro = scanner.nextDouble();
                    double RupeeFromEuro = euroToRupee(Euro);
                    System.out.println("Converted amount in Rupee: " + RupeeFromEuro);
                    break;
                case 4:
                    System.out.print("Enter the amount in Rupee: ");
                    double RupeeFromEuroInput = scanner.nextDouble();
                    double EuroFromRupee = rupeeToEuro(RupeeFromEuroInput);
                    System.out.println("Converted amount in Euro: " + EuroFromRupee);
                    break;
                case 5:
                    System.out.print("Enter the amount in USD: ");
                    double USDToKRW = scanner.nextDouble();
                    double KRW = usdToKrw(USDToKRW);
                    System.out.println("Converted amount in Korean Won: " + KRW);
                    break;
                case 6:
                    System.out.print("Enter the amount in Korean Won: ");
                    double KRWToUSD = scanner.nextDouble();
                    double USDFromKRW = krwToUsd(KRWToUSD);
                    System.out.println("Converted amount in USD: " + USDFromKRW);
                    break;
                case 7:
                    System.out.print("Enter the amount in USD: ");
                    double USDToJPY = scanner.nextDouble();
                    double JPY = usdToJpy(USDToJPY);
                    System.out.println("Converted amount in Japanese Yen: " + JPY);
                    break;
                case 8:
                    System.out.print("Enter the amount in Japanese Yen: ");
                    double JPYToUSD = scanner.nextDouble();
                    double USDFromJPY = jpyToUsd(JPYToUSD);
                    System.out.println("Converted amount in USD: " + USDFromJPY);
                    break;
                case 9:
                    System.out.print("Enter the amount in USD: ");
                    double USDToCNY = scanner.nextDouble();
                    double CNY = usdToCny(USDToCNY);
                    System.out.println("Converted amount in Chinese Yuan: " + CNY);
                    break;
                case 10:
                    System.out.print("Enter the amount in Chinese Yuan: ");
                    double CNYToUSD = scanner.nextDouble();
                    double USDFromCNY = cnyToUsd(CNYToUSD);
                    System.out.println("Converted amount in USD: " + USDFromCNY);
                    break;
                case 11:
                    exit = true;
                    System.out.println("Thank you for using the Currency Converter. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }

            if (!exit) {
                System.out.println();
            }
        }

        scanner.close();
    }

    public static double usdToRupee(double USD) {
        return USD * 83.47;  // Recent update: 01/05/24
    }

    public static double rupeeToUsd(double Rupee) {
        return Rupee * 0.0119804;   // Recent update: 01/05/2024
    }

    public static double euroToRupee(double Euro) {
        return Euro * 89.10;   // Recent update: 01/05/24
    }

    public static double rupeeToEuro(double Rupee) {
        return Rupee * 0.0113;   // Recent update: 01/05/24
    }

    public static double usdToKrw(double USD) {
        return USD * 1291.45;   // Recent update: 01/05/24
    }

    public static double krwToUsd(double KRW) {
        return KRW * 0.000774;  // Recent update: 01/05/24
    }

    public static double usdToJpy(double USD) {
        return USD * 141.15;    // Recent update: 01/05/24
    }

    public static double jpyToUsd(double JPY) {
        return JPY * 0.00709;   // Recent update: 01/05/24
    }

    public static double usdToCny(double USD) {
        return USD * 7.18;      // Recent update: 01/05/24
    }

    public static double cnyToUsd(double CNY) {
        return CNY * 0.139;     // Recent update: 01/05/24
    }
}
