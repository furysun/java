package catsTable.model.service;

import catsTable.model.dao.CatDao;
import catsTable.model.dao.impl.ClassCatDao;
import catsTable.model.domain.Cat;

import java.util.List;

public class CatService {
    private CatDao catDao;
    private static CatService catService;

    public static CatService getInstance() {
        if (catService == null) {
            catService = new CatService();
        }
        return catService;
    }

    private CatService() {
        catDao = ClassCatDao.getInstance();
    }

    public List<Cat> getCats() {
        return catDao.getCats();
    }

    public void createCat(Cat cat) {
        catDao.createCat(cat);
    }

    public void delete(int id) {
        catDao.delete(id);
    }
}
