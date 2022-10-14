public class Camera {
    Location location;
    Angle angle;

    public Camera(Location location, Angle angle){
        this.location = location;
        this.angle = angle;
    }
    public Camera(){
        this.location = new Location();
        this.angle = new Angle();
    }

    public void Rotate(int rotate){
        this.angle.angle = rotate;
    }

    public void Rotate(Angle angle3d){
        this.angle =angle3d;
    }


    public void Move(int x, int y, int z){
        this.location.location.x = x;
        this.location.location.y = y;
        this.location.location.z = z;

    }

    public void Move(Point point3d){
        this.location.location = point3d;
    }

}
