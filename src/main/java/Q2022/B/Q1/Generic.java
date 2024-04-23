package Q2022.B.Q1;

import java.util.ArrayList;
import java.util.List;

// section B Q1 c
public class Generic {


    public static void main(String[] args) {

        // before
      /*
        List stringList = new ArrayList(); --> accept any type of object
        stringList.add( new String("test") );
        String myVal = (String) stringList.iterator().next();
        */

        // after
        List<String> stringList = new ArrayList();
        stringList.add(new String("test"));
        String myVal = stringList.iterator().next();


    }

}
