public class functionover{
    // Function over loading on the base of parameters
    // public static int sum(int a, int b, int c){
    //     return a + b + c;
    // }
    // public static int sum(int a, int b){
    //     return a + b;
    // }
    
    // Function over loading on the grounds of Data type.
    public static int sum(int a, int b){
        return a + b;
    }
    public static float sum(float a, float b){
        return a + b;
    }
    public static double sum(double a, double b){
        return a + b;
    }
    public static void main(String[] args){
        System.out.println(sum(8,9));
        System.out.println(sum(7.8f,9.5f));
        System.out.println(sum(3.14159,199.99));

    }
}