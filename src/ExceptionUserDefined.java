import com.vimlesh.VimleshException;

public class ExceptionUserDefined {
    public static void main(String[] args) {
        int i,j;
        i=4;
        j=2;
        try {
            int k=i/j;
            if (k==1)
                throw new  VimleshException("we can pass any message here");
            if (k==2)
                throw new CustomException("second message");
            System.out.println(k);

        }
        catch (CustomException e){
            System.out.println("I am custom exception"+ e.getMessage());

        }
        catch (VimleshException e){
            System.out.println("Error1"+e.getMessage());
        }
        catch (Exception e){
            System.out.println("Error");
        }


    }
}
