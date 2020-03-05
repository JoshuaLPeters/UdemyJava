package ClassPractice;


// public -  access modifier
// class is a blueprint

//Car is the Super class
public class Car {

    // state of the car defined by fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    // setter
    public void setModel(String model){
        String validModel = model.toLowerCase();
        // validates our model with tests
        if(validModel.equals("porsche") || validModel.equals("commodore")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
    // getter
    public String getModel(){
        return this.model;
    }

}
