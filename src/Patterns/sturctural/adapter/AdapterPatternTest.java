package Patterns.sturctural.adapter;

public class AdapterPatternTest {
    public static void main(String[] args) {
    testObjectAdapter();
    }

    private static void testObjectAdapter(){
        socketAdapter socketAdapter =  new SocketObjectAdapterImpl();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter,12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println("v3 volts using Object Adapter: " + v3.getVolt());
        System.out.println("v12 volts using Object Adapter: " + v12.getVolt());
        System.out.println("v120 volts using Object Adapter: " + v120.getVolt());


    }


    private static Volt getVolt(socketAdapter sockAdap,int i){
        switch (i){
            case 3:
                return sockAdap.get3Volt();
            case 12:
                return sockAdap.get12Volt();
            case 120:
                return sockAdap.get120Volt();
            default:
                return sockAdap.get12Volt();

        }
    }

}
