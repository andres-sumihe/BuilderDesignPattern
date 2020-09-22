public class ConverterBuilder {
    //    DECIMAL CONVERTER
    public Converter resultDecToBin(String input){
        Converter con = new Converter();
        con.showResult(new DecToBin(), input);
        return  con;
    }

    public Converter resultDecToHex(String input){
        Converter con = new Converter();
        con.showResult(new DecToHex(), input);
        return  con;
    }

    public Converter resultDecToOctal(String input){
        Converter con = new Converter();
        con.showResult(new DecToOctal(), input);
        return  con;
    }

    //HEX CONVERTER
    public Converter resultHexToOctal(String input){
        Converter con = new Converter();
        con.showResult(new HexToOctal(), input);
        return  con;
    }

    public Converter resultHexToDec(String input){
        Converter con = new Converter();
        con.showResult(new HexToDec(), input);
        return  con;
    }

    public Converter resultHexToBin(String input){
        Converter con = new Converter();
        con.showResult(new HexToBin(), input);
        return  con;
    }

    //    OCTAL CONVERTER
    public Converter resultOctalToHex(String input){
        Converter con = new Converter();
        con.showResult(new OctalToHex(), input);
        return  con;
    }

    public Converter resultOctalToDec(String input){
        Converter con = new Converter();
        con.showResult(new OctalToDec(), input);
        return  con;
    }

    public Converter resultOctalToBin(String input){
        Converter con = new Converter();
        con.showResult(new OctalToBin(), input);
        return  con;
    }

    //    BINARY CONVERTER
    public Converter resultBinToOctal(String input){
        Converter con = new Converter();
        con.showResult(new BinToOctal(), input);
        return  con;
    }

    public Converter resultBinToDec(String input){
        Converter con = new Converter();
        con.showResult(new BinToDec(), input);
        return  con;
    }

    public Converter resultBinToHex(String input){
        Converter con = new Converter();
        con.showResult(new BinToHex(), input);
        return  con;
    }


}
