package edu.guilford;

import java.io.File;

import javafx.geometry.HPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class PuppyPane extends GridPane {

    // puppy attribute
    private Puppy puppy;

    // textfield attributes
    private TextField nameField;
    private TextField ageField;
    private TextField breedField;
    private TextField colorField;
    private TextField furtypeField;
    private TextField sizeField;
    // private TextField weightField;
    private TextField spotsField;
    private TextField sexField;

    // label attributes
    private Label nameLabel;
    private Label ageLabel;
    private Label breedLabel;
    private Label colorLabel;
    private Label furtypeLabel;
    private Label sizeLabel;
    // private Label weightLabel;
    private Label spotsLabel;
    private Label sexLabel;

    // add puppy button attribute
    private Button puppyButton;
    private Button newPuppyButton;

    // Step 1: Declare my ImageView attributes
    private ImageView whitePuppyView;
    private ImageView blackPuppyView;
    private ImageView brownPuppyView;
    private ImageView redPuppyView;

    // constructor
    public PuppyPane(Puppy puppy) {
        this.puppy = puppy;

        // Step 2: Instantiate my ImageView attributes
        // Get the path of the file that contains the image for the white puppy
        File whitePuppy = new File(this.getClass().getResource("white-puppy.png").getPath());
        // URI
        whitePuppyView = new ImageView(whitePuppy.toURI().toString());
        // Get the path of the file that contains the image for the black puppy
        File blackPuppy = new File(this.getClass().getResource("black-puppy.png").getPath());
        // URI
        blackPuppyView = new ImageView(blackPuppy.toURI().toString());
        // Get the path of the file that contains the image for the brown puppy
        File brownPuppy = new File(this.getClass().getResource("brown-puppy.png").getPath());
        // URI
        brownPuppyView = new ImageView(brownPuppy.toURI().toString());
        // Get the path of the file that contains the image for the red puppy
        File redPuppy = new File(this.getClass().getResource("red-puppy.png").getPath());
        // URI
        redPuppyView = new ImageView(redPuppy.toURI().toString());

        // instantiate a puppy button that sets the text of the labels to the text in
        puppyButton = new Button("New Puppy from Text Fields");

        // instantiate the new puppy button
        newPuppyButton = new Button("New Random Puppy");

        // instantiate the textfields
        nameField = new TextField();
        ageField = new TextField();
        breedField = new TextField();
        colorField = new TextField();
        furtypeField = new TextField();
        sizeField = new TextField();
        // weightField = new TextField();
        spotsField = new TextField();
        sexField = new TextField();

        // instantiate the labels
        nameLabel = new Label("Name: " + puppy.getName());
        ageLabel = new Label("Age: " + puppy.getAge());
        breedLabel = new Label("Breed: " + puppy.getBreed());
        colorLabel = new Label("Color: " + puppy.getColor());
        furtypeLabel = new Label("Fur Type: " + puppy.getFurtype());
        sizeLabel = new Label("Size: " + puppy.getSize());
        // weightLabel = new Label("Weight: " + puppy.getWeight());
        spotsLabel = new Label("Spots: " + puppy.isSpots());
        sexLabel = new Label("Sex: " + puppy.getSex());

        // add the labels and textfields to the gridpane
        // add the name label and field to the gridpane
        this.add(nameLabel, 0, 0);
        this.add(nameField, 1, 0);
        // add the age label and field to the gridpane
        this.add(ageLabel, 0, 1);
        this.add(ageField, 1, 1);
        // add the breed label and field to the gridpane
        this.add(breedLabel, 0, 2);
        this.add(breedField, 1, 2);
        // add the color label and field to the gridpane
        this.add(colorLabel, 0, 3);
        this.add(colorField, 1, 3);
        // add the furtype label and field to the gridpane
        this.add(furtypeLabel, 0, 4);
        this.add(furtypeField, 1, 4);
        // add the size label and field to the gridpane
        this.add(sizeLabel, 0, 5);
        this.add(sizeField, 1, 5);
        // add the weight label and field to the gridpane
        // this.add(weightLabel, 0, 6);
        // this.add(weightField, 1, 6);
        // add the spots label and field to the gridpane
        this.add(spotsLabel, 0, 7);
        this.add(spotsField, 1, 7);
        // add the sex label and field to the gridpane
        this.add(sexLabel, 0, 8);
        this.add(sexField, 1, 8);
        // add the puppy button to the gridpane
        this.add(puppyButton, 0, 9);
        // add the new puppy button to the gridpane
        this.add(newPuppyButton, 1, 9);

        // add the white puppy view to the gridpane if the puppy color is white or
        // White, and remove it if not
        // and store this in a method so that it can be used in the event listener
        // public static void addWhitePuppyView(puppy); {
        // if (puppy.getColor().equals("white") || puppy.getColor().equals("White")) {
        // this.add(whitePuppyView, 2, 0, 1, 10);
        // } else {
        // this.getChildren().remove(whitePuppyView);
        // }
        // }

        // Step 3: Add the ImageView attributes to the gridpane
        // add the white puppy view to the gridpane if the puppy color is white or
        // White, if not remove it
        if (puppy.getColor().equals("white") || puppy.getColor().equals("White")) {
            this.add(whitePuppyView, 2, 0, 1, 10);
        } else {
            this.getChildren().remove(whitePuppyView);
        }
        // add the black puppy view to the gridpane if the puppy color is black or
        // Black, if not remove it
        if (puppy.getColor().equals("black") || puppy.getColor().equals("Black")) {
            this.add(blackPuppyView, 2, 0, 1, 10);
        } else {
            this.getChildren().remove(blackPuppyView);
        }
        // add the brown puppy view to the gridpane if the puppy color is brown or
        // Brown, if not remove it
        if (puppy.getColor().equals("brown") || puppy.getColor().equals("Brown")) {
            this.add(brownPuppyView, 2, 0, 1, 10);
        } else {
            this.getChildren().remove(brownPuppyView);
        }
        // add the red puppy view to the gridpane if the puppy color is red or Red, if
        // not remove it
        if (puppy.getColor().equals("red") || puppy.getColor().equals("Red")) {
            this.add(redPuppyView, 2, 0, 1, 10);
        } else {
            this.getChildren().remove(redPuppyView);
        }

        // change the image height of white puppy to 100
        whitePuppyView.setFitHeight(250);
        // preserve the aspect ratio
        whitePuppyView.setPreserveRatio(true);
        // change the image height of black puppy to 100
        blackPuppyView.setFitHeight(250);
        // preserve the aspect ratio
        blackPuppyView.setPreserveRatio(true);
        // change the image height of brown puppy to 100
        brownPuppyView.setFitHeight(250);
        // preserve the aspect ratio
        brownPuppyView.setPreserveRatio(true);
        // change the image height of red puppy to 100
        redPuppyView.setFitHeight(250);
        // preserve the aspect ratio
        redPuppyView.setPreserveRatio(true);

        // add a listener to the puppy button to change the labels
        puppyButton.setOnAction(e -> {
            // set the puppy name label to the name field text
            nameLabel.setText("Name: " + nameField.getText());
            // set the puppy age label to the age field text
            ageLabel.setText("Age: " + ageField.getText());
            // set the puppy breed label to the breed field text
            breedLabel.setText("Breed: " + breedField.getText());
            // set the puppy color label to the color field text
            colorLabel.setText("Color: " + colorField.getText());
            // set the puppy furtype label to the furtype field text
            furtypeLabel.setText("Fur Type: " + furtypeField.getText());
            // set the puppy size label to the size field text
            sizeLabel.setText("Size: " + sizeField.getText());
            // set the puppy weight label to the weight field text
            // weightLabel.setText("Weight: " + weightField.getText());
            // set the puppy spots label to the spots field text
            spotsLabel.setText("Spots: " + spotsField.getText());
            // set the puppy sex label to the sex field text
            sexLabel.setText("Sex: " + sexField.getText());
        });

        // add a listener to the new puppy button to change the labels to generate a new
        // puppy object
        newPuppyButton.setOnAction(e -> {
            // generate a new puppy object
            Puppy newPuppy = new Puppy();
            // set the puppy name label to the new puppy name
            nameLabel.setText("Name: " + newPuppy.getName());
            // set the puppy age label to the new puppy age
            ageLabel.setText("Age: " + newPuppy.getAge());
            // set the puppy breed label to the new puppy breed
            breedLabel.setText("Breed: " + newPuppy.getBreed());
            // set the puppy color label to the new puppy color
            colorLabel.setText("Color: " + newPuppy.getColor());
            // set the puppy furtype label to the new puppy furtype
            furtypeLabel.setText("Fur Type: " + newPuppy.getFurtype());
            // set the puppy size label to the new puppy size
            sizeLabel.setText("Size: " + newPuppy.getSize());
            // set the puppy weight label to the new puppy weight
            // weightLabel.setText("Weight: " + newPuppy.getWeight());
            // set the puppy spots label to the new puppy spots
            spotsLabel.setText("Spots: " + newPuppy.isSpots());
            // set the puppy sex label to the new puppy sex
            sexLabel.setText("Sex: " + newPuppy.getSex());
            // call the addWhitePuppyView method to add the white puppy view to the gridpane
            // addWhitePuppyView();
        });

    }

}
