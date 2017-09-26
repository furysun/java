package com.company.start.composition.task3;

public class testInvoice {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Invoice invoice = new Invoice();
        Account account = new Account();

        account.setCustomer(customer);
        account.setBalance(1234);
        account.setId(1);
        customer.setName("ddd");
        account.deposit(324);
        account.withdraw(13);
        customer.setId(34);

        System.out.println(
                account.getCustomer() + " " +
                        account.getBalance() + " " +
                        account.getId());

        Customer customer2 = new Customer();
        invoice.setCustomer(customer);
        invoice.setAmount(3454);
        customer.setName("Rose");
        customer.setDiscount(234);
        customer.setId(4);
        customer2.setId(1);


        System.out.println(invoice);
        System.out.println(invoice.getCostomerName());
        System.out.println(customer.getDiscount());
        System.out.println(invoice.getAmountAfterDiscount());
        System.out.println(invoice.getId());

    }
}
