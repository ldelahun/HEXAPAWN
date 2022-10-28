package src;
public class CoolShit {
    public boolean arrayStringChecker(String[] a, String v) {
        boolean isThere = false;
        
        for(String element : a) {
            if(v.equals(element)){
                isThere = true;
            }
        }

        return isThere;
    }
}
