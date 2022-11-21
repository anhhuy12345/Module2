package Quest;

import java.util.*;

public class MainPost {
    public static void main(String[] args) {
        ArrayList vals = new ArrayList();
        vals.add(3.5);
        vals.add(4.5);
        vals.add(5.5);
        vals.add( vals.set(0, 2.5) );
        System.out.println(vals);
    }
}
