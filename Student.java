public class Student {

    //Students attributes
    public int rollNo;
    public String name;
    public int age;
    public String course;

    //using throw and throws
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {

        if (name.matches("[a-zA-Z]+")) {
            this.name = name;
        } else {
            throw new NameNotValidException("Name contains number or special characters.");
        }

        if (age >= 15 && age <= 21) {
            this.age = age;
        } else {
            throw new AgeNotWithinRangeException("Age not in the appropriate range.");
        }

        this.rollNo = rollNo;
        this.course = course;
    }

    public static void main(String[] args) {

        try {
            Student s1 = new Student(121, "Shankar", 14, "Java");
        }catch (AgeNotWithinRangeException | NameNotValidException e){
            System.out.println(e);
        }

        try {
            Student s1 = new Student(121, "Sha % nkar", 14, "Java");
        }catch (AgeNotWithinRangeException | NameNotValidException e){
            System.out.println(e);
        }

    }
}

//Exception class for Age
class AgeNotWithinRangeException extends Exception {

    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

//Exception class for Name
class NameNotValidException extends Exception {

    public NameNotValidException(String message) {
        super(message);
    }
}