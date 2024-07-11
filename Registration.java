public class Registration {
    private User user;

    public boolean register(User user){
        setUser(user);
        return validRegistration(this.user);
    }

    public boolean validRegistration(User user){
        if(Checker.checkName(user.getName()) && Checker.checkEmail(user.getEmail()) && Checker.checkAge(user.getAge())){
            return true;
        }
        return false;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
