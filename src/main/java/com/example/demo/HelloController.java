package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
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
                () ->
                        new Image("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png"),
                image -> picture.setImage(image));

        welcomeText.setText("Welcome to JavaFX Application!"

        );
    }

}
