
import com.sun.javafx.tk.Toolkit;
import java.sql.Time;
import java.util.ArrayList;
import javax.swing.*;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Lighting;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.AnimationTimer;

//public class FXapplication extends JPanel {
//    
//Time t = new Timer(5, this);
//    
//    
//
//
//}
public class FXapplication extends Application {

    ArrayList<Circle> circle = new ArrayList();
    ArrayList<Rectangle> rectangle = new ArrayList();
    ArrayList<Line> line = new ArrayList();

    public FXapplication(ArrayList<Circle> Circle, ArrayList<Rectangle> rect, ArrayList<Line> line) {
        this.circle = Circle;
        this.rectangle = rect;
        this.line = line;
    }

    
    
    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {

        Pane root = new Pane();

        for (Rectangle bruh : rectangle) {

        }

        //////////////////////////////////////////Rectangle rect = new Rectangle(20, 80, 60, 60); //x,y, x-size, y-size
        //rect.setEffect(new Lighting());
        // rect.setFill(Color.CADETBLUE);
        //Rectangle rect1 = new Rectangle(40, 200, 60, 60);
        //rect1.setFill(Color.LIGHTSALMON);
        Timeline timer = new Timeline();

        timer.setCycleCount(4); //number of cycles
        //timer.setAutoReverse(true);

        KeyValue kv = new KeyValue(rect.translateXProperty(), 200);
        KeyValue kh = new KeyValue(rect.translateYProperty(), -40);
        KeyFrame kfx = new KeyFrame(Duration.millis(1000), kv);
        KeyFrame kfy = new KeyFrame(Duration.millis(1000), kh);
        timer.getKeyFrames().addAll(kfx, kfy);

        timer.play();

        root.getChildren().addAll(rect, rect1);

        Scene scene = new Scene(root, 500, 500);

        stage.setTitle("Timeline");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

//    public void start() {
//
//    }
//
//    public void stop() {
//
//    }
//
//    public void handle(long time) {
//
//    }
//    AnimationTimer animationTimer = new AnimationTimer() {
//        long delta;
//        long lastFrameTime;
//
//        @Override
//        public void handle(long now) {
//            delta = now - lastFrameTime;
//            lastFrameTime = now;
//        }
//    };
//
//    public double getFrameRateHertz() {
//        double frameRate = 1d / deltaTimeNano;
//        return frameRate * 1e9;
//    }
}
