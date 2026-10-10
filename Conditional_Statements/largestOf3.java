public class largestOf3{
    public static void main(String[] args){
        int A = 1, B = 13, C = 6;
        if ((A>=B) && (A>=C)){
            System.out.println("largest "+A);
            
        }
        else if ((B>=A) && (B>=C)){
            System.out.println("largest "+B);
        }
        else
        {
            System.out.println("largest "+C);
        }
    }
}
