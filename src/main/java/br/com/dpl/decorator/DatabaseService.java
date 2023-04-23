package br.com.dpl.decorator;

public class DatabaseService {

    public String getMailFromUserName(String username) {
        return username + "@Mail";
    }

    public String getPhoneNumberFromUsername(String username) {
        return username + "@WhatsAppPhone";
    }

    public String getFacebookNameFromUsername(String username) {
        return username + "@Facebook";
    }

}
