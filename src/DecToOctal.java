public class DecToOctal extends Dec {
    public String convert(String input){
        int res = Integer.parseInt(input);
        String result = Integer.toOctalString(res);

        return result;
    }
}
