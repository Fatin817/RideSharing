/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import Information.Vehiclecost;
import Information.offer;
import Information.ride;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Tamim
 */
public class VEHICLECOSTController implements Initializable {

    @FXML
    private TextField usertext;
    @FXML
    private TextField drivertext;
    @FXML
    private TextField costpermeter;
    @FXML
    private ChoiceBox<String> cartype;
    @FXML
    private ChoiceBox<String> status;
    @FXML
    private TableView<Vehiclecost> wholetable;
    @FXML
    private TableColumn<Vehiclecost, String> table1;
    @FXML
    private TableColumn<Vehiclecost, String> table2;
    @FXML
    private TableColumn<Vehiclecost, String> table3;
    @FXML
    private TableColumn<Vehiclecost, String> table4;
    @FXML
    private TableColumn<Vehiclecost, String> table5;
    private ArrayList<Vehiclecost> ridecost = new ArrayList<Vehiclecost>();
    private Scene scene;
    private Stage stage;
    private Parent root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        status.getItems().addAll("Active","Inactive");
       cartype.getItems().addAll("Uber car","Uber moto","Rental car","CNG","Intercity car");
       table1.setCellValueFactory(new PropertyValueFactory<Vehiclecost,String>("UserName"));
        table2.setCellValueFactory(new PropertyValueFactory<Vehiclecost,String>("DriverName"));
        table3.setCellValueFactory(new PropertyValueFactory<Vehiclecost,String>("cartype"));
        table4.setCellValueFactory(new PropertyValueFactory<Vehiclecost,String>("CostPerMeter"));
        table5.setCellValueFactory(new PropertyValueFactory<Vehiclecost,String>("status"));
     
      wholetable.setItems(getCost()); 
        // TODO
    }  
     public ObservableList<Vehiclecost> getCost(){
        ObservableList<Vehiclecost> Cost = FXCollections.observableArrayList();
        return Cost;
    } 

    @FXML
    private void close(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void savebutton(ActionEvent event) {
        
          Vehiclecost newr = new Vehiclecost(usertext.getText(),
                                       drivertext.getText(),
                                       costpermeter.getText(),
                 cartype.getValue(),
                  status.getValue()
                                    );
        wholetable.getItems().add(newr);
        
        ridecost.add(
                new Vehiclecost(
                       usertext.getText(),
                                       drivertext.getText(),
                                       costpermeter.getText(),
                 cartype.getValue(),
                  status.getValue()
                )
        );
    
          try {
            FileWriter fw = new FileWriter("Vehicle Cost.txt");
            Writer out = new BufferedWriter(fw);
            for(Vehiclecost s: ridecost){
                out.write(s.toString() + "\n");
               
            }
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(VEHICLECOSTController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
