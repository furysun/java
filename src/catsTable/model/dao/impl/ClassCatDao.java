package catsTable.model.dao.impl;

import catsTable.model.dao.CatDao;
import catsTable.model.db.CatStorage;
import catsTable.model.domain.Cat;

import java.util.List;

public class ClassCatDao implements CatDao {
    private static ClassCatDao instance;
    private CatStorage catStorage;

    private ClassCatDao(){
        catStorage = CatStorage.getInstance();
    }

    public static ClassCatDao getInstance(){
        if(instance == null){
            instance = new ClassCatDao();
        }

        return instance;
    }


    @Override
    public List<Cat> getCats() {
        return catStorage.getCats();
    }

    @Override
    public void createCat(Cat cat) {
        List<Cat> cats = catStorage.getCats();
        cats.add(cat);

    }
}
