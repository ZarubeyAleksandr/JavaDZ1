package Lesson_twalve;

import java.io.*;
import java.util.*;

public class AnalyzerText {


    //*****  method of reading text line by line
    private static String readText(File fileBook) {
        StringBuilder textBook = new StringBuilder();
        try (BufferedReader readText = new BufferedReader(new FileReader(fileBook))) {
            String line;
            while ((line = readText.readLine()) != null) {
                textBook.append(line).append(" ");
            }
        } catch (IOException e) {
            System.out.println("Помилка читання книги " + fileBook);
        }
        return textBook.toString();
    }


    //***** method for getting words longer than 2 characters
    private static Map<String, Integer> analyzeText(String text) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        StringTokenizer stringToken = new StringTokenizer(text, " \t\n\r\f.,;:\"");
        while (stringToken.hasMoreTokens()) {
            String word = stringToken.nextToken().toLowerCase();
            if (word.length() > 2) {
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        return wordFrequencyMap;
    }

    //*****   Writing the result to a file
    private static void writeBookStatistics(String bookName, List<String> topWords, int totalUniqueWords) {
        String fileName = "src/" + bookName + "_statistic.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            topWords.forEach(writer::println);
            writer.write("\nЗагальна кількість слів: " + totalUniqueWords);
        } catch (IOException e) {
            System.out.println("Помилка запису до файлу статистики " + fileName);
        }
    }

    //***** Outputting the result to the console
    private static void printStatistics(List<String> topWords, int totalUniqueWords) {
        System.out.println("Статистика аналізу:");
        topWords.forEach(System.out::println);
        System.out.println("\nЗагальна кількість унікальних слів: " + totalUniqueWords);
    }

    //*****  Ten most popular words in book
    private static List<String> writeTopWords(Map<String, Integer> wordFrequencyMap) {
        return wordFrequencyMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .map(entry -> entry.getKey() + " -> " + entry.getValue())
                .toList();
    }

    public static void main(String[] args) {

        // ***** Interactive book title query *********
        System.out.println("Введіть назву книги для аналізу:");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        scanner.close();

        String bookPath = "src/" + bookName + ".txt";
        File fileBook = new File(bookPath);

        if (!fileBook.exists()) {
            System.out.println("Книга " + bookName + " не знайдена у директорії src/");
            return;
        }

        String text = readText(fileBook);
        Map<String, Integer> wordFrequencyMap = analyzeText(text);

        List<String> topWords = writeTopWords(wordFrequencyMap);
        int totalUniqueWords = wordFrequencyMap.size();
        writeBookStatistics(bookName, topWords, totalUniqueWords);
        printStatistics(topWords, totalUniqueWords);
    }

}
