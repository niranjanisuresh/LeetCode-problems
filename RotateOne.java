public class RotateOne {
    //this is not an efficient one we can make it better 
    static void rotateAnArray(int[] a){
        int temp = a[0];

        for(int i = 1; i<a.length; i++){
            a[i-1] = a[i];
        }

        a[a.length-1] = temp;
    }

    static void rotateONE(int a[], int k){
        k = k % a.length;

        if(k < 0){
           k= k + a.length;
        }

        for(int i = 0 ; i<k ; i++){
            rotateAnArray(a);
        }
    }
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};

        //not rotated 
        for(int i = 0 ; i<a.length ; i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println(" ");
        //so here 3 is the value of k which 
        //indicates how many times it rotates 
        rotateONE(a, 3);

        //rotated array
        for(int i = 0 ; i<a.length ; i++){
            System.out.print(a[i]+"  ");
        }
    }
}
