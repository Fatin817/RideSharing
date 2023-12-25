/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.in;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Tamim
 */
public class LoginController implements Initializable {

    String name,name2,pass2, pass,type,type2;
    boolean eof=false;
    @FXML
    private TextField text;
    /*@FXML
    private Button button1;
    @FXML
    private Button button2;*/
    @FXML
    private ChoiceBox<String> usertype;
    @FXML
    private PasswordField passtext;
    private Scene scene;
    private Stage stage;
    private Parent root;
     
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      usertype.getItems().addAll("Passenger","Driver","HR","Admin","Maneger");
    }    

    @FXML
    private void enter(ActionEvent event) throws IOException {
        FileInputStream filein =new FileInputStream("signup.bin");
        DataInputStream ou = new DataInputStream(filein) ;
        
        name2 = text.getText();
        pass2 = passtext.getText();
        type2= usertype.getValue();
        while(!eof){
        name= ou.readUTF();
        pass= ou.readUTF();
        type= ou.readUTF();
        if(name2.equals(name) && pass2.equals(pass) && type2.equals(type))
        {
          if(type2.equals("Passenger")){
        Parent root = FXMLLoader.load(getClass().getResource("Passenger.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
          }
            
            else if(type2.equals("HR")){
            Parent root = FXMLLoader.load(getClass().getResource("HR.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                
            }
          else if(type2.equals("Driver")){
            Parent root = FXMLLoader.load(getClass().getResource("Driver.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                
            }
           else if(type2.equals("Admin")){
            Parent root = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                
            }
          else if(type2.equals("Maneger")){
            Parent root = FXMLLoader.load(getClass().getResource("Maneger.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                
            }
        }
        
        }
        }
        
                
        
         @FXML
    private void add(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sign up.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
}
}

