package generics;

public class Pair<T,S>{
    private T first;
    private S second;

    public Pair(){}

    public Pair(T first, T second){
      this.first = first;
      this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public void setFirst(T first){
        this.first=first;
    }

    public T getSecond(){
      return second;
    }

    public void setSecond(T second){
      this.second= second;
    }
}
package generics;

public class PairUse {

    public static void main(String[] args){

          Pair<String, Integer> pSI= new Pair<String, Integer>("ab",10);

          Pair p= new Pair(10,20);
//        System.out.println(p.getFirst()+ " " +p.getSecond());

//        PairString pS= new PairString("aa", "bb");
//        PairDouble pS= new PairDouble(3.1, 7.2);

          Pair<String> pS= new Pair<String>("aa", "bb");
          System.out.println(pS.getFirst()+" "+ ps.getSecond());
          pS.setFirst("xyz");

          Pair<Integer> pI= new Pair<Integer>(10, 20);
          System.out.println(pI.getFirst()+ " " +pI.getSecond());

          Pair<Double> pD= new Pair<Double>(10.1, 20.6);
          System.out.println(pD.getFirst()+ " " +pD.getSecond());


    }
}
package generics;

public class Print{

    public static<T> void printArray(T arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
      Integer arr[]= new Integer[5];
      for(int i=0;i<arr.length;i++){
        arr[i]=i+1;
      }
      printArray(arr);

      String arrS[]= new String[5];
      for(int i=0;i<arrS.length;i++){
        arrS[i]="abc";
      }

      printArray(arrS);
    }
}
