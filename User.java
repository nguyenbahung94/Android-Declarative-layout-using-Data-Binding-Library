package com.example.nbhung.androiddeclarativelayoutusingdatabindinglibrary;

/**
 * Created by nbhung on 6/16/2017.
 */

public class User {
    private String lastName,firstName;

    public User(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
