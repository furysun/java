package catsTable.model.domain;

public enum CatColor {
    RED("Red"), BLACK("Black"), WHITE("White"), STRIPED("Striped");
    private String name;

    CatColor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static CatColor findColor(String color) {
        for (CatColor catColor : values()) {
            if (catColor.getName().equals(color)) {
                return catColor;
            }
        }
        throw new RuntimeException("Cat color not found");
    }
}
