package catsTable.model.service;

public class CatIdGenerator {
    private static long id;

    public static long generateId() {
//        System.out.println(id);
        return id++;
    }
}
