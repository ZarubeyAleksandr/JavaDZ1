public class Anagram {
    static boolean isAnagram(String s, String t) {
        if (s == null || t == null){
            return false;
        }
        if (s.length() != t.length()){
            return false;
        }

        //********** One method with func Java ***********
        /*char[] ArrayS = s.toCharArray();
        char[] ArrayT = t.toCharArray();
        Arrays.sort(ArrayS);
        Arrays.sort(ArrayT);
        return Arrays.equals(ArrayS, ArrayT);*/

        //********* Second method with Hash Table ************
        int[] charCount = new int[26];
        for(int i = 0; i < s.length(); i++){
            charCount[s.charAt(i)-'a']++; //'а' потрібен, щоб отримати числовий код символу та потім вже зрівнювати.
            charCount[t.charAt(i)-'a']--;
        }

        for (int i : charCount){
            if (i != 0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(isAnagram(s1, t1));

        String s2 = "rat";
        String t2 = "car";
        System.out.println(isAnagram(s2, t2));

    }
}
