/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.java.fx.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author admin
 */
public class Account {

    String email;
    String password;
    boolean locked;
    int type;

    StringProperty emailProperty;
    StringProperty passwordProperty;
    StringProperty typeProperty;
    StringProperty lockedProperty;
    
  

    public static final int TYPE_ADMIN = 1;
    public static final int TYPE_STAFF = 2;
    public static final int TYPE_STUDENT = 3;

    public Account(String email, String password, boolean locked, int type) {

        this.email = email;
        this.password = password;
        this.locked = locked;
        this.type = type;

        this.emailProperty = new SimpleStringProperty(email);
        this.passwordProperty = new SimpleStringProperty(password);
        switch (type) {
            case TYPE_ADMIN:
                this.typeProperty = new SimpleStringProperty("Admin");
                break;
            case TYPE_STAFF:
                this.typeProperty = new SimpleStringProperty("Staff");
                break;
            case TYPE_STUDENT:
                this.typeProperty = new SimpleStringProperty("Student");
                break;
        }

        if (locked) {
            this.lockedProperty = new SimpleStringProperty("Locked");
        } else {
            this.lockedProperty = new SimpleStringProperty("Open");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        this.emailProperty.set(email);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;

        if (locked) {
            this.lockedProperty.set("Lock");
        } else {
            this.lockedProperty.set("Open");
        }

    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
        switch (type) {
            case TYPE_ADMIN:
                this.typeProperty.set("Admin");
                break;
            case TYPE_STAFF:
                this.typeProperty.set("Staff");
                break;
            case TYPE_STUDENT:
                this.typeProperty.set("Student");
                break;
        }
    }

    public StringProperty getEmailProperty() {
        return emailProperty;
    }

    public StringProperty getPasswordProperty() {
        return passwordProperty;
    }

    public StringProperty getTypeProperty() {
        return typeProperty;
    }

    public StringProperty getLockedProperty() {
        return lockedProperty;
    }

}
