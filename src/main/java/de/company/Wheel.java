package de.company;

public interface Wheel {
    int red;
    int blue;
    int green;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
