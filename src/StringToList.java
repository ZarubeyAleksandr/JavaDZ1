import java.util.*;


class WordOccurrence {
    String name;
    int occurrence;

    WordOccurrence(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }
}

public class StringToList {

    public static int countOccurrence(List<String> stringList, String target) {
        int count = 0;
        for (String str : stringList) {
            if (str.equals(target)) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> toList(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int value : array) {
            result.add(value);
        }
        return result;
    }

    public static List<Integer> findUnique(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (Integer number : list) {
            if (!set.contains(number)) {
                result.add(number);
                set.add(number);
            }
        }
        return result;
    }

    public static void calcOccurrence(List<String> list) {
        Map<String, Integer> occurrenceMap = new HashMap<>();
        for (String word : list) {
            occurrenceMap.put(word, occurrenceMap.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static List<WordOccurrence> findOccurrence(List<String> list) {
        Map<String, Integer> occurrenceMap = new HashMap<>();
        for (String word : list) {
            occurrenceMap.put(word, occurrenceMap.getOrDefault(word, 0) + 1);
        }
        List<WordOccurrence> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet()) {
            result.add(new WordOccurrence(entry.getKey(), entry.getValue()));
        }
        return result;
    }


    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "apple", "banana"));
        String targetString = "apple";
        System.out.println("Count of '" + targetString + "': " + countOccurrence(stringList, targetString));

        int[] array = {1, 2, 3};
        System.out.println("List from array: " + toList(array));

        List<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5));
        System.out.println("Unique elements: " + findUnique(numberList));

        List<String> stringCalcOccur = new ArrayList<>(Arrays.asList("bird", "fox", "cat", "bird", "fox", "dog", "bird", "fox", "dog", "cat", "bird"));
        calcOccurrence(stringCalcOccur);


        List<String> stringWordOccur = new ArrayList<>(Arrays.asList("bird", "fox", "cat", "bird", "fox", "dog", "bird", "fox", "dog", "cat", "bird"));
        List<WordOccurrence> occurrences = findOccurrence(stringWordOccur);
        for (WordOccurrence occurrence : occurrences) {
            System.out.println("{name: \"" + occurrence.name + "\", occurrence: " + occurrence.occurrence + "}");
        }

    }



}
