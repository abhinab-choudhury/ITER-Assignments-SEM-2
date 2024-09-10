package semester_2.dsa_assignment_3.lab_assignment;

class Box<T> {
  private T content;

  public void set(T content) {
    this.content = content;
  }

  public T get() {
    return content;
  }
}

public class A3Q4 {
  public void BoxString() {
    /*
     * Creating a boxed String object and two variables that refer to that box.
     * Change
     * the contents of one and determine the effect on the other.
     */
    
    // Create a Box for a String
    Box<String> stringBox = new Box<String>();
    stringBox.set("Hello World!");

    // Create another variable referencing the same box
    Box<String> anotherStringBox = stringBox;

    // Change the content in one box
    anotherStringBox.set("Hi Folks!!!");

    // Verify that both boxes now contain the updated content

    System.out.println("String Box Content: " + stringBox.get());
    System.out.println("Another String Box Content: " + anotherStringBox.get());
  }

  public void BoxInteger() {
    /*
     * Create a boxed Integer object and two variables that refer to that box.
     * Change the
     * contents of one and determine the effect on the other.
     */
    Box<Integer> numberbox = new Box<>();
    numberbox.set(69);

    Box<Integer> anotherbox = numberbox;
    anotherbox.set(80085);

    System.out.println("Integer Box Content : " + numberbox.get());
    System.out.println("Another Integer content : " + anotherbox.get());
  }

  public void BoxObject() {
    /*
     * Creating a boxed Object object and two variables that refer to that box.
     * Determine what
     * happens if you put a string in the box. Determine what happens if you put an
     * integer in
     * the box.
     */
    Box<Object> anytype = new Box<>();
    anytype.set("Abhinab Choudhury");

    Object retrievedString = anytype.get();
    if (retrievedString instanceof String) {
      String retrievedStringCasted = (String) retrievedString;
      System.out.println("Retrieved String after Casting : " + retrievedStringCasted);
    }

    anytype.set(96);
    Object retrievedInteger = anytype.get();
    if (retrievedInteger instanceof Integer) {
      Integer retrievedIntegerCasted = (Integer) retrievedInteger;
      System.out.println("Retrived Integer after Casting : " + retrievedIntegerCasted);
    }
  }

  public static void main(String[] args) {
    A3Q4 obj = new A3Q4();
    obj.BoxString();
    obj.BoxInteger();
    obj.BoxObject();
  }
}
