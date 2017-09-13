/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Xorfos
 */
public class RatingRegister {

    private HashMap<Film, List<Rating>> filmRatings;
    private HashMap<Person, HashMap<Film, Rating>> personalRatings;

    public RatingRegister() {

        this.filmRatings = new HashMap<Film, List<Rating>>();
        this.personalRatings = new HashMap<Person, HashMap<Film, Rating>>();

    }

    public void addRating(Film film, Rating rating) {

        if (filmRatings.containsKey(film)) {
            filmRatings.get(film).add(rating);
        } else {
            filmRatings.put(film, new ArrayList<Rating>());
            filmRatings.get(film).add(rating);
        }

    }

    public List<Rating> getRatings(Film film) {

        return filmRatings.get(film);
    }

    public Map<Film, List<Rating>> filmRatings() {
        return this.filmRatings;
    }

    public void addRating(Person person, Film film, Rating rating) {

        if (personalRatings.containsKey(person)) {
            personalRatings.get(person).put(film, rating);
            addRating(film, rating);
        } else {
            personalRatings.put(person, new HashMap<Film, Rating>());
            personalRatings.get(person).put(film, rating);
            addRating(film, rating);
        }

    }

    public Rating getRating(Person person, Film film) {
        if (personalRatings.get(person).containsKey(film)) {
            return personalRatings.get(person).get(film);
        }
        return Rating.NOT_WATCHED;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (personalRatings.containsKey(person)) {

            return personalRatings.get(person);
        }
        return Collections.EMPTY_MAP;
    }

    public List<Person> reviewers() {

        List<Person> reviewers = new ArrayList<Person>(personalRatings.keySet());

        return reviewers;
    }

}
