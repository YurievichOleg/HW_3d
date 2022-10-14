import java.util.ArrayList;

public class ModelStore {
    ArrayList<PoligonalModel> models;
    ArrayList<Scene> scenes;
    ArrayList<Flash> flashes;
    ArrayList<Camera> cameras;

    ImodelChangedObserver changedObserver;

    public ModelStore(ArrayList<PoligonalModel> models, ArrayList<Scene> scenes,
                      ArrayList<Flash> flashes, ArrayList<Camera> cameras ){
        this.models = models;
        this.scenes = scenes;
        this.flashes =flashes;
        this.cameras = cameras;
    }

    public Scene GetScene(int num){
        if (scenes.size() > num) {
            return scenes.get(num);
        } else if (scenes.isEmpty()) {
            scenes.add( new Scene());
            return  scenes.get(0);
        } else {
            return  scenes.get(0);
        }
    }

    public void NotifeChange(ImodelChanger changer){

    }


}
