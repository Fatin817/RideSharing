/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Tamim
 */
public class StatementlinechartController implements Initializable {

    @FXML
    private LineChart<String, Number> linechart;
     @FXML private Label label;
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
    private void close(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Maneger.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void loadchart(ActionEvent event) {
            linechart.getData().clear();
        XYChart.Series<String,Number> series1 = new XYChart.Series<String,Number>();
        series1.getData().add(new XYChart.Data<String,Number>("Sunday",20));
        series1.getData().add(new XYChart.Data<String,Number>("Monday",5));
        series1.getData().add(new XYChart.Data<String,Number>("Tuesday",3));
        series1.getData().add(new XYChart.Data<String,Number>("Wednesday",15));
        series1.getData().add(new XYChart.Data<String,Number>("Thursday",25));
        series1.getData().add(new XYChart.Data<String,Number>("Friday",30));
        series1.getData().add(new XYChart.Data<String,Number>("Saturday",17));
        series1.setName("Uber car");
        
        XYChart.Series<String,Number> series2 = new XYChart.Series<String,Number>();
        series2.getData().add(new XYChart.Data<String,Number>("Sunday",12));
        series2.getData().add(new XYChart.Data<String,Number>("Monday",15));
        series2.getData().add(new XYChart.Data<String,Number>("Tuesday",30));
        series2.getData().add(new XYChart.Data<String,Number>("Wednesday",10));
        series2.getData().add(new XYChart.Data<String,Number>("Thursday",27));
        series2.getData().add(new XYChart.Data<String,Number>("Friday",25));
        series2.getData().add(new XYChart.Data<String,Number>("Saturday",15));
        series2.setName("Uber moto");
        
        XYChart.Series<String,Number> series3 = new XYChart.Series<String,Number>();
       series3.getData().add(new XYChart.Data<String,Number>("Sunday",4));
        series3.getData().add(new XYChart.Data<String,Number>("Monday",6));
        series3.getData().add(new XYChart.Data<String,Number>("Tuesday",9));
        series3.getData().add(new XYChart.Data<String,Number>("Wednesday",1));
        series3.getData().add(new XYChart.Data<String,Number>("Thursday",3));
        series3.getData().add(new XYChart.Data<String,Number>("Friday",5));
        series3.getData().add(new XYChart.Data<String,Number>("Saturday",12));
        series3.setName("Rental car");
        
         XYChart.Series<String,Number> series4 = new XYChart.Series<String,Number>();
        series4.getData().add(new XYChart.Data<String,Number>("Sunday",10));
        series4.getData().add(new XYChart.Data<String,Number>("Monday",13));
        series4.getData().add(new XYChart.Data<String,Number>("Tuesday",15));
        series4.getData().add(new XYChart.Data<String,Number>("Wednesday",10));
        series4.getData().add(new XYChart.Data<String,Number>("Thursday",28));
        series4.getData().add(new XYChart.Data<String,Number>("Friday",7));
        series4.getData().add(new XYChart.Data<String,Number>("Saturday",2));
        series4.setName("CNG");
        
         XYChart.Series<String,Number> series5 = new XYChart.Series<String,Number>();
       series5.getData().add(new XYChart.Data<String,Number>("Sunday",19));
        series5.getData().add(new XYChart.Data<String,Number>("Monday",8));
        series5.getData().add(new XYChart.Data<String,Number>("Tuesday",2));
        series5.getData().add(new XYChart.Data<String,Number>("Wednesday",1));
        series5.getData().add(new XYChart.Data<String,Number>("Thursday",3));
        series5.getData().add(new XYChart.Data<String,Number>("Friday",4));
        series5.getData().add(new XYChart.Data<String,Number>("Saturday",1));
        series5.setName("Intercity car");
        
        linechart.getData().addAll(series1,series2,series3,series4,series5);
        
        for(XYChart.Data<String,Number> data: series1.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    label.setText("X: "+String.valueOf(data.getXValue())+"\nY: "+String.valueOf(data.getYValue()));
                    Tooltip.install(data.getNode(),new Tooltip("X: "+String.valueOf(data.getXValue())+"\nY: "+String.valueOf(data.getYValue())));
                    
                }
            }
            );
        }
        for(XYChart.Data<String,Number> data: series2.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    label.setText("X: "+String.valueOf(data.getXValue())+"\nY: "+String.valueOf(data.getYValue()));
                    Tooltip.install(data.getNode(),new Tooltip("X: "+String.valueOf(data.getXValue())+"\nY: "+String.valueOf(data.getYValue())));
                   
                }
            }
            );
        }
        for(XYChart.Data<String,Number> data: series3.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    label.setText("X: "+String.valueOf(data.getXValue())+"\nY: "+String.valueOf(data.getYValue()));
                    Tooltip.install(data.getNode(),new Tooltip("X: "+String.valueOf(data.getXValue())+"\nY: "+String.valueOf(data.getYValue())));
                 
                }
            }
            );
        }
        
         for(XYChart.Data<String,Number> data: series4.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    label.setText("X: "+String.valueOf(data.getXValue())+"\nY: "+String.valueOf(data.getYValue()));
                    Tooltip.install(data.getNode(),new Tooltip("X: "+String.valueOf(data.getXValue())+"\nY: "+String.valueOf(data.getYValue())));
                  
                }
            }
            );
        }
         
          for(XYChart.Data<String,Number> data: series5.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    label.setText("X: "+String.valueOf(data.getXValue())+"\nY: "+String.valueOf(data.getYValue()));
                    Tooltip.install(data.getNode(),new Tooltip("X: "+String.valueOf(data.getXValue())+"\nY: "+String.valueOf(data.getYValue())));
                    
                }
            }
            );
        }
        
        
    }
    
}
