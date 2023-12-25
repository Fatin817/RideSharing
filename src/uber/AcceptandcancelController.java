/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Tamim
 */
public class AcceptandcancelController implements Initializable {

    @FXML
    private TextArea areafield;
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
         Parent root = FXMLLoader.load(getClass().getResource("Driver.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void loadfile(ActionEvent event) {
        
           File f = null;
        
        Scanner sc; String str; String[] tokens;
        try {
            f = new File("Make A Ride.txt");
            sc = new Scanner(f);
            if(f.exists()){
     
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    areafield.appendText(
                            "pickupPoint="+tokens[0]
                            +", DropOffPoint="+tokens[1]
                            +", CarType="+tokens[2]
                            +"SORRY CAN'T CANCEL ANY DATA"+"\n"                    
                    );
                }
            }
          
        } 
        catch (IOException ex) {
            Logger.getLogger(CancelrideController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
        }
        
        
       Alert a = new  Alert (Alert.AlertType.INFORMATION);
        a.setContentText("SORRY CAN'T CANCEL ANY DATA");
        a.showAndWait();

    }
    
    @FXML
    private void save(ActionEvent event) {
        
        
    }
    
}
