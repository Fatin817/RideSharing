/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Tamim
 */
public class RevenuepiechartController implements Initializable {

    @FXML
    private PieChart piechart;
    @FXML private Label statusLabel;
    private Scene scene;
    private Stage stage;
    private Parent root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadit(ActionEvent event) {
                ObservableList <PieChart.Data> list = FXCollections.observableArrayList(
            new PieChart.Data("January",20000),
            new PieChart.Data("February",25000),
            new PieChart.Data("March",40000),
            new PieChart.Data("Aprril",15000),
            new PieChart.Data("May",15000),
            new PieChart.Data("June",20000),
            new PieChart.Data("July",10000),
            new PieChart.Data("August",35000),
            new PieChart.Data("September",50000),
            new PieChart.Data("October",15000),
            new PieChart.Data("November",30000),
            new PieChart.Data("December",45000)
        );
        
        piechart.setData(list);
        
        for(PieChart.Data data: piechart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    statusLabel.setText(String.valueOf(data.getPieValue()));
                    
                }
            }
            );
        }
        
        
    }
        
         
    

    @FXML
    private void close(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Maneger.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        
    }
    
}
