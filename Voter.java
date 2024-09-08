public class Voter {

    //Voter attributes
    public int voterId;
    public String name;
    public int age;

    public Voter(int voterId, String name, int age) throws Exception {

        //checking if the age is <18
        if (age < 18) {
            throw new Exception("Invalid age for voter.");
        } else {
            this.voterId = voterId;
            this.name = name;
            this.age = age;
            System.out.println("Voter detail is added.");
        }
    }

    public static void main(String[] args) {

        //try catch block to catch the exception
        try {
            Voter v2 = new Voter(105, "Peter", 18);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}



