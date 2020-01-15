public class MecanumWheel {

    private double angle;
    private double magnitude;

    public MecanumWheel(double a, double m){
        angle = a;
        magnitude = m;
    }

    public void setMagnitude(double m){
        magnitude = m;
    }

    public double getAngle(){
        return angle;
    }
    public double getMagnitude(){
        return magnitude;
    }
    public double getX(){
        return Math.cos(angle) * magnitude;
    }
    public double getY(){
        return Math.sin(angle) * magnitude;
    }
}
