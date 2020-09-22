public abstract class Hex implements Convert{
    @Override
    public abstract String convert(String input);
    public static int getDecimal(int hex){
        int decimal = 0;
        int n = 0;
        while(true){
            if(hex == 0){
                break;
            } else {
                int temp = hex%10;
                decimal += temp*Math.pow(16, n);
                hex = hex/10;
                n++;
            }
        }
        return decimal;
    }
}
