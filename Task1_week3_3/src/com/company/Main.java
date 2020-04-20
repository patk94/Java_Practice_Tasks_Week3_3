package com.company;

public class Main {

    public static void main(String[] args) {
        int p = 12;
        int q = 25;

        System.out.println("p\t\tq\t\tpANDq\tpORq\tpXORq\tNOTp");
        System.out.println(p + "\t\t"+ q + "\t\t" + (p&q) + "\t\t" + (p|q) + "\t\t" + (p^q)+ "\t\t" + (~p));
        System.out.println(Integer.toBinaryString(p) + "\t"+ Integer.toBinaryString(q) +
                "\t" + Integer.toBinaryString((p&q)) + "\t" + Integer.toBinaryString((p|q)) +
                    "\t" + Integer.toBinaryString((p^q)) + "\t" + Integer.toBinaryString(~p));
        System.out.println(~q);
        System.out.println(Integer.toBinaryString((~q)));
    }
}
