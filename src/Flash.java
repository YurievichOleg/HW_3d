import java.awt.*;

public class Flash {
    Location location;
    Angle angle;
    Color color;
    Power pow;
    public Flash(Location location, Angle angle, Color color, Power pow){
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.pow = pow;
    }

    public void Rotate(int rotate){
        this.angle.angle = rotate;
    }

    public void Move(int x, int y, int z){
        this.location.location.x = x;
        this.location.location.y = y;
        this.location.location.z = z;

    }
}
