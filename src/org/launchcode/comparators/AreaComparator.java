package org.launchcode.comparators;

import org.launchcode.City;
import java.util.Comparator;


/**
 * Created by estel on 7/18/2017.
 */
public class AreaComparator implements Comparator<City> {


    @Override
    public int compare(City o1, City o2) {
        return ((Double) o2.getArea()).compareTo(o1.getArea());
    }

}
