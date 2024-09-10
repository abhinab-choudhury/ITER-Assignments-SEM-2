package semester_2.dsa_assignment_3.lab_assignment;

public class A3Q6 {

  public static <T> int count(T[] array, T item) {
    int count = 0;
    
    if (!item.getClass().equals(array.getClass().getComponentType())) {
      throw new IllegalArgumentException("Item type and array element type mismatch");
    }

    for (int i = 0; i < array.length; i++) {
      if (array[i] == item) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Integer arr[] = { 2, 3, 4, 5, 1, 9, 4, 5, 26, 94, 23 };
    System.out.println("Count of 3 in {2,35,26,94,23} : " + count(arr, 3));
  }
}
