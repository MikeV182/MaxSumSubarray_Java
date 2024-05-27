public class Max {

  public static int maxValue(int[] array) {
    int maxElem = array[0];
    for (int i = 0; i < array.length; i++) {
      maxElem = array[i] > maxElem ? array[i] : maxElem;
    }
    return maxElem;
  }

  public static int KadaneAlgo(int[] array) {
    int size = array.length, start = 0, end = 0;
    int maxSoFar = array[0], maxEndingHere = array[0];
    for (int i = 1; i < size; i++) {
      maxEndingHere += array[i];
      if (array[i] > maxEndingHere) {
        maxEndingHere = array[i];
        if (maxSoFar < maxEndingHere) {
          start = i;
        }
      }
      if (maxSoFar < maxEndingHere) {
        maxSoFar = maxEndingHere;
        end = i;
      } 
    }
    return maxSoFar;
  }

  public static int sequence(int[] arr) {
    if (arr.length == 0 || maxValue(arr) < 0) {
      return 0;
    }

    else return KadaneAlgo(arr);
  }

  public static void main(String[] args) {
    System.out.println(sequence(new int[]{}));
  }
}