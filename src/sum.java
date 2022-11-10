public class sum {
    int a;
    int b;
    int add;
    public void perform(){
        add = a+b;
    }
    public sum(){
        this.a=a;
    }
    public class ObjectDemo{
        public static void main(String[] args) {
            sum obj=new sum();
            obj.a=12;
            obj.b=13;


            obj.perform();
            System.out.println(obj.add);
        }
    }
}
