package uniqueChar;


public class UniqueChar {

    public boolean isUniqueChar(String str) {
        boolean containsUnique = false;
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            containsUnique = str.indexOf(c) == str.lastIndexOf(c);
        }
        return containsUnique;

    }
}
