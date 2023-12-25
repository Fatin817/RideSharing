/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;


import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Tamim
 */
public class AddDriverController implements Initializable {

    @FXML
    private TextField firsttext;
    @FXML
    private TextField lasttext;
    @FXML
    private TextField emailtext;
    @FXML
    private TextField number;
    @FXML
    private TextField address;
    @FXML
    private TextField carmodel;
    @FXML
    private TextField carnumberplate;
    @FXML
    private TextField drivinglicense;
    @FXML
    private ChoiceBox<String> type;
    @FXML
    private ChoiceBox<String> usertype;
     private Scene scene;
    private Stage stage;
    private Parent root;
    /**

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     usertype.getItems().addAll("Driver");
       type.getItems().addAll("Uber car","Uber moto","Rental car","CNG","Intercity car");
    }    

    @FXML
    private void close(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("HR.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void save(ActionEvent event) {
        
      File f = null;
        FileOutputStream fo = null;
        DataOutputStream d = null;
        
        try {
            f = new  File ("NewDriver.bin");
            if (f.exists()){ fo = new FileOutputStream(f,true);}
            else {fo = new FileOutputStream(f);}
            d = new DataOutputStream(fo);
           d.writeUTF(firsttext.getText());
            d.writeUTF(lasttext.getText());
            d.writeUTF(emailtext.getText());
            d.writeInt(Integer.parseInt(number.getText()));
          d.writeUTF(address.getText());
          d.writeUTF(carmodel.getText());
          d.writeUTF(carnumberplate.getText());
          d.writeUTF(drivinglicense.getText());
          d.writeUTF(type.getValue());
            d.writeUTF(usertype.getValue());
            
        }
        catch(IOException e){
             Logger.getLogger(AddDriverController.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                if(d!= null) {d.close();}
            } catch (IOException e) {
                Logger.getLogger(AddDriverController.class.getName()).log(Level.SEVERE, null, e);
            }
           
        }
         Alert a = new  Alert (Alert.AlertType.INFORMATION);
        a.setContentText("Add successful");
        a.showAndWait();
        firsttext.clear();
        lasttext.clear();
        emailtext.clear();
        number.clear();
        address.clear();
        carmodel.clear();
        carnumberplate.clear();
        drivinglicense.clear();
    }
    
}