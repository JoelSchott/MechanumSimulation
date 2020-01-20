public class Robot {

    private MecanumWheel frontRight;
    private MecanumWheel frontLeft;
    private MecanumWheel backLeft;
    private MecanumWheel backRight;

    public Robot(){
        frontRight = new MecanumWheel(3.0 * Math.PI / 4.0, 1);
        frontLeft = new MecanumWheel(Math.PI / 4.0, 1);
        backLeft = new MecanumWheel(3.0 * Math.PI / 4.0, 1);
        backRight = new MecanumWheel(Math.PI / 4.0, 1);
    }

    public void setFrontRightMagnitude(double m){
        frontRight.setMagnitude(m);
    }
    public void setFrontLeftMagnitude(double m){
        frontLeft.setMagnitude(m);
    }
    public void setBackLeftMagnitude(double m){
        backLeft.setMagnitude(m);
    }
    public void setBackRightMagnitude(double m){
        backRight.setMagnitude(m);
    }
    public double getFrontRightX(){
        return frontRight.getX();
    }
    public double getFrontRightY(){
        return frontRight.getY();
    }
    public double getFrontLeftX(){
        return frontLeft.getX();
    }
    public double getFrontLeftY(){
        return frontLeft.getY();
    }
    public double getBackLeftX(){
        return backLeft.getX();
    }
    public double getBackLeftY(){
        return backLeft.getY();
    }
    public double getBackRightX(){
        return backRight.getX();
    }
    public double getBackRightY(){
        return backRight.getY();
    }

    public double[] getTotalXY(){
        double sumx = frontRight.getX() + frontLeft.getX() + backLeft.getX() + backRight.getX();
        double sumy = frontRight.getY() + frontLeft.getY() + backLeft.getY() + backRight.getY();
        return new double[] {sumx, sumy};
    }

}
