class Student1 {
    int rollno;
    String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Getters and Setters

    public class EncapsulationDemo {
        public static void main(String[] args) {
            Student1 s1 = new Student1();
            s1.setRollno(2);
            s1.setName("Vimlesh");

            System.out.println(s1.getRollno());
            System.out.println(s1.getName());

        }
    }
}

