package az.example.org.model;

public class JsonPerson {
    private String name;
    private int age;
    private boolean employed;
    private String email;
    private double salary;
    private long bankAccountNumber;
    private int balance;

    public JsonPerson(String name, int age, boolean employed,
                      String email, double salary,
                      long bankAccountNumber, int balance) {
        this.name = name;
        this.age = age;
        this.employed = employed;
        this.email = email;
        this.salary = salary;
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isEmployed() {
        return employed;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public int getBalance() {
        return balance;
    }
}
