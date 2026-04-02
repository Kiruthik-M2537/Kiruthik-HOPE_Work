package Day10;
public class ArrayCheckedException {
    public static void main(String[] args) {
        try{
        int a = 10;
        int[] b = new int[a];
        for(int i=0;i<a;i++){
            b[i+1]=b[i];
        }

        System.out.println(a);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}