package sample;


import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Mountaineer extends Pane {
    Image man1 = new Image(getClass().getResourceAsStream("/assets/man1.png"));
    Image man2 = new Image(getClass().getResourceAsStream("/assets/man2.png"));

    ImageView imageView = new ImageView(man1);
    int x= 15;
    int y= 15;
    int width= 300;
    int height= 300;
    public Mountaineer(){
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);
        imageView.setViewport(new Rectangle2D(x, y, width, height));
        getChildren().addAll(this.imageView);
    }



//    public Mountaineer(int x, int y, int height, int width) {
//        super(x, y, height, width);
//    }
}
