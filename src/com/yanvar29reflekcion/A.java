package com.yanvar29reflekcion;

public class A {
    private  A(){};
}

class B{
    Class<A> ba= A.class;
    Class<? extends Class> da=A.class.getClass();
   // A daddd=new A();
}
