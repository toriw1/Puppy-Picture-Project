package edu.guilford;

import java.io.File;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class PuppyPane extends GridPane {

    // puppy attribute
    private Puppy puppy;

    // textfield attributes
    private TextField nameField;
    private TextField ageField;
    private TextField breedField;
    private TextField colorField;
    private TextField furtypeField;
    // private TextField sizeField;
    private TextField weightField;
    private TextField spotsField;
    private TextField sexField;

    // label attributes
    private Label nameLabel;
    private Label ageLabel;
    private Label breedLabel;
    private Label colorLabel;
    private Label furtypeLabel;
    // private Label sizeLabel;
    private Label weightLabel;
    private Label spotsLabel;
    private Label sexLabel;

    // add puppy button attribute
    private Button puppyButton;
    private Button newPuppyButton;

    // menu attributes
    private Menu fileMenu;
    // menubar attribute
    private MenuBar menuBar;

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
        // sizeField = new TextField();
        weightField = new TextField();
        spotsField = new TextField();
        sexField = new TextField();

        // instantiate the labels
        nameLabel = new Label("Name: " + puppy.getName());
        ageLabel = new Label("Age: " + puppy.getAge());
        breedLabel = new Label("Breed: " + puppy.getBreed());
        colorLabel = new Label("Color: " + puppy.getColor());
        furtypeLabel = new Label("Fur Type: " + puppy.getFurtype());
        // sizeLabel = new Label("Size: " + puppy.getSize());
        weightLabel = new Label("Weight: " + String.format("%.2f", puppy.getWeight()));
        spotsLabel = new Label("Spots: " + puppy.isSpots());
        sexLabel = new Label("Sex: " + puppy.getSex());

        // instantiate the file menu
        fileMenu = new Menu("Change Color");
        // instantiate the menubar
        menuBar = new MenuBar();

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
        // this.add(sizeLabel, 0, 5);
        // this.add(sizeField, 1, 5);
        // add the weight label and field to the gridpane
        this.add(weightLabel, 0, 6);
        this.add(weightField, 1, 6);
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

        changePuppyPicture(puppy);

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

        // add a dropdown menu to the gridpane to change the color of the background
        // create a new menu
        Menu menu = new Menu("Background Color");
        // create a new menu item
        MenuItem pink = new MenuItem("Pink");
        // set the action of the menu item
        pink.setOnAction(e -> {
            // set the background color to pink
            this.setStyle("-fx-background-color: pink");
        });
        // create a new menu item
        MenuItem blue = new MenuItem("Blue");
        // set the action of the menu item
        blue.setOnAction(e -> {
            // set the background color to blue
            this.setStyle("-fx-background-color: blue");
        });
        // create a new menu item
        MenuItem yellow = new MenuItem("Yellow");
        // set the action of the menu item
        yellow.setOnAction(e -> {
            // set the background color to yellow
            this.setStyle("-fx-background-color: yellow");
        });
        // create a new menu item
        MenuItem green = new MenuItem("Green");
        // set the action of the menu item
        green.setOnAction(e -> {
            // set the background color to green
            this.setStyle("-fx-background-color: green");
        });
        // create a new menu item
        MenuItem orange = new MenuItem("Orange");
        // set the action of the menu item
        orange.setOnAction(e -> {
            // set the background color to orange
            this.setStyle("-fx-background-color: orange");
        });
        // create a new menu item
        MenuItem purple = new MenuItem("Purple");
        // set the action of the menu item
        purple.setOnAction(e -> {
            // set the background color to purple
            this.setStyle("-fx-background-color: purple");
        });
        // create a new menu item
        MenuItem red = new MenuItem("Red");
        // set the action of the menu item
        red.setOnAction(e -> {
            // set the background color to red
            this.setStyle("-fx-background-color: red");
        });
        // create a new menu item
        MenuItem white = new MenuItem("White");
        // set the action of the menu item
        white.setOnAction(e -> {
            // set the background color to white
            this.setStyle("-fx-background-color: white");
        });
        // create a new menu item
        MenuItem black = new MenuItem("Black");
        // set the action of the menu item
        black.setOnAction(e -> {
            // set the background color to black
            this.setStyle("-fx-background-color: black");
        });
        // create a new menu item
        MenuItem brown = new MenuItem("Brown");
        // set the action of the menu item
        brown.setOnAction(e -> {
            // set the background color to brown
            this.setStyle("-fx-background-color: brown");
        });
        // add the menu items to the menu
        menu.getItems().addAll(pink, blue, yellow, green, orange, purple, red, white, black, brown);
        // add the menu to the file menu
        fileMenu.getItems().add(menu);
        // add the file menu to the menu bar
        menuBar.getMenus().add(fileMenu);
        // add the menu bar to the gridpane
        this.add(menuBar, 0, 10, 2, 1);

        // add a dropdown menu to the gridpane to change the font color of the labels
        // create a new menu
        Menu menu2 = new Menu("Font Color");
        // create a new menu item
        MenuItem white2 = new MenuItem("White");
        // set the action of the menu item
        white2.setOnAction(e -> {
            // set the font color to white
            nameLabel.setTextFill(Color.WHITE);
            ageLabel.setTextFill(Color.WHITE);
            breedLabel.setTextFill(Color.WHITE);
            colorLabel.setTextFill(Color.WHITE);
            furtypeLabel.setTextFill(Color.WHITE);
            weightLabel.setTextFill(Color.WHITE);
            spotsLabel.setTextFill(Color.WHITE);
            sexLabel.setTextFill(Color.WHITE);
        });
        // create a new menu item
        MenuItem black2 = new MenuItem("Black");
        // set the action of the menu item
        black2.setOnAction(e -> {
            // set the font color to black
            nameLabel.setTextFill(Color.BLACK);
            ageLabel.setTextFill(Color.BLACK);
            breedLabel.setTextFill(Color.BLACK);
            colorLabel.setTextFill(Color.BLACK);
            furtypeLabel.setTextFill(Color.BLACK);
            weightLabel.setTextFill(Color.BLACK);
            spotsLabel.setTextFill(Color.BLACK);
            sexLabel.setTextFill(Color.BLACK);
        });
        // create a new menu item
        MenuItem brown2 = new MenuItem("Brown");
        // set the action of the menu item
        brown2.setOnAction(e -> {
            // set the font color to brown
            nameLabel.setTextFill(Color.BROWN);
            ageLabel.setTextFill(Color.BROWN);
            breedLabel.setTextFill(Color.BROWN);
            colorLabel.setTextFill(Color.BROWN);
            furtypeLabel.setTextFill(Color.BROWN);
            weightLabel.setTextFill(Color.BROWN);
            spotsLabel.setTextFill(Color.BROWN);
            sexLabel.setTextFill(Color.BROWN);
        });
        // add the menu items to the menu
        menu2.getItems().addAll(white2, black2, brown2);
        // add the menu to the file menu
        fileMenu.getItems().add(menu2);

        // Steps 4 and 5: Write an event listener and connect it to the component that
        // triggers the event
        // add a listener to the puppy button to change the labels to what is entered in the text fields
        puppyButton.setOnAction(e -> {
            if (nameField.getText().isEmpty() || ageField.getText().isEmpty() || breedField.getText().isEmpty()
                    || colorField.getText().isEmpty() || furtypeField.getText().isEmpty()
                    || weightField.getText().isEmpty() || spotsField.getText().isEmpty()
                    || sexField.getText().isEmpty()) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Dialog");
                alert.setHeaderText("Invalid Input");
                alert.setContentText("Please enter a value for all fields.");
                alert.showAndWait();
            } else {
            // store the input from the text fields in a new puppy object
            Puppy textPuppy = new Puppy(nameField.getText(), Integer.parseInt(ageField.getText()),
                    breedField.getText(), colorField.getText(), furtypeField.getText(), null,
                    Double.parseDouble(weightField.getText()), Boolean.parseBoolean(spotsField.getText()),
                    sexField.getText());
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
            // set the puppy weight label to the weight field text and format it to 2
            // decimal places
            weightLabel.setText("Weight: " + String.format("%.2f", Double.parseDouble(weightField.getText())));
            // set the puppy spots label to the spots field text
            spotsLabel.setText("Spots: " + spotsField.getText());
            // set the puppy sex label to the sex field text
            sexLabel.setText("Sex: " + sexField.getText());
            // call the change puppy picture method to change the puppy picture based on the
            // text input
            changePuppyPicture(textPuppy);
            // print the puppy object to the console (for testing and debugging purposes)
            // System.out.println(textPuppy);
            // clear the text fields
            nameField.clear();
            ageField.clear();
            breedField.clear();
            colorField.clear();
            furtypeField.clear();
            weightField.clear();
            spotsField.clear();
            sexField.clear();
            }
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
            // set the puppy weight label to the new puppy weight and format it to 2 decimal
            weightLabel.setText("Weight: " + String.format("%.2f", newPuppy.getWeight()));
            // set the puppy spots label to the new puppy spots
            spotsLabel.setText("Spots: " + newPuppy.isSpots());
            // set the puppy sex label to the new puppy sex
            sexLabel.setText("Sex: " + newPuppy.getSex());
            // call the changePuppyPicture method to change the puppy picture
            changePuppyPicture(newPuppy);
        });

        // throw an exception if the user enters a non-integer value for the age and give them a message to enter an integer
        ageField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                ageField.setText(newValue.replaceAll("[^\\d]", ""));
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Dialog");
                alert.setHeaderText("Invalid Age");
                alert.setContentText("Please enter an integer for the age.");
                alert.showAndWait();
            }
        });

        // throw an exception if the user enters a non-numeric value for the weight and give them a message to enter a number
        weightField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                weightField.setText(newValue.replaceAll("[^\\d]", ""));
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Dialog");
                alert.setHeaderText("Invalid Weight");
                alert.setContentText("Please enter a number for the weight.");
                alert.showAndWait();
            }
        });

    }

    private void changePuppyPicture(Puppy puppy) {
        // Step 3: Add the ImageView attributes to the gridpane
        // remove the imagefrom the gridpane
        this.getChildren().remove(whitePuppyView);
        this.getChildren().remove(blackPuppyView);
        this.getChildren().remove(brownPuppyView);
        this.getChildren().remove(redPuppyView);
        // print the puppy color to the terminal (for testing and debugging purposes)
        // System.out.println(puppy.getColor());
        // add the white puppy view to the gridpane if the puppy color is white or White
        if (puppy.getColor().equals("white") || puppy.getColor().equals("White")) {
            this.add(whitePuppyView, 2, 0, 1, 10);
        }
        // add the black puppy view to the gridpane if the puppy color is black or Black
        if (puppy.getColor().equals("black") || puppy.getColor().equals("Black")) {
            this.add(blackPuppyView, 2, 0, 1, 10);
        }
        // add the brown puppy view to the gridpane if the puppy color is brown or Brown
        if (puppy.getColor().equals("brown") || puppy.getColor().equals("Brown")) {
            this.add(brownPuppyView, 2, 0, 1, 10);
        }
        // add the red puppy view to the gridpane if the puppy color is red or Red
        if (puppy.getColor().equals("red") || puppy.getColor().equals("Red")) {
            this.add(redPuppyView, 2, 0, 1, 10);
        }

    }

}
