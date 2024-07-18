package src;
/**
 * Thanawat Potidet
 * 6510450445
 * */
import src.checker.Checker;
import src.checker.NotEmptyStringChecker;
import src.checker.RegExpChecker;

public class Registration {

    public boolean register(User user){

        return validRegistration(user);
    }

    public boolean validRegistration(User user){
        Checker checker = new NotEmptyStringChecker();
        if (!checker.check(user.getName())) {
            throw new IllegalArgumentException("Name should not be empty");
        }

        if (!checker.check(user.getEmail())) {
            throw new IllegalArgumentException("Email should not be empty");
        }

        checker = new RegExpChecker("[a-zA-Z]+");
        if (!checker.check(user.getName())) {
            throw new IllegalArgumentException("Name is wrong format");
        }

        return true;
    }

}
