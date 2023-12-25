/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import Information.offer;
import Information.ride;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
public class PromocodeController implements Initializable {

    @FXML
    private TextField promotext;
    @FXML
    private TextField valutext;
    @FXML
    private TextField extext;
    @FXML
    private TextField usetext;
    @FXML
    private TableView<offer> tabel2view;
    @FXML
    private TableColumn<offer, String> promocode;
    @FXML
    private TableColumn<offer, String> value;
    @FXML
    private TableColumn<offer, String> exdate;
    @FXML
    private TableColumn<offer, String> totallimiit;
      private Scene scene;
    private Stage stage;
    private Parent root;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         promocode.setCellValueFactory(new PropertyValueFactory<offer,String>("codee"));
        value.setCellValueFactory(new PropertyValueFactory<offer,String>("valuee"));
        exdate.setCellValueFactory(new PropertyValueFactory<offer,String>("exdatee"));
        totallimiit.setCellValueFactory(new PropertyValueFactory<offer,String>("usee"));
        
       
        tabel2view.setItems(getCode()); 
        // TODO
    }  
     public ObservableList<offer> getCode(){
        ObservableList<offer> Code = FXCollections.observableArrayList();
        return Code;
    } 
       

    @FXML
    private void save(ActionEvent event) {
         offer newr = new offer(promotext.getText(),
                                       valutext.getText(),
                                       extext.getText(),
                 usetext.getText()
                                    );
        tabel2view.getItems().add(newr);
        
    }

    @FXML
    private void close(ActionEvent event) throws IOException {
        
         Parent root = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
}
