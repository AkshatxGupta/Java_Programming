class Account {
    public String name;
    protected String email;
    private int password;

    public void setPassword(int password) {
        this.password = password;
    }
    public void getinfo(){
        System.out.println("The name is "+ this.name);
        System.out.println("The email is "+this.email);
        System.out.println("The password is "+this.password);
    }
}

public class Accessmodifier {
    public static void main(String args[]){
        Account a1 = new Account();
        a1.name = "Phela Pyaar";
        a1.email = "Phelapyaar@gmail.com";
        a1.setPassword(12345);
        a1.getinfo();
        System.out.println("The email is "+a1.email);
    }
}
