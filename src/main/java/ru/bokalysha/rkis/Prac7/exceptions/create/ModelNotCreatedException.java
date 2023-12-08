package ru.bokalysha.rkis.Prac7.exceptions.create;


public class ModelNotCreatedException extends RuntimeException {
    public ModelNotCreatedException(String entityType , String msg) {
        super(entityType + " not created because: " + msg);
    }

}