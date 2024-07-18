package src.checker;

public class NotEmptyStringChecker implements Checker{
    @Override
    public boolean check(String text) {
        return text != null && !text.isEmpty() && !text.trim().isEmpty();
    }
}
