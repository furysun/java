package catsTable.model.dao;

import catsTable.model.domain.Cat;

import java.util.List;

public interface CatDao {
    List<Cat> getCats();

    void createCat(Cat cat);

}
