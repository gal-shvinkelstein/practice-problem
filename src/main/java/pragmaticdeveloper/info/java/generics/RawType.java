package pragmaticdeveloper.info.java.generics;

import java.util.List;

public class RawType {
    public void add(List order) {
        //allowed to ass item of any type
        order.add("");
    }
}
