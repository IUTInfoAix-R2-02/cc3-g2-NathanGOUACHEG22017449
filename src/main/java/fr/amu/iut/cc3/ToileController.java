package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;

    @FXML
    private Label error;

    @FXML
    private Circle p1;
    @FXML
    private Circle p2;
    @FXML
    private Circle p3;
    @FXML
    private Circle p4;
    @FXML
    private Circle p5;
    @FXML
    private Circle p6;

    @FXML
    TextField t1;
    @FXML
    TextField t2;
    @FXML
    TextField t3;
    @FXML
    TextField t4;
    @FXML
    TextField t5;
    @FXML
    TextField t6;

    @FXML
    private void click1() {
        String texte = t1.getText();
        p1.setLayoutX(getXRadarChart(Double.valueOf(texte), 1));
        p1.setLayoutY(getYRadarChart(Double.valueOf(texte), 1));
        p1.setOpacity(1);
    }

    @FXML
    private void click2() {
        String texte = t2.getText();
        p2.setLayoutX(getXRadarChart(Double.valueOf(texte), 2));
        p2.setLayoutY(getYRadarChart(Double.valueOf(texte), 2));
        p2.setOpacity(1);
    }

    @FXML
    private void click3() {
        String texte = t3.getText();
        p3.setLayoutX(getXRadarChart(Double.valueOf(texte), 3));
        p3.setLayoutY(getYRadarChart(Double.valueOf(texte), 3));
        p3.setOpacity(1);
    }

    @FXML
    private void click4() {
        String texte = t4.getText();
        p4.setLayoutX(getXRadarChart(Double.valueOf(texte), 4));
        p4.setLayoutY(getYRadarChart(Double.valueOf(texte), 4));
        p4.setOpacity(1);
    }

    @FXML
    private void click5() {
        String texte = t5.getText();
        p5.setLayoutX(getXRadarChart(Double.valueOf(texte), 5));
        p5.setLayoutY(getYRadarChart(Double.valueOf(texte), 5));
        p5.setOpacity(1);
    }

    @FXML
    private void click6() {
        String texte = t6.getText();
        p6.setLayoutX(getXRadarChart(Double.valueOf(texte), 6));
        p6.setLayoutY(getYRadarChart(Double.valueOf(texte), 6));
        p6.setOpacity(1);
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }



}
