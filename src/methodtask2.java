public class methodtask2 {


    public static void main(String[] args) {
maxvaluefinder();

    }


//   --------->  function <-----------------------
 static void  maxvaluefinder(){
int[] num={1,5,3,9,7};
int i,max=0;
for (i=0;i< num.length;i++){
    if (num[i] > max) {
        max = num[i];
    }
}
     System.out.println("Max Value: "+max);
 }


}
