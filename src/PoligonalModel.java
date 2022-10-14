import java.util.ArrayList;

public class PoligonalModel {
    ArrayList <Poligon> poligons;
    ArrayList <Texture> textures;

    public PoligonalModel(ArrayList <Poligon> poligons, ArrayList <Texture> textures){
        this.poligons =poligons;
        this.textures = textures;
    }

    public PoligonalModel(){
        poligons = new ArrayList<>();
        textures = new ArrayList<>();
    }
}
