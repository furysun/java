package catsTable.model.db;

import catsTable.model.domain.Cat;
import catsTable.model.domain.CatColor;

import java.util.ArrayList;
import java.util.List;

public class CatStorage {
    private List<Cat> cats;

    private static CatStorage catStorage;

    public static CatStorage getInstance() {
        if (catStorage == null) {
            catStorage = new CatStorage();
        }
        return catStorage;
    }

    private CatStorage() {
        cats = new ArrayList<>();

        cats.add(new Cat("Tom", 1, CatColor.RED, 1));
        cats.add(new Cat("Tim", 2, CatColor.BLACK, 2));
        cats.add(new Cat("Mia", 3, CatColor.STRIPED, 4));
        cats.add(new Cat("Rose", 2, CatColor.WHITE, 1));
        cats.add(new Cat("Pri", 4, CatColor.RED, 5));
    }

    public Cat findCatById(int id) {
        for (Cat cat : cats) {
            if (cat.getId() == id) {
                return cat;
            }
        }

        throw new CatNotFoundException();
    }

    public List<Cat> getCats() {
        return cats;
    }
}
