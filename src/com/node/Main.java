package com.node;

public class Main {
    public static void main(String[] args) {

        Nod x5 = new Nod(5);
        Nod x4 = new Nod(4, x5);
        Nod x3 = new Nod(3, x4);
        Nod x2 = new Nod(2, x3);
        Nod head = new Nod(1, x2);

        Nod temp = new Nod(0);

        System.out.println(head.next.next.next.next.val);


        temp.val = head.val;
        head.val = head.next.next.next.next.val;
        head.next.next.next.next.val = temp.val;
        temp.val = head.next.next.val;
        head.next.val = head.next.next.next.val;
        head.next.next.next.val = temp.val;

        System.out.println(head.next.next.next.next.val);

    }
}