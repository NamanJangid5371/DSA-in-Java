public class hollow_rectangle {
    public static void hollow(int row,int col){
        //outer loop
        for (int i = 1; i<=row ; i++ ){
            //inner columns
            for (int j=1; j<=col;j++){
                //cell (i,j)
                if(i == 1|| i== row|| j==1|| j==col){
                    //boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow(5,8);
    }    
}