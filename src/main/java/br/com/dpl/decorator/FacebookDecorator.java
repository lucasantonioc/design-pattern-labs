package br.com.dpl.decorator;

public class FacebookDecorator extends BaseNotifierDecorator {

    public FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        final String phoneNumber = databaseService.getFacebookNameFromUsername(getUsername());
        msgSent = "Sending " + msg + " on Facebook to " + phoneNumber;
        System.out.println(msgSent);
        messagesSent.add(msgSent);
    }
}
