package edu.nyu.cess.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by aruff on 7/22/17.
 */
public class Account {
    private StringProperty name = new SimpleStringProperty();

    public void setName(String name) {
        this.name.set(name);
    }

    public StringProperty getName() {
        return name;
    }

}
