public class BinToOctal extends Bin {
    public String convert(String input){
        int res = Integer.parseInt(input, 2);
        String result = Integer.toOctalString(res);

        return result;
    }
}
