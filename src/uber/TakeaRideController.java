/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import Information.ride;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Tamim
 */
public class TakeaRideController implements Initializable {

    @FXML
    private TextField pickuptext;
    @FXML
    private TextField dropofftext;
    @FXML
    private ChoiceBox<String> cartype;
    @FXML
    private TableView<ride> tableviiew;
    @FXML
    private TableColumn<ride, String> strat;
    @FXML
    private TableColumn<ride, String> stop;
    @FXML
    private TableColumn<ride, String> car;
    @FXML
    private TextArea TextArea;
    private Scene scene;
    private Stage stage;
    private Parent root;
    private ArrayList<ride> rideList = new ArrayList<ride>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cartype.getItems().addAll("Uber car","Uber moto","Rental car","CNG","Intercity car");
         strat.setCellValueFactory(new PropertyValueFactory<ride,String>("startt"));
        stop.setCellValueFactory(new PropertyValueFactory<ride,String>("drop"));
        car.setCellValueFactory(new PropertyValueFactory<ride,String>("carr"));
        
        
        tableviiew.setItems(getRide()); 
      
    } 
     public ObservableList<ride> getRide(){
        ObservableList<ride> Ride = FXCollections.observableArrayList();
        return Ride;
    } 
       

    @FXML
    private void SaveAndShowInTable(ActionEvent event) {
        
       ride newr = new ride(pickuptext.getText(),
                                       dropofftext.getText(),
                                       cartype.getValue()
                                    );
        tableviiew.getItems().add(newr);
        
        rideList.add(
                new ride(
                        pickuptext.getText(),
                        dropofftext.getText(),
                        cartype.getValue()
                )
        );
       
          try {
            FileWriter fw = new FileWriter("Make A Ride.txt");
            Writer out = new BufferedWriter(fw);
            for(ride s: rideList){
                out.write(s.toString() + "\n");
               
            }
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(TakeaRideController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
        
         Parent root = FXMLLoader.load(getClass().getResource("Passenger.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void cancel(ActionEvent event) {
        
        ObservableList<ride> selectedRows, allPeople;
        allPeople = tableviiew.getItems();
        selectedRows = tableviiew.getSelectionModel().getSelectedItems();
        
        for(ride p: selectedRows){
            allPeople.remove(p);
        }
    }

    @FXML
    private void loadnumber(ActionEvent event) {
        
           File f = null;
        
        Scanner sc; String str; String[] tokens;
        try {
            f = new File("Make A Ride.txt");
            sc = new Scanner(f);
            if(f.exists()){
     
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    TextArea.appendText(
                            "pickupPoint="+tokens[0]
                            +", DropOffPoint="+tokens[1]
                            +", CarType="+tokens[2]
                            +"\n"                    
                    );
                }
            }
          
        } 
        catch (IOException ex) {
            Logger.getLogger(CancelrideController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
        }
        
    }
    
}
