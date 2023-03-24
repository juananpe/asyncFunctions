package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private ImageView picture;

    @FXML
    protected void onHelloButtonClick() {


        Utils.asyncTask(
                () -> new Image("https://ikasten.io/image.php?d=5"),
                image -> picture.setImage(image));

        welcomeText.setText("Welcome to JavaFX Application!"

        );
    }

}
