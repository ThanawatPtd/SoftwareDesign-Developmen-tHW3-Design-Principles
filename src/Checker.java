package src;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
/**
 * Thanawat Potidet
 * 6510450445
 * */
public class Checker {

    public static boolean checkName(String name){
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name should not empty");
        }
        if(!name.matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Name is wrong format");
        }
        return true;
    }


    public static boolean checkEmail(String email){
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if(email == null || email.trim().isEmpty()){
            throw new IllegalArgumentException("Email should not empty");
        }
        Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
        if(!validEmailPattern.matcher(email).matches()){
            throw new IllegalArgumentException("Email is not wrong format");
        }
        List<String> notAllowDomains = Arrays.asList("dom1.cc","dom2.cc","dom3.cc");
        if(notAllowDomains.contains(email.split("@")[1])){
            throw new IllegalArgumentException("Domain Email is not allow");
        }
        return true;
    }

    public static boolean checkAge(int age){
        if(age < 20){
            throw new IllegalArgumentException("Age should more than 20 years");
        }
        return true;
    }
}
