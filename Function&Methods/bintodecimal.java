public class bintodecimal {
    public static void bintodec(int binNum){
        int pow = 0;
        int decnum = 0;

        while(binNum>0){
            int lastDigit = binNum%10;
            decnum = decnum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
            
        }
        System.out.println("decimal of " + binNum+" = "+decnum);
    }
    public static void main(String[] args) {
        bintodec(110);
    }
}