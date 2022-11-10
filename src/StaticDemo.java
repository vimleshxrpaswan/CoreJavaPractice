class Emp{
    int eid;
    int salary;
    String ceo;
    public void show(){
        System.out.println(eid+" : " + salary + " : "+ceo);
    }
}


public class StaticDemo {
    public static void main(String[] args) {
        Emp navin = new Emp();

        navin.eid=9;
        navin.salary=5000;
        navin.ceo="Mahesh";
        Emp vimlesh= new Emp();
        vimlesh.eid=10;
        vimlesh.salary=90000;
        vimlesh.ceo="Mahesh";

        vimlesh.show();
        navin.show();




    }

}
