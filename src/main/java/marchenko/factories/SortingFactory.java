package main.java.marchenko.factories;

import main.java.marchenko.algorithms.Algorithm;
import main.java.marchenko.algorithms.sorting.BubbleSorting;

import java.util.HashMap;
import java.util.Map;

public class SortingFactory {

    private static final String BUBBLE_SORT = "bubble_sort";

    private Map<String, Algorithm> algorithmMap = new HashMap<String, Algorithm>() {{
        put(BUBBLE_SORT, new BubbleSorting());
    }};

    public Map<String, Algorithm> getAll() {
        return algorithmMap;
    }

}
