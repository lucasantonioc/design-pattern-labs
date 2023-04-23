package br.com.dpl.decorator;

public class WhatsAppDecorator extends BaseNotifierDecorator {

    public WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        final String phoneNumber = databaseService.getPhoneNumberFromUsername(getUsername());
        msgSent = "Sending " + msg + " on WhatsApp to " + phoneNumber;
        System.out.println(msgSent);
        messagesSent.add(msgSent);
    }
}
