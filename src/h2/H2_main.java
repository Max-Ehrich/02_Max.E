package h2;

public class H2_main {
    public static void main(String[] args) {
        int i=2;
        int j=3;
        int k=5;
        int min=1;
        int max=10;

        if(i<j){
            if(i<k){
                min=i;
            }
        }
        if(j<k){
            if(j<i) {
                min = j;
            }
        }
        if(k<i){
            if(k<j) {
                min = k;
            }

        }
        System.out.println("min=" +min);

        if(i>j){
            if(i>k) {
                max = i;
            }
        }
        if(j>k){
            if(j>i){
                max=j;
            }
        }
        if(k>i){
            if(k>j) {
                max = k;
            }
        }
        System.out.println("max=" +max);
    }
}
