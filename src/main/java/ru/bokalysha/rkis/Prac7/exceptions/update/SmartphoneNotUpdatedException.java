package ru.bokalysha.rkis.Prac7.exceptions.update;

public class SmartphoneNotUpdatedException extends ModelNotUpdatedException {

    public static final String entityType = "Smartphone";

    public SmartphoneNotUpdatedException(String msg) {
        super(entityType, msg);
    }
}