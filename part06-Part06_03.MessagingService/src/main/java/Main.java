import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Message test1 = new Message("pieterer", "aaaaaaaaaa1111111111bbbbbbbbbbaaaaaaaaaa1111111111bbbbbbbbbbaaaaaaaaaa1111111111bbbbbbbbbbaaaaaaaaaa1111111111bbbbbbbbbbaaaaaaaaaa1111111111bbbbbbbbbbaaaaaaaaaa1111111111bbbbbbbbbbaaaaaaaaaa1111111111bbbbbbbbbbaaaaaaaaaa1111111111bbbbbbbbbbaaaaaaaaaa1111111111bbbbbbbbbb");
        Message test2 = new Message("koos", "kaaskril");
        Message test3 = new Message("jan", "wikkelspies");
        MessagingService list = new MessagingService();
        System.out.println("");
        list.add(test1);
        list.add(test2);
        list.add(test3);
        ArrayList<Message> lists = list.getMessages();
        for(Message loop : lists) {
            System.out.println(loop);
        }
        // Try out your class here
    }
}
