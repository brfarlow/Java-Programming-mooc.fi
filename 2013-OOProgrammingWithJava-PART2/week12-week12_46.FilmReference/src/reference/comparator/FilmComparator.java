/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Xorfos
 */
public class FilmComparator implements Comparator<Film> {
    
    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        
        List<Rating> o2Ratings = ratings.get(o2);
        List<Rating> o1Ratings = ratings.get(o1);
        int o2values = 0;
        int o1values = 0;
        
        for(Rating rating : o2Ratings){
        o2values +=rating.getValue();
    }
        for(Rating rating : o1Ratings){
            o1values +=rating.getValue();
        }
        
        return Double.compare(( (double)o2values/o2Ratings.size() ),( (double)o1values/o1Ratings.size() ));
    }
    
}
