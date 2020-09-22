public class DecToHex extends Dec {
    public String convert(String input){
        int res = Integer.parseInt(input);
        String result = Integer.toHexString(res);

        return result;
    }
}
