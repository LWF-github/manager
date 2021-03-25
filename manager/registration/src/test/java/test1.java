import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class test1 {
    @Autowired
    @Value("${eurake.scope}")
    private static String scope;

    public static void main(String[] args) {

        System.out.printf(scope);
        //String arr[] = scope.split(",");
       // for (int i = 0; i < arr.length; i++) {
          //  System.out.printf(arr[i].toString());
        //}
    }
}
