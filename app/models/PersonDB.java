package models;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;

public class PersonDB {

    private MongoClient mongoClient;
    private MongoDatabase database;
    private String host;
    private int address;
    private String dbName;
    private String collection;


    public PersonDB(String host, int address, String dbName, String collection) {
        this.host = host;
        this.address = address;
        this.dbName = dbName;
        this.collection = collection;
    }

    public void startDb() {
        mongoClient = new MongoClient(host, address);
        database = mongoClient.getDatabase(dbName);
    }

    public ArrayList<Person> findPeople(ArrayList<Person> personList, BasicDBObject query) {
        FindIterable<Document> iterable = database.getCollection(collection).find(query);

        for (Document document : iterable) {
            personList.add(new Person(document));
        }
        return personList;
    }
}