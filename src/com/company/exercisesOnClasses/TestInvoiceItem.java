package com.company.exercisesOnClasses;

public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem invoiceItem = new InvoiceItem();

        invoiceItem.setUnitPrice(23);
        invoiceItem.setQty(3);
        System.out.println(invoiceItem.getTotal());
    }
}
