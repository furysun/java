package catsTable.controller;

import catsTable.model.domain.Cat;
import catsTable.model.domain.CatColor;
import catsTable.model.service.CatService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MainController {

    private CatService catService;

    @FXML
    private VBox catsVBox;

    @FXML
    private VBox mainVBox;//todo remove

    @FXML
    private Button addButton;

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField weighTextField;

    @FXML
    private ComboBox colorComboBox;

    @FXML
    private TextField ageTextField;


    @FXML
    public void initialize() {
        catService = CatService.getInstance();

        populateColorComboBox();
        showCats();

    }

    private void populateColorComboBox() {
        List<String> colors = new ArrayList<>();
        for (CatColor color : CatColor.values()) {
            colors.add(color.getName());
        }

        ObservableList<String> oList = FXCollections.observableList(colors);
        colorComboBox.setItems(oList);
    }

    public MainController() {
    }

    @FXML
    public void pressAdd(ActionEvent event) throws IOException {
        Cat cat = new Cat();

        cat.setName(nameTextField.getText());
        cat.setAge(Integer.parseInt(ageTextField.getText()));
        cat.setWeigh(Integer.parseInt(weighTextField.getText()));

        String color = colorComboBox.getValue().toString();
        cat.setColor(CatColor.findColor(color));

        catService.createCat(cat);
        showCats();
    }

    public void showCats() {
        catsVBox.getChildren().clear();

        List<Cat> cats = catService.getCats();
        for (Cat cat : cats) {
            HBox catHBox = populateHBox(cat);
            catsVBox.getChildren().add(catHBox);
        }

    }

    private HBox populateHBox(Cat cat) {
        HBox catHBox = new HBox();
        catHBox.setSpacing(55);
        catHBox.setPadding(new Insets(10));

        Label catNameLabel = new Label();
        catNameLabel.setText(cat.getName());

        Label catWeighLabel = new Label();
        catWeighLabel.setText(String.valueOf(cat.getWeigh()));

        Label catColorLabel = new Label();
        catColorLabel.setText(cat.getColor().getName());

        Label catAgeLabel = new Label();
        catAgeLabel.setText(String.valueOf(cat.getAge()));

        Button delButton = new Button();
        delButton.setText("x");

        delButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("ffgg");
                catService.delete(cat.getId());
                showCats();
            }
        });

        catHBox.getChildren().add(catNameLabel);
        catHBox.getChildren().add(catWeighLabel);
        catHBox.getChildren().add(catColorLabel);
        catHBox.getChildren().add(catAgeLabel);
        catHBox.getChildren().add(delButton);

        return catHBox;
    }
}
