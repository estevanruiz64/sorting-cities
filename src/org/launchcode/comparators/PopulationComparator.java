package org.launchcode.comparators;

import java.util.Comparator;
import org.launchcode.City;

/**
 * Created by estel on 7/18/2017.
 */
public class PopulationComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        return o2.getPopulation() - o1.getPopulation();
    }

}
