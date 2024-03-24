import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("Dad", "Santa"));
    }

    // Array solution - Time O(n) and Space O(1)
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char chars[] = new char[26];
        boolean result = true;

        for (int i=0; i<s.length(); i++) {
            chars[s.charAt(i)-'a']++;
            chars[t.charAt(i)-'a']--;
        }
        for (int j = 0; j < chars.length; j++) {
            if (chars[j] != 0) {
                result = false;
                break;
            }
        }

        return result;
    }

    // HashMap Implementation
    // Time and Space Complexity is O(n) or O(s+t)
//    public static boolean isAnagram(String s, String t) {
//        HashMap<Character, Integer> hashA = new HashMap<>();
//        HashMap<Character, Integer> hashB = new HashMap<>();
//        boolean result = false;
//
//        if (s.length() == t.length()) {
//            result = true;
//            for (int i = 0; i < s.length(); i++) {
//                if (hashA.containsKey(s.charAt(i))) {
//                    int count = hashA.get(s.charAt(i));
//                    hashA.put(s.charAt(i), count+1);
//                }
//                else {
//                    hashA.put(s.charAt(i), 1);
//                }
//
//                if (hashB.containsKey(t.charAt(i))) {
//                    int count = hashB.get(t.charAt(i));
//                    hashB.put(t.charAt(i), count+1);
//                }
//                else {
//                    hashB.put(t.charAt(i), 1);
//                }
//            } // end for
//
//
//            // Iterating HashMap through for loop
//            for (Map.Entry<Character, Integer> hash : hashA.entrySet()) {
//                int j = hash.getValue();
//
//                int k = hashB.getOrDefault(hash.getKey(), -1);
//                if (j != k) {
//                    result = false;
//                    return false;
//                }
//            } // end for
//
//        } // end if
//
//        return result;
//    }
}
