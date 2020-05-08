import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        Group root = new Group();
        Scene scene = new Scene(root, 1100, 900);
        scene.setFill(Color.rgb(173,218,241));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Lab №3, var №17");
        primaryStage.setScene(scene);
        primaryStage.show();
        // bird body
        QuadCurve body5 = new QuadCurve(467,338,650,397,498,477);
        body5.setStrokeWidth(3);
        body5.setFill(Color.YELLOW);
        root.getChildren().add(body5);
        QuadCurve body6 = new QuadCurve(574,338,325,474,551,477);
        body6.setStrokeWidth(3);
        body6.setFill(Color.YELLOW);
        root.getChildren().add(body6);
        QuadCurve body7 = new QuadCurve(467,338,520,475,574,338);
        body7.setStrokeWidth(3);
        body7.setFill(Color.YELLOW);
        root.getChildren().add(body7);
        QuadCurve body = new QuadCurve(467,338,520,275,574,338);
        body.setStrokeWidth(3);
        body.setFill(Color.YELLOW);
        body.setStroke(Color.BLACK);
        root.getChildren().add(body);
        QuadCurve body2 = new QuadCurve(467,338,355,474,498,477);
        body2.setStrokeWidth(3);
        body2.setFill(Color.YELLOW);
        body2.setStroke(Color.BLACK);
        root.getChildren().add(body2);
        QuadCurve body3 = new QuadCurve(574,338,685,474,551,477);
        body3.setStrokeWidth(3);
        body3.setFill(Color.YELLOW);
        body3.setStroke(Color.BLACK);
        root.getChildren().add(body3);

        Line body4 = new Line(498,477,551,477);
        body4.setStrokeWidth(3);
        body4.setStroke(Color.BLACK);
        root.getChildren().add(body4);
        // stomach
        QuadCurve stomach = new QuadCurve(488,473,542,445,600,465);
        stomach.setStrokeWidth(3);
        stomach.setFill(Color.WHITE);
        stomach.setStroke(Color.WHITE);
        root.getChildren().add(stomach);
        QuadCurve stomach2 = new QuadCurve(488,473,566,479,600,464);
        stomach2.setStrokeWidth(3);
        stomach2.setFill(Color.WHITE);
        stomach2.setStroke(Color.WHITE);
        root.getChildren().add(stomach2);
        // hair
        QuadCurve hair = new QuadCurve(517,270,543,290,517,306);
        hair.setStrokeWidth(3);
        hair.setStroke(Color.BLACK);
        hair.setFill(Color.BLACK);
        root.getChildren().add(hair);
        QuadCurve hair2 = new QuadCurve(472,274,513,267,530,307);
        hair2.setStrokeWidth(3);
        hair2.setStroke(Color.BLACK);
        hair2.setFill(Color.BLACK);
        root.getChildren().add(hair2);
        QuadCurve hair3 = new QuadCurve(464,297,500,271,528,298);
        hair3.setStrokeWidth(3);
        hair3.setStroke(Color.BLACK);
        hair3.setFill(Color.BLACK);
        root.getChildren().add(hair3);
        QuadCurve hair4 = new QuadCurve(468,314,491,280,528,307);
        hair4.setStrokeWidth(3);
        hair4.setStroke(Color.BLACK);
        hair4.setFill(Color.BLACK);
        root.getChildren().add(hair4);
        //tail
        QuadCurve tail = new QuadCurve(398,362,400,400,430,390);
        tail.setStrokeWidth(3);
        tail.setStroke(Color.BLACK);
        tail.setFill(Color.BLACK);
        root.getChildren().add(tail);
        QuadCurve tail2 = new QuadCurve(364,359,385,409,430,390);
        tail2.setStrokeWidth(3);
        tail2.setStroke(Color.BLACK);
        tail2.setFill(Color.BLACK);
        root.getChildren().add(tail2);
        QuadCurve tail3 = new QuadCurve(369,401,404,420,430,390);
        tail3.setStrokeWidth(3);
        tail3.setStroke(Color.BLACK);
        tail3.setFill(Color.BLACK);
        root.getChildren().add(tail3);
        // eyes
        Circle leftEye = new Circle(519,404,17);
        leftEye.setStrokeWidth(2);
        leftEye.setStroke(Color.BLACK);
        leftEye.setFill(Color.WHITE);
        root.getChildren().add(leftEye);
        Circle rightEye = new Circle(591,407,16);
        rightEye.setStrokeWidth(2);
        rightEye.setStroke(Color.BLACK);
        rightEye.setFill(Color.WHITE);
        root.getChildren().add(rightEye);
        Circle leftEye2 = new Circle(526,404,4);
        leftEye2.setStrokeWidth(2);
        leftEye2.setStroke(Color.BLACK);
        leftEye2.setFill(Color.BLACK);
        root.getChildren().add(leftEye2);
        Circle rightEye2 = new Circle(598,407,4);
        rightEye2.setStrokeWidth(2);
        rightEye2.setStroke(Color.BLACK);
        rightEye2.setFill(Color.BLACK);
        root.getChildren().add(rightEye2);


        //beak
        QuadCurve beak = new QuadCurve(533,435,546,387,617,433);
        beak.setStrokeWidth(2);
        beak.setStroke(Color.BLACK);
        beak.setFill(Color.rgb(243,182,28));
        root.getChildren().add(beak);
        QuadCurve beak2 = new QuadCurve(533,435,545,418,590,433);
        beak2.setStrokeWidth(1);
        beak2.setStroke(Color.BLACK);
        beak2.setFill(Color.rgb(243,182,28));
        root.getChildren().add(beak2);
        QuadCurve beak3 = new QuadCurve(533,435,548,473,590,433);
        beak3.setStrokeWidth(2);
        beak3.setStroke(Color.BLACK);
        beak3.setFill(Color.rgb(243,182,28));
        root.getChildren().add(beak3);
        Line beak4 = new Line(590,433,617,433);
        beak4.setStrokeWidth(2);
        beak4.setStroke(Color.BLACK);
        root.getChildren().add(beak4);
        //eyebrow 574 401
        Line leftEyebrow = new Line(541,397,485,382);
        leftEyebrow.setStrokeWidth(8);
        leftEyebrow.setStroke(Color.rgb(181,54,1));
        root.getChildren().add(leftEyebrow);
        Line leftEyebrow2 = new Line(541,397,487,377);
        leftEyebrow2.setStrokeWidth(8);
        leftEyebrow2.setStroke(Color.rgb(181,54,1));
        root.getChildren().add(leftEyebrow2);
        Line rightEyebrow = new Line(574,401,620,383);
        rightEyebrow.setStrokeWidth(8);
        rightEyebrow.setStroke(Color.rgb(181,54,1));
        root.getChildren().add(rightEyebrow);
        Line rightEyebrow2 = new Line(574,401,617,377);
        rightEyebrow2.setStrokeWidth(8);
        rightEyebrow2.setStroke(Color.rgb(181,54,1));
        root.getChildren().add(rightEyebrow2);
        // flare
        QuadCurve flare = new QuadCurve(533,314,545,336,568,350);
        flare.setStrokeWidth(2);
        flare.setStroke(Color.WHITE);
        flare.setFill(Color.WHITE);
        root.getChildren().add(flare);
        QuadCurve flare2 = new QuadCurve(533,314,558,328,568,350);
        flare2.setStrokeWidth(1);
        flare2.setStroke(Color.WHITE);
        flare2.setFill(Color.WHITE);
        root.getChildren().add(flare2);





        // Animation
        /*int cycleCount = 1;
        int time = 2000;

        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(time), root);
        scaleTransition.setToX(2);
        scaleTransition.setToY(2);
        scaleTransition.setAutoReverse(true);

        RotateTransition rotateTransition = new RotateTransition(Duration.millis(time), root);
        rotateTransition.setByAngle(360f);
        rotateTransition.setCycleCount(cycleCount);
        rotateTransition.setAutoReverse(true);

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(time), root);
        translateTransition.setFromX(150);
        translateTransition.setToX(50);
        translateTransition.setCycleCount(cycleCount + 1);
        translateTransition.setAutoReverse(true);

        TranslateTransition translateTransition2 = new TranslateTransition(Duration.millis(time), root);
        translateTransition2.setFromX(50);
        translateTransition2.setToX(150);
        translateTransition2.setCycleCount(cycleCount + 1);
        translateTransition2.setAutoReverse(true);

        ScaleTransition scaleTransition2 = new ScaleTransition(Duration.millis(time), root);
        scaleTransition2.setToX(0.5);
        scaleTransition2.setToY(0.5);
        scaleTransition2.setCycleCount(cycleCount);
        scaleTransition2.setAutoReverse(true);

        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(
                scaleTransition,
                scaleTransition2,
                translateTransition2,
                rotateTransition
        );
        parallelTransition.setCycleCount(Timeline.INDEFINITE);
        parallelTransition.play();


        primaryStage.setResizable(false);
        primaryStage.setTitle("Lab №3, var №17");
        primaryStage.setScene(scene);
        primaryStage.show();*/
    }


}
