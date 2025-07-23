public class patterns1 {
    public static void nForest(int n) {
       
        for(int i = 0; i<n;i++){
            
            for(int j=0;j<n;j++){
                System.out.print("*");
                if(j<n-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

