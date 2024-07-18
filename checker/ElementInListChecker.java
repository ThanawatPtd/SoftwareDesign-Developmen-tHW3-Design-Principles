package src.checker;

import java.util.List;

public class ElementInListChecker implements Checker {

    private List<String> list;

    public ElementInListChecker(List<String> list) {
        this.list = list;
    }

    @Override
    public boolean check(String text) {
        return false;
    }
}
