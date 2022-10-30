package Patterns.behavioral.chain;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);
    void dispense(Currency cur);

}
