package models;

import org.bson.Document;

public class Person {
    private String fName;
    private String lName;
    private String fullName;

    public Person(Document document) {
        this.fName = document.getString("fName");
        this.lName = document.getString("lName");
        this.fullName = document.getString("fullName");
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
