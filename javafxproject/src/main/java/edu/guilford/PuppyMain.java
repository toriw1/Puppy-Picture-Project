package edu.guilford;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class PuppyMain extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // Instantiate a VBox root mode
        VBox root = new VBox();

        // Instantiate a default puppy object
        Puppy puppy = new Puppy();

        // Instantiate a PuppyPane object and add it to the root node
        root.getChildren().add(new PuppyPane(puppy));
        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

        // write a print statement to print out a message that the program has ended
        System.out.println("Program has ended");
    }

}