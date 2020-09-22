public class DecToBin extends Dec {
    public String convert(String input){
        int res = Integer.parseInt(input);
        String result = Integer.toBinaryString(res);

        return result;
    }
}
