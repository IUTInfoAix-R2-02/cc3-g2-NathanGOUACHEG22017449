package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
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

    private IntegerProperty p1x;
    private IntegerProperty p1y;

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
    Line l1;
    @FXML
    Line l2;
    @FXML
    Line l3;
    @FXML
    Line l4;
    @FXML
    Line l5;
    @FXML
    Line l6;

    @FXML
    private void vider() {
        p1.setOpacity(0);
        p2.setOpacity(0);
        p3.setOpacity(0);
        p4.setOpacity(0);
        p5.setOpacity(0);
        p6.setOpacity(0);
        error.setText("");
        t1.clear();
        t2.clear();
        t3.clear();
        t4.clear();
        t5.clear();
        t6.clear();
        l1.setOpacity(0);
        l2.setOpacity(0);
        l3.setOpacity(0);
        l4.setOpacity(0);
        l5.setOpacity(0);
        l6.setOpacity(0);
    }

    @FXML
    private void tracer() {
        l1.setOpacity(1);
        l2.setOpacity(1);
        l3.setOpacity(1);
        l4.setOpacity(1);
        l5.setOpacity(1);
        l6.setOpacity(1);
    }

    @FXML
    private void click1() {
        String texte = t1.getText();
        double valeur = Double.valueOf(texte);
        
        if (valeur > 20) {
            error.setText("Erreur de saisie :\nles valeurs doivent être entre 0 et 20");
        }
        else {
            p1.setLayoutX(getXRadarChart(valeur, 1));
            p1.setLayoutY(getYRadarChart(valeur, 1));
            p1.setOpacity(1);
        }
    }

    @FXML
    private void click2() {
        String texte = t2.getText();
        double valeur = Double.valueOf(texte);

        if (valeur > 20) {
            error.setText("Erreur de saisie :\n les valeurs doivent être entre 0 et 20");
        }

        else {
            p2.setLayoutX(getXRadarChart(valeur, 2));
            p2.setLayoutY(getYRadarChart(valeur, 2));
            p2.setOpacity(1);
        }

    }

    @FXML
    private void click3() {
        String texte = t3.getText();
        double valeur = Double.valueOf(texte);

        if (valeur > 20) {
            error.setText("Erreur de saisie :\n les valeurs doivent être entre 0 et 20");
        }

        else {
            p3.setLayoutX(getXRadarChart(valeur, 3));
            p3.setLayoutY(getYRadarChart(valeur, 3));
            p3.setOpacity(1);
        }

    }

    @FXML
    private void click4() {
        String texte = t4.getText();
        double valeur = Double.valueOf(texte);

        if (valeur > 20) {
            error.setText("Erreur de saisie :\n les valeurs doivent être entre 0 et 20");
        }

        else {
            p4.setLayoutX(getXRadarChart(valeur, 4));
            p4.setLayoutY(getYRadarChart(valeur, 4));
            p4.setOpacity(1);
        }

    }

    @FXML
    private void click5() {
        String texte = t5.getText();
        double valeur = Double.valueOf(texte);

        if (valeur > 20) {
            error.setText("Erreur de saisie :\n les valeurs doivent être entre 0 et 20");
        }

        else {
            p5.setLayoutX(getXRadarChart(valeur, 5));
            p5.setLayoutY(getYRadarChart(valeur, 5));
            p5.setOpacity(1);
        }

    }

    @FXML
    private void click6() {
        String texte = t6.getText();
        double valeur = Double.valueOf(texte);

        if (valeur > 20) {
            error.setText("Erreur de saisie :\n les valeurs doivent être entre 0 et 20");
        }

        else {
            p6.setLayoutX(getXRadarChart(valeur, 6));
            p6.setLayoutY(getYRadarChart(valeur, 6));
            p6.setOpacity(1);
        }

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        l1.startXProperty().bind(p1.layoutXProperty());
        l1.startYProperty().bind(p1.layoutYProperty());
        l1.endXProperty().bind(p2.layoutXProperty());
        l1.endYProperty().bind(p2.layoutYProperty());

        l2.startXProperty().bind(p2.layoutXProperty());
        l2.startYProperty().bind(p2.layoutYProperty());
        l2.endXProperty().bind(p3.layoutXProperty());
        l2.endYProperty().bind(p3.layoutYProperty());

        l3.startXProperty().bind(p3.layoutXProperty());
        l3.startYProperty().bind(p3.layoutYProperty());
        l3.endXProperty().bind(p4.layoutXProperty());
        l3.endYProperty().bind(p4.layoutYProperty());

        l4.startXProperty().bind(p4.layoutXProperty());
        l4.startYProperty().bind(p4.layoutYProperty());
        l4.endXProperty().bind(p5.layoutXProperty());
        l4.endYProperty().bind(p5.layoutYProperty());

        l5.startXProperty().bind(p5.layoutXProperty());
        l5.startYProperty().bind(p5.layoutYProperty());
        l5.endXProperty().bind(p6.layoutXProperty());
        l5.endYProperty().bind(p6.layoutYProperty());

        l6.startXProperty().bind(p6.layoutXProperty());
        l6.startYProperty().bind(p6.layoutYProperty());
        l6.endXProperty().bind(p1.layoutXProperty());
        l6.endYProperty().bind(p1.layoutYProperty());
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
