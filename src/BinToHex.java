public class BinToHex extends Bin {
    public String convert(String input){
        int res = Integer.parseInt(input, 2);
        String result = Integer.toHexString(res);

        return result;
    }
}
