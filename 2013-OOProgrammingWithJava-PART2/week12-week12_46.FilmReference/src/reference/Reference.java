/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Xorfos
 */
public class Reference {

    private RatingRegister register;

    public Reference(RatingRegister register) {
        this.register = register;
    }

    public Film recommendFilm(Person person) {

        if (register.getPersonalRatings(person).isEmpty()) {
            
            //if a person hasn't reviewed anything give them the highest rated film
            //retrieve a set of all the films and add them to a new list so they can be compared against each other
            Set<Film> filmSet = register.filmRatings().keySet();
            List<Film> films = new ArrayList<Film>();
            films.addAll(filmSet);
            Collections.sort(films, new FilmComparator(register.filmRatings()));

            return films.get(0);
        } else {

            //if a person has reviewed films before find the person who shares tastes most similar to current person
            Person mostSimilarPerson = mostSimilar(person);
            return personallyRecommended(person, mostSimilarPerson);
                
        }

    }

    private Person mostSimilar(Person person) {

        Map<Person, Integer> similarityRating = new HashMap<Person, Integer>();
        List<Person> reviewers = register.reviewers();
        reviewers.remove(person); //remove the current person from the list of reviewers

        for (Person reviewer : reviewers) {

            Map<Film, Rating> reviews = register.getPersonalRatings(reviewer);

            Iterator iterator = reviews.entrySet().iterator();
            Integer score = 0;

            while (iterator.hasNext()) {
                Map.Entry film = (Map.Entry) iterator.next();
                Film currentFilm = (Film) film.getKey();
                Rating rating = (Rating) film.getValue();
                Rating personalRating = register.getRating(person, currentFilm);
                score = rating.getValue() * personalRating.getValue();

            }
            similarityRating.put(reviewer, score);

        }

        Collections.sort(reviewers, new PersonComparator(similarityRating));

        return reviewers.get(0);
    }
    
    private Film personallyRecommended(Person person, Person mostSimilar){
        
        Map<Film, Rating> mostSimilarRatings = register.getPersonalRatings(mostSimilar);
        List<Film> notWatchedFilms = new ArrayList<Film>();
        
        
        //go through all of the most similar's persons films and create a list of films
        //that he's watched that person we're comparing him to hasn't yet watched
        for(Map.Entry film : mostSimilarRatings.entrySet()){        
            Film currentFilm = (Film)film.getKey();
            if(register.getRating(person, currentFilm) == Rating.NOT_WATCHED){
                notWatchedFilms.add(currentFilm);
            }
        }
        
        //if there are no films that haven't been watched leave early with null
        if(notWatchedFilms.isEmpty()){
            return null; 
        }
        
        List<Film> filmRatings = new ArrayList<Film>();
        Map<Film, List<Rating>> filmComparison = new HashMap<Film, List<Rating>>();
        for(Film film : notWatchedFilms){
            
            switch(register.getRating(mostSimilar, film)){
                case GOOD:
                    filmRatings.add(film);
                    filmComparison.put(film, new ArrayList<Rating>());
                    filmComparison.get(film).add(Rating.GOOD);
                    break;
                case FINE:
                    filmRatings.add(film);
                    filmComparison.put(film, new ArrayList<Rating>());
                    filmComparison.get(film).add(Rating.FINE);
                    break;
                case MEDIOCRE:
                    filmRatings.add(film);
                    filmComparison.put(film, new ArrayList<Rating>());
                    filmComparison.get(film).add(Rating.MEDIOCRE);
                    break;
                default:
                    break;    
            }
            
        }
        
        if(filmRatings.isEmpty()){
            return null;
        }
        
        Collections.sort(filmRatings, new FilmComparator(filmComparison));
        return filmRatings.get(0);
    }

}
