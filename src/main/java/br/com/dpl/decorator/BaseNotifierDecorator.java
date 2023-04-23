package br.com.dpl.decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseNotifierDecorator implements INotifier {

    private final INotifier wrapped;
    protected final DatabaseService databaseService;
    protected String msgSent = "";
    public static List<String> messagesSent = new ArrayList<>();

    public BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
        databaseService = new DatabaseService();
    }

    @Override
    public void send(String msg) {
        wrapped.send(msg);
    }

    @Override
    public String getUsername() {
        return wrapped.getUsername();
    }

}
