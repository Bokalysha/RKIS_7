package ru.bokalysha.rkis.Prac7.exceptions.create;

public class SmartphoneNotCreatedException extends ModelNotCreatedException {

    public static final String entityType = "Smartphone";

    public SmartphoneNotCreatedException(String msg) {
        super(entityType, msg);
    }
}