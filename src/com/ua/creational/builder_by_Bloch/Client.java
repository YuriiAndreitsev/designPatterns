package com.ua.creational.builder_by_Bloch;

public class Client {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("Jon", "22738022275")
                .withEmail("jon@example.com")
                .wantNewsletter(true)
                .build();
        System.out.println(newAccount);
    }
}
