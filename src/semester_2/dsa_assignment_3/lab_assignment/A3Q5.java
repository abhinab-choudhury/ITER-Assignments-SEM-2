package semester_2.dsa_assignment_3.lab_assignment;

public class A3Q5 {

  public static <E> void printArray(E[] inputArray) {
    for (int i = 0; i < inputArray.length; i++) {
      System.out.print(inputArray[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Integer IntegerArray[] = { 1, 2, 3, 4, 5 };
    Double DoubleArray[] = { 2.3, 5.2, 9.2, 5.9, 9.4 };
    String StringArray[] = { "Abhinab", "Rahul", "Ramesh", "Gakul", "Gita", "Garima" };

    System.out.print("Printing Integer Array : ");
    printArray(IntegerArray);
    System.out.print("Printing Double Array : ");
    printArray(DoubleArray);
    System.out.print("Printing String Array : ");
    printArray(StringArray);
  }
}
