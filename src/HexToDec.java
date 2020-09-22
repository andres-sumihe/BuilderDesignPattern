public class HexToDec extends Hex {
    public String convert(String input){
        int res = Integer.parseInt(input, 16);
        String result = Integer.toString(res);

        return result;
    }
}
