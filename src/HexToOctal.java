public class HexToOctal extends Hex {
    public String convert(String input){
        int res = Integer.parseInt(input, 16);
        String result = Integer.toOctalString(res);

        return result;
    }
}
