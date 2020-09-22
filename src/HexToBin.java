public class HexToBin extends Hex {
    public String convert(String input){
        int res = Integer.parseInt(input, 16);
        String result = Integer.toBinaryString(res);

        return result;
    }
}
