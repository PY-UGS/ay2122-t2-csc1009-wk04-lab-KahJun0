import java.lang.Math;

public class BMI {
    private double weightInPounds;
    private double heightInInches;

    public BMI(double weight, double height) {
        this.weightInPounds = weight;
        this.heightInInches = height;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }

    public double getWeightInKilos(double weight){
        return weight*0.45359237;
    }

    public double getHeightInMetres(double height){
        return height*0.0254;
    }

    public String getBMIRating(){
        double BMI = this.getBMI();
        if (BMI < 18.5){
            return "Underweight";
        }
        else if (BMI < 25.0){
            return "Normal";
        }
        else if (BMI < 30.0){
            return "Overweight";
        }
        else {
            return "Obese";
        }
    }

    public double getBMI(){
        return (getWeightInKilos(this.weightInPounds)/Math.pow(getHeightInMetres(this.heightInInches), 2));
    }
}
