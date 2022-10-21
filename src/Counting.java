public class Counting {
    public void tuda(String a){
    int Decimal = Integer.parseInt(a, 8);
    System.out.println("Восьмиричная: "+ a + ", двоичная: "+ Integer.toBinaryString(Decimal) +", десятичная: "+ Decimal +", шеснадцатиричная: " + Integer.toHexString(Decimal));
}
    public void suda(String a){
        int Decimal = Integer.parseInt(a, 16);
        System.out.println("Шеснадцатиричная: "+ a + ", двоичная: "+ Integer.toBinaryString(Decimal) +", восьмиричная: "+ Integer.toOctalString(Decimal) +", десятичная: " + Decimal);
    }
}
