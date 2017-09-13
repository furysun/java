package com.company.exercisesOnClasses;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();

        account.setName("rose");
        account.setBalance(123);
        account.setId("1");

        System.out.println(
                account.getName() + " " +
                        account.getBalance() + " " +
                        account.getId() + " " + account.transferTo(account, 2));

    }
}
