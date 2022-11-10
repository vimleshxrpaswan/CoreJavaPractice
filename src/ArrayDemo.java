 class Student{
    int rollno;
    String name;

}

public class ArrayDemo {
    public static void main(String[] args) {
        Student s=new Student();//creating object of a student
        int nums[]={3,23,23,4};
        for (int i=0;i<4;i++)
        {
            System.out.println(nums[i]);
        }
    }
}