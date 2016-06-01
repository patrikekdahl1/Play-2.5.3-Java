package controllers;


import models.Person;
import models.PersonDB;
import models.PersonFilter;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.person;

import java.util.ArrayList;

public class Application extends Controller {

    PersonDB personDB = new PersonDB("localhost", 27017, "peopledb", "peoplecollection");

    public Result index() {
        return ok(index.render("Yolo Boys Boyband"));
    }


    public Result person() {
        personDB.startDb();
        String name = null;
        try {
            name = request().getQueryString("name").toString();
        } catch (Exception e) {

        }

        if (name != null) {
            ArrayList<Person> personList = new ArrayList<>();

            PersonFilter personFilter = new PersonFilter(name, "fName", "lName", "fullName");
            personFilter.filterPeople();
            personDB.findPeople(personList, personFilter.getQuery());

            return ok(Json.toJson(personList));
        }


        return ok(person.render());
    }

}


