<<<<<<< HEAD
public class RotateAnArray {
    static void rotate(int[] a){

        int temp = a[0];

        for(int i = 1 ;i < a.length ;i++){
            a[i-1] = a[i];
        }
        a[a.length-1] = temp;
    }
    public static void main(String[] args){

        int[] a={1,2,3,4,5};

        for(int i = 0; i<a.length ;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();
        rotate(a);

        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}

=======
public class RotateAnArray {
    static void rotate(int[] a){

        int temp = a[0];

        for(int i = 1 ;i < a.length ;i++){
            a[i-1] = a[i];
        }
        a[a.length-1] = temp;
    }
    public static void main(String[] args){

        int[] a={1,2,3,4,5};

        for(int i = 0; i<a.length ;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();
        rotate(a);

        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}

>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
