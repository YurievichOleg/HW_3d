import java.util.ArrayList;

public class Scene {
    static int id = 0;
    ArrayList <PoligonalModel> models;
    ArrayList <Flash> flashes;
    public Scene(){
        models = new ArrayList<>();
        flashes = new ArrayList<>();
        id ++;
    }

    public void addModels(PoligonalModel model){
        models.add(model);
    }

    public void addFlash(Flash flash){
        flashes.add(flash);
    }
}
