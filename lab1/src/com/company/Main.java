package com.company;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.*;

public class Main extends Application{

    public static void main(String[] args) {
        Application.launch(args);
    }
    public void start(Stage stage) {
        Group root = new Group();

        Scene scene = new Scene(root, 1100, 900,Color.rgb(255,255,129));
        ///
        Polygon shipFeed = new Polygon(133,562, 327,768, 757,768, 922,563,700,640,350,640,133,562);//133,562, 327,768, 757,768, 922,563, 400,563, 359,563

        root.getChildren().add(shipFeed);
        shipFeed.setFill(Color.rgb(128, 64, 0));
        Rectangle mast = new Rectangle(550,542,20,100);
        root.getChildren().add(mast);
        Polygon sail = new Polygon(378, 442, 405, 525,680, 560,610,435,662,270,452,260);
        sail.setFill(Color.rgb(192,192,192));
        root.getChildren().add(sail);
        //////
        stage.setScene(scene);
        stage.setTitle("Lab1");
        stage.show();
    }
}
