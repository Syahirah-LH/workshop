package Exercise;

public class MyAge {
    
    public static void main(String[] args) {
           int age = -23;    // assumed number is not negative
      // This assert also serve as documentation
      assert (age >= 0) : "number is negative: " + age;
      // do something
      System.out.println("Your age is " + age);
    }
}
