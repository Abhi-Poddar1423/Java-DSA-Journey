package CO5_Methods;

public class C08_PassByValue {
    /*
      Here, a copy of the variable is passed to the method.

      Any changes made inside the method only affect
      the copied value, not the original variable.
  */
    public static void changeValue(int number) {
        number = 100;
        System.out.println("Inside Method: " + number);
    }

    public static void main(String[] args) {

        int number = 10;

        System.out.println("Before Method Call: " + number);

        changeValue(number);

        System.out.println("After Method Call: " + number);
    }
}
/*
    One thing I learned here is that Java is always
    pass by value.

    For primitive data types, a copy of the actual value
    is passed to the method.

    For objects, a copy of the reference is passed.
    That's why we can change the object's data inside
    the method, but if we assign the reference to a new
    object, the original object remains unchanged.

    So Java does not support true pass by reference.
*/

