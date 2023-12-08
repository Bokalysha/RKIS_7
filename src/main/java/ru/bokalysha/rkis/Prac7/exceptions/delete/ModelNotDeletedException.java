package ru.bokalysha.rkis.Prac7.exceptions.delete;

public class ModelNotDeletedException extends RuntimeException {
    public ModelNotDeletedException(String entityType , String msg) {
        super(entityType + " not deleted because: " + msg);
    }

}
