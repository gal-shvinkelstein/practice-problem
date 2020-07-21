package pragmaticdeveloper.info.java.generics;

import java.util.Collection;
import java.util.List;

public class UnboundedWildcard {

    public void add(Collection<?> order) {
        //order.add("");
    }

    public void add(List<?> order) {
        //order.add("");
    }
}
