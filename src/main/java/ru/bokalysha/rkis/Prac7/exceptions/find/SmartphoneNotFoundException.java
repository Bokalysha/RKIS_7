package ru.bokalysha.rkis.Prac7.exceptions.find;

public class SmartphoneNotFoundException extends ModelNotFoundException {

    public static final String entityType = "Smartphone";

    public SmartphoneNotFoundException(String msg) {
        super(entityType, msg);
    }

    public SmartphoneNotFoundException(int id) {
        super(entityType, id);
    }

}
