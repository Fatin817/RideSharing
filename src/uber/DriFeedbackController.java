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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Tamim
 */
public class DriFeedbackController implements Initializable {

    @FXML
    private TextArea feedarea;
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
    private void save(ActionEvent event) {
        
        File f = null;
        FileOutputStream fout = null;
        DataOutputStream dout = null;
        
        try {
            f = new  File ("Driver Feedback.bin");
            if (f.exists()){ fout = new FileOutputStream(f,true);}
            else {fout = new FileOutputStream(f);}
            dout = new DataOutputStream(fout);
            dout.writeUTF(feedarea.getText());
            
        }
        catch(IOException e){
             Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                if(dout!= null) {dout.close();}
            } catch (IOException e) {
                Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, e);
            }
           
        }
        Alert a = new  Alert (Alert.AlertType.INFORMATION);
        a.setContentText("Feedback added");
        a.showAndWait();
   feedarea.clear();
        
    }

    @FXML
    private void close(ActionEvent event) throws IOException {
        
         Parent root = FXMLLoader.load(getClass().getResource("Driver.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
}
