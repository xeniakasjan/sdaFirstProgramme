package Patterns.abstractFactory;

//abstract – preventing the user from creating an object

//This is our main/ parent class
public abstract class Computer {

    public abstract String getRAM();
    public abstract String getHDD(); //HDD – hard-drive
    public abstract String getCPU();

    public String toString(){
        return "RAM = " + this.getRAM() +"HDD = " + this.getHDD() +" ,CPU = " + this.getCPU();
    }
}
