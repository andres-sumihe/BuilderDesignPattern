public class BinToDec extends Bin {
    public String convert(String input){
        int res = Integer.parseInt(input, 2);
        String result = Integer.toString(res);

        return result;
    }
}
