public class OctalToHex extends Octal {
    public String convert(String input){
        int res = getDecimal(Integer.parseInt(input));
        String result = Integer.toHexString(res);

        return result;
    }
}
