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
                new Utils.ProducerWithThrow<Image>() {
                    @Override
                    public Image apply() {
                        // get an image with a delay of 5 seconds
                        return new Image("https://ikasten.io/image.php?d=5");
                    }
                },
                new Utils.Consumer<Image>() {
                    @Override
                    public void apply(Image image) {
                        picture.setImage(image);
                    }
                }
        );

        welcomeText.setText("Welcome to JavaFX Application!"

        );
    }

}
