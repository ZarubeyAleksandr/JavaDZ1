package Lesson_eleven;

public class ArrayDataException extends Exception {
    public ArrayDataException(String message, Throwable cause) {
        super(message, cause);
    public ArrayDataException(String s, NumberFormatException e) {
        super(s, e);
    }
}
