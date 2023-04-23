package br.com.dpl.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotifierTests {

    @BeforeEach
    void beforeEach() {
        BaseNotifierDecorator.messagesSent.clear();
    }

    @Test
    void testAllTypesNotifiers() {
        INotifier notifier = new FacebookDecorator(
                new WhatsAppDecorator(
                        new Notifier("lucasantonio.c")
                )
        );

        notifier.send("notification");

        assertTrue(BaseNotifierDecorator.messagesSent.stream().anyMatch(msg -> msg.contains("@Mail")));
        assertTrue(BaseNotifierDecorator.messagesSent.stream().anyMatch(msg -> msg.contains("@WhatsAppPhone")));
        assertTrue(BaseNotifierDecorator.messagesSent.stream().anyMatch(msg -> msg.contains("@Facebook")));
    }

    @Test
    void testMailDecoratorNotifier() {
        INotifier facebookNotifier = new FacebookDecorator(new Notifier("lucasantonio.c"));
        facebookNotifier.send("Hello!!!");
        assertEquals("Sending Hello!!! on Mail to lucasantonio.c@Mail", BaseNotifierDecorator.messagesSent.get(0));
    }

    @Test
    void testFacebookDecoratorNotifier() {
        INotifier facebookNotifier = new FacebookDecorator(new Notifier("lucasantonio.c"));
        facebookNotifier.send("Hello!!!");
        assertEquals("Sending Hello!!! on Facebook to lucasantonio.c@Facebook", BaseNotifierDecorator.messagesSent.get(1));
    }

    @Test
    void testWhatsAppDecoratorNotifier() {
        INotifier whatsAppNotifier = new WhatsAppDecorator(new Notifier("lucasantonio.c"));
        whatsAppNotifier.send("Hello!!!");
        assertEquals("Sending Hello!!! on WhatsApp to lucasantonio.c@WhatsAppPhone", BaseNotifierDecorator.messagesSent.get(1));
    }

}
