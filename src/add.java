public class add {
    int a;
    int b;
    int result;
    public void perform()
    {
        result=a+b;
    }
    public class demo{
        public static void main(String[] args) {
            add obj=new add();
            obj.a=13;
            obj.b=14;
            obj.perform();
            System.out.println(obj.result);


        }

    }
}
