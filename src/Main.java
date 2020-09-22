import java.util.Scanner;

public class Main {
    private static void pressAnyKeyToContinue() {
        System.out.println("Press Enter key to continue...");
        try {
            System.in.read();
        }
        catch(Exception e){}
    }
    public static void main(String[] args) {
        boolean repeat = true;
        Scanner scan = new Scanner(System.in);
        ConverterBuilder conBuild = new ConverterBuilder();
        while(repeat){
            System.out.println("Decimal, Octal, Hex, Converter");
            System.out.println("1. Decimal Converter");
            System.out.println("2. Hex Converter");
            System.out.println("3. Binary Converter");
            System.out.println("4. Octal Converter");
            System.out.print("Choose a Converter: "); int choice = scan.nextInt();
            try {
                switch (choice){
                    case 1:
                        System.out.print("Input Your Decimal Number: "); String dec = scan.next();
                        System.out.println("Result: ");
                        System.out.print("Hex: ");Converter decToHex = conBuild.resultDecToHex(dec);
                        System.out.print("Octal: ");Converter decToOctal = conBuild.resultDecToOctal(dec);
                        System.out.print("Binary: ");Converter decToBin = conBuild.resultDecToBin(dec);
                        pressAnyKeyToContinue();
                        System.out.println();
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Input Your Hex Number: "); String hex = scan.next();
                        System.out.println("Result: ");
                        System.out.print("Decimal: ");Converter hexToDec = conBuild.resultHexToDec(hex);
                        System.out.print("Octal: ");Converter hexToOctal = conBuild.resultHexToOctal(hex);
                        System.out.print("Binary: ");Converter hexToBin = conBuild.resultHexToBin(hex);
                        pressAnyKeyToContinue();
                        System.out.println();
                        System.out.println();
                        break;
                    case 3:
                        System.out.print("Input Your Binary Number: "); String bin = scan.next();
                        System.out.println("Result: ");
                        System.out.print("Decimal: ");Converter binToDec = conBuild.resultBinToDec(bin);
                        System.out.print("Octal: ");Converter binToOctal = conBuild.resultBinToOctal(bin);
                        System.out.print("Hex: ");Converter binToHex = conBuild.resultBinToHex(bin);
                        pressAnyKeyToContinue();
                        System.out.println();
                        System.out.println();
                        break;
                    case 4:
                        System.out.print("Input Your Octal Number: "); String octal = scan.next();
                        System.out.println("Result: ");
                        System.out.print("Decimal: ");Converter octalToDec = conBuild.resultOctalToDec(octal);
                        System.out.print("Hex: ");Converter octalToHex = conBuild.resultOctalToHex(octal);
                        System.out.print("Binary: ");Converter octalToBin = conBuild.resultOctalToBin(octal);
                        pressAnyKeyToContinue();
                        System.out.println();
                        System.out.println();
                        break;
                    case 5:
                        repeat = false;
                        break;
                    default:
                        System.out.println("Wrong Input");
                        break;
                }
            } catch (Exception e){
                if(e.toString().contains("NumberFormatException"))
                System.out.println("Error Wrong Format\n\n");
                else
                    System.out.println(e);
                pressAnyKeyToContinue();
            }
        }
    }
}
