// source: https://www.youtube.com/watch?v=gFevma4a_qQ
package observer2;

public class Main {

    public static void main(String[] args) {
        Client myClient = new Client();
        VIPClient myVIP = new VIPClient();

        Subject mySubject = new Subject();
        mySubject.addObserver(myClient);
        mySubject.addObserver(myVIP);

        mySubject.startWork();
    }
}
