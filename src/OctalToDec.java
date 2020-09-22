public class OctalToDec extends Octal {
    public String convert(String input){
        int res = getDecimal(Integer.parseInt(input));
        String result = Integer.toString(res);

        return result;
    }
}
