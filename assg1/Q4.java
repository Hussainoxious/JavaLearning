'''
a class with the name Person. The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int.
Write the following methods (instance methods):
  1.  Create Getters and Setters for firstName, lastName and age
  2.  Create a Default Constructor.
  3.  Add a Method named isTeen (without any parameters), it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
  4. Add a Method named getFullName (without any parameters), it needs to return the full name of the person. (eg return firstName + " " + lastName)
'''

package assg1;

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTeen() {
        return (age > 12 && age < 20);
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("");
        person1.setLastName("");
        person1.setAge(10);
        System.out.println("fullName= " + person1.getFullName());
        System.out.println("teen= " + person1.isTeen());

        Person person2 = new Person();
        person2.setFirstName("John");
        person2.setLastName("");
        person2.setAge(18);
        System.out.println("fullName= " + person2.getFullName());
        System.out.println("teen= " + person2.isTeen());
        person2.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person2.getFullName());
    }
}