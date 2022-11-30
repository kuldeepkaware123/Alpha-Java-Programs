public class subarray{
    public static void main(String[] args) {
        int index[] = {2,5,6,3,10}  ;
        sarray(index);
    }
    public static int sarray(int index[]){
       int sb = 0;
       for(int i = 0; i < index.length; i++){
        int start = i;
        for(int j = i; j < index.length; j++){
            int end = j;
            for(int k = start; k <= end; k++){
                System.out.print(index[k]+" ");
            }
            sb++;
            System.out.println();
        }
         System.out.println();
       }
        System.out.println("Total subarray is = " + sb);
        return 0;
    }
}
