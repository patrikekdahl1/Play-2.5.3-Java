package models;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;

import java.util.regex.Pattern;

public class PersonFilter {
    private String queryIn;
    private String fNameIn;
    private String lNameIn;
    private String fullNameIn;
    private BasicDBObject query;

    public PersonFilter(String queryIn, String fNameIn, String lNameIn, String fullNameIn) {
        this.queryIn = queryIn;
        this.fNameIn = fNameIn;
        this.lNameIn = lNameIn;
        this.fullNameIn = fullNameIn;
    }

    public void filterPeople() {
        Pattern regex = Pattern.compile(queryIn, Pattern.CASE_INSENSITIVE);
        BasicDBObject fName = new BasicDBObject(fNameIn, regex);
        BasicDBObject lName = new BasicDBObject(lNameIn, regex);
        BasicDBObject fullName = new BasicDBObject(fullNameIn, regex);
        BasicDBList or = new BasicDBList();
        or.add(fName);
        or.add(lName);
        or.add(fullName);
        query = new BasicDBObject("$or", or);
    }

    public BasicDBObject getQuery() {
        return query;
    }

}
