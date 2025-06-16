package com.example;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.login("admin", "123456"); // Hardcoded password (security issue)
        System.out.println("Factorial of 5 is: " + app.factorial(5));
    }

    public void login(String username, String password) {
        if (username == "admin" && password == "123456") { // '==' instead of .equals() (bug)
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }

    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
