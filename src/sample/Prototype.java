package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Prototype extends Pane {
    public int x;
    public int y;
    public int height;
    public int width;

    public Prototype(int x, int y, int height, int width){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }
//    public createElem(){
//
//    }
//    public void setImage(Image url){
//        ImageView imageView = new ImageView(url);
//    }
}
