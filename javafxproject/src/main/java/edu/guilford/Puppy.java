package edu.guilford;

import java.text.DecimalFormat;
import java.util.Random;

public class Puppy {

    // attributes
    private String name;
    private int age;
    private String breed;
    private String color;
    private String furtype;
    private String size;
    private double weight;
    private boolean spots;
    private String sex;

    Random rand = new Random();

    // constructor
    public Puppy(String name, int age, String breed, String color, String furtype, String size, double weight,
            boolean spots, String sex) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.furtype = furtype;
        this.size = size;
        this.weight = weight;
        this.spots = spots;
        this.sex = sex;
    }

    // random constructor that sets the attributes to random values
    public Puppy() {
        this.age = rand.nextInt(10);
        this.weight = rand.nextDouble() * 100;
        this.spots = rand.nextBoolean();

        // generate a random integer between 0 and 8 to use as an index for the array
        // for the random name
        int nameChoice = rand.nextInt(8);
        if (nameChoice == 0) {
            name = "Lucky";
        } else if (nameChoice == 1) {
            name = "Buddy";
        } else if (nameChoice == 2) {
            name = "Charlie";
        } else if (nameChoice == 3) {
            name = "Rocky";
        } else if (nameChoice == 4) {
            name = "Bella";
        } else if (nameChoice == 5) {
            name = "Daisy";
        } else if (nameChoice == 6) {
            name = "Molly";
        } else if (nameChoice == 7) {
            name = "Sissy";
        }

        // generate a random integer between 0 and 10 to use as an index for the array
        // for the random breed
        int breedChoice = rand.nextInt(10);
        if (breedChoice == 0) {
            breed = "Beagle";
        } else if (breedChoice == 1) {
            breed = "Labrador";
        } else if (breedChoice == 2) {
            breed = "Yorkie";
        } else if (breedChoice == 3) {
            breed = "Husky";
        } else if (breedChoice == 4) {
            breed = "Chihuahua";
        } else if (breedChoice == 5) {
            breed = "Bulldog";
        } else if (breedChoice == 6) {
            breed = "German Sheperd";
        } else if (breedChoice == 7) {
            breed = "Pomeranian";
        } else if (breedChoice == 8) {
            breed = "Jack Russell";
        } else if (breedChoice == 9) {
            breed = "Poodle";
        }

        // generate a random integer between 0 and 4 to use as an index for the array
        // for the random color
        int colorChoice = rand.nextInt(4);
        if (colorChoice == 0) {
            color = "Black";
        } else if (colorChoice == 1) {
            color = "Brown";
        } else if (colorChoice == 2) {
            color = "White";
        } else if (colorChoice == 3) {
            color = "Red";
        }

        // generate a random integer between 0 and 2 to use as an index for the array
        // for the random furtype
        int furtypeChoice = rand.nextInt(2);
        if (furtypeChoice == 0) {
            furtype = "Short";
        } else if (furtypeChoice == 1) {
            furtype = "Long";
        }

        // generate a random integer between 0 and 2 to use as an index for the array
        // for the random size
        int sizeChoice = rand.nextInt(3);
        if (sizeChoice == 0) {
            size = "Small";
        } else if (sizeChoice == 1) {
            size = "Medium";
        } else if (sizeChoice == 2) {
            size = "Large";
        }

        // generate a random integer between 0 and 1 to use as an index for the array
        // for the random size
        int sexChoice = rand.nextInt(2);
        if (sexChoice == 0) {
            sex = "Female";
        } else if (sexChoice == 1) {
            sex = "Male";
        }

    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public String getFurtype() {
        return furtype;
    }

    public String getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isSpots() {
        return spots;
    }

    public String getSex() {
        return sex;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFurtype(String furtype) {
        this.furtype = furtype;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpots(boolean spots) {
        this.spots = spots;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    // methods
    public void bark() {
        System.out.println("Woof!");
    }

    public void eat() {
        System.out.println("Yum!");
    }

    public void cuddle() {
        System.out.println("Pet me!");
    }

    public void play() {
        System.out.println("Let's play!");
    }

    // write a method to help analyze weights of puppies
    public void weightAnalysis() {
        if (weight < 10) {
            System.out.println("This puppy is very small!");
        } else if (weight >= 10 && weight < 20) {
            System.out.println("This puppy is small!");
        } else if (weight >= 20 && weight < 40) {
            System.out.println("This puppy is medium!");
        } else if (weight >= 40 && weight < 60) {
            System.out.println("This puppy is large!");
        } else if (weight >= 60) {
            System.out.println("This puppy is very large!");
        }
    }

    // toString method
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return "Name: " + name + ", Age: " + age + ", Breed: " + breed + ", Color: " + color + ", Fur Type: " + furtype
                +
                ", Size: " + size + ", Weight: " + formatter.format(weight) + ", Spots: " + spots + ", Sex: " + sex;
    }

}
