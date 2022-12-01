package com.dekabr1;

public class Engine {
    boolean chain;
    boolean fazaregulyator;
    int silindr;
    boolean pistons;
    int head;
    Engine(int silindr, int head, boolean chain, boolean fazaregulyator, boolean pistons){
        if(head==1 || head==2) this.head=head;
        this.silindr=silindr;
        this.chain=chain;
        this.fazaregulyator=fazaregulyator;
        this.pistons=pistons;
    }
}
