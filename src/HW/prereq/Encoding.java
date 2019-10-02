package prereq;
import java.util.*;
class Encoding {
	public static Set<String> morseCodes(int m, int n) {
        Set<String> result = new TreeSet<>();
        if (n == 1 && m == 0) {
            result.add("-");
            return result;
        }
        if (m == 1 && n == 0) {
            result.add(".");
            return result;
        }
        Set<String> set = new TreeSet<>();
        Iterator<String> it = set.iterator();
        if (n >= 1) {
            set = morseCodes(m, n - 1);
            it = set.iterator();
            while (it.hasNext()) {
            	result.add("-" + it.next());
            }    
        }
        if (m >= 1) {
            set = morseCodes(m - 1, n);
            it = set.iterator();
            while (it.hasNext()) {
            	result.add("." + it.next());
            }
        }
        return result;
    }
}