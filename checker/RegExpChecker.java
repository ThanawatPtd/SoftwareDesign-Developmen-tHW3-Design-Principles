package src.checker;

public class RegExpChecker implements Checker {

    private String pattern;

    public RegExpChecker(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean check(String text) {
        return false;
    }
}
