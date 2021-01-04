class Solution {
    static int stray(int[] numbers) {
         Arrays.sort(n); //Array.sort = A Java program to sort an array of integers in ascending order.
        /*
        so if teh array is [17,17,17,17,17,3,17,17] it will sorted to [3,17,17,17,17,17,17,17]
        , then if the first value of array match to the second value of array, the number that difference is oh the last value of array.
        so we return it using n[n.length -1].
        */
      //   System.out.println(n[0]);
      //   System.out.println(n[1]);
      //   if (n[0] != n[1]){
      //       return n[0];
      //   }else{
      //       return n[n.length -1];
      //   }
        
        return n[0] != n[1] ? n[0] : n[n.length -1];
    }
  }