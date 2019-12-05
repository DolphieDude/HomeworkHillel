package H7.com.cherevatyi.task1;

import java.util.*;

public class Main {

    public static void main(String[] args) throws ConcurrentModificationException {
	    Map<String, Date> birthMap = new HashMap<>();
	    Date date;
        for (int i = 0; i < 12; i++) {
            date = new Date();
            date.setMonth(i);
            birthMap.put((char)('a' + i) + "", date);
        }
        Iterator it = birthMap.entrySet().iterator();
        Map.Entry<String, Date> entry;
        while (it.hasNext()) {
            entry = (Map.Entry<String, Date>)it.next();
            if (entry.getValue().getMonth() >= 5 && entry.getValue().getMonth() <= 7) it.remove();
            else System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
