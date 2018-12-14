public class ArrayConvert {
    public static void main (String[] args){

        boolean isOK = true;
        long slowoNr = 0;
        switch (args[0]){
            case "jeden":
                slowoNr = 1;
                break;
            case "dwa":
                slowoNr = 2;
                break;
            case "trzy":
                slowoNr = 3;
                break;
            case "cztery":
                slowoNr = 4;
                break;
            case "pięć":
                slowoNr = 5;
                break;
            case "sześć":
                slowoNr = 6;
                break;
            case "siedem":
                slowoNr = 7;
                break;
            case "osiem":
                slowoNr = 8;
                break;
            case "dziewięć":
                slowoNr = 9;
                break;
            case "dziesięć":
                slowoNr = 10;
                break;
            default:
                isOK = false;
                break;
        }
        if (isOK) {
            System.out.println(args[0] + " to " + slowoNr);
        }
        else {
            System.out.println("Niepoprawna wartość");
        }

    }
}
