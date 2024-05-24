package br.com.dpl.decorator;

public class SlackDecorator extends BaseNotifierDecorator {

    public SlackDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        final String slack = databaseService.getSlackFromUsername(getUsername());
        msgSent = "Sending " + msg + " on Slack to " + slack;
        System.out.println(msgSent);
        messagesSent.add(msgSent);
    }
}
