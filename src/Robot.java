public class Robot {

    private MecanumWheel frontRight;
    private MecanumWheel frontLeft;
    private MecanumWheel backLeft;
    private MecanumWheel backRight;

    public Robot(){
        frontRight = new MecanumWheel(3.0 * Math.PI / 4.0, 0);
        frontLeft = new MecanumWheel(Math.PI / 4.0, 0);
        backLeft = new MecanumWheel(3.0 * Math.PI / 4.0, 0);
        backRight = new MecanumWheel(Math.PI / 4.0, 0);
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

    public double[] getTotalXY(){
        double sumx = frontRight.getX() + frontLeft.getX() + backLeft.getX() + backRight.getX();
        double sumy = frontRight.getY() + frontLeft.getY() + backLeft.getY() + backRight.getY();
        double[] sum = {sumx, sumy};
        return sum;
    }

}
