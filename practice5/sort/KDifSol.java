package practice5.sort;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class KDifSol {
    public static int findPair(int [] arr, int k){
        int count =0;
       Set<Integer> s = new HashSet<Integer>();
        for (int i=0;i<arr.length;i++){
            s.add(arr[i]);
            
        }
        Set <Integer> st= new HashSet<Integer>();
        Iterator <Integer>it = s.iterator() ;
        while(it.hasNext()){
            int n=it.next();
            int dif=0;
            if(n>k){
                dif =n-k;
                if(st.contains(dif)== true){
                    count = count+1;
                    st.add(n);
                }
                else{
                    st.add(n);
                }
            }
            if(n<k){
                dif =k-n;
                if(st.contains(dif)== true){
                    count = count+1;
                    st.add(n);
                }
                else{
                    st.add(n);
                }
            }
        }
        

        return count;
    }
    public static void main(String []args){
        int [] arr = {3,1,4,1,5};
        int k = 2;
        System.out.println(findPair(arr, k));
    }
}
