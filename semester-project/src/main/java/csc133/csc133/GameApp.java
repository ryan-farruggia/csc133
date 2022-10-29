package csc133.csc133;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class GameApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 800);

        Rectangle background = new Rectangle(500, 800);
        background.setFill(Color.BLACK);

        Rectangle helipadrect = new Rectangle(100, 100);
        helipadrect.setStroke(Color.WHITE);
        helipadrect.setFill(Color.rgb(19,19,19));
        helipadrect.setStrokeWidth(2);

        Circle helipadcircle = new Circle(40);
        helipadcircle.setStroke(Color.WHITE);
        helipadcircle.setFill(Color.rgb(51,51,51));
        helipadcircle.setStrokeWidth(2);

        Label helipadlabel = new Label("H");
        helipadlabel.setFont(Font.font("Impact", 40));
        helipadlabel.setTextFill(Color.YELLOW);

        Circle helicoptercircle = new Circle(15);
        helicoptercircle.setFill(Color.LIMEGREEN);

        Line helicopterline = new Line();
        helicopterline.setStartX(0);
        helicopterline.setStartY(0);
        helicopterline.setEndX(0);
        helicopterline.setEndY(-40);
        helicopterline.setStroke(Color.LIMEGREEN);
        helicopterline.setStrokeWidth(2);

        Label helicopterlabel = new Label("F:25000");
        helicopterlabel.setFont(Font.font("Courier New", 20));
        helicopterlabel.setTextFill(Color.YELLOW);
        helicopterlabel.setTranslateX(-40);
        helicopterlabel.setTranslateY(20);

        Group helicopter = new Group(helicoptercircle, helicopterline, helicopterlabel);
        helicopter.setTranslateX(250);
        helicopter.setTranslateY(600);

        StackPane helipad = new StackPane();
        helipad.setTranslateX(200);
        helipad.setTranslateY(690);
        helipad.getChildren().addAll(helipadrect, helipadcircle, helipadlabel);

        Circle cloud = new Circle(40);
        cloud.setFill(Color.WHITE);

        Label cloudlabel = new Label("10%");
        cloudlabel.setFont(Font.font("Courier New", FontWeight.BOLD, 20));
        cloudlabel.setTextFill(Color.BLUE);
        cloudlabel.setTranslateX(-16);
        cloudlabel.setTranslateY(-10);

        Circle pond = new Circle(25);
        pond.setFill(Color.BLUE);

        Label pondlabel = new Label("28%");
        pondlabel.setFont(Font.font("Courier New", FontWeight.BOLD, 20));
        pondlabel.setTextFill(Color.WHITE);
        pondlabel.setTranslateX(-16);
        pondlabel.setTranslateY(-10);

        Group cloudgroup = new Group(cloud, cloudlabel);
        cloudgroup.setTranslateX(300);
        cloudgroup.setTranslateY(300);

        Group pondgroup = new Group(pond, pondlabel);
        pondgroup.setTranslateX(120);
        pondgroup.setTranslateY(200);

        root.getChildren().addAll(background, helipad, helicopter, cloudgroup, pondgroup);
        stage.setTitle("RainMaker!");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}