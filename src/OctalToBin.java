public class OctalToBin extends Octal {
    public String convert(String input){

        int res = getDecimal(Integer.parseInt(input));
        String result = Integer.toBinaryString(res);

        return result;
    }
}
