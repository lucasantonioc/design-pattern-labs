package br.com.dpl.decorator;

public class Notifier implements INotifier {

    private final String username;
    protected final DatabaseService databaseService;

    public Notifier(String username) {
        this.username = username;
        databaseService = new DatabaseService();
    }

    @Override
    public void send(String message) {
        String mail = databaseService.getMailFromUserName(username);
        String msgSent = "Sending " + message + " on Mail to " + mail;
        System.out.println(msgSent);
        BaseNotifierDecorator.messagesSent.add(msgSent);
    }

    @Override
    public String getUsername() {
        return username;
    }
}
