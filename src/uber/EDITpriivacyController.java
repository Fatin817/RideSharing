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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Tamim
 */
public class EDITpriivacyController implements Initializable {

    @FXML
    private TextArea areatext2;
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
    private void close2(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("policy.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void load2(ActionEvent event) {
              areatext2.setText("");
        File fo = null;
        FileInputStream fis = null;
        DataInputStream dis = null;
        String str="";
        try {
            fo = new File("Edit.bin");
            
                
                fis = new FileInputStream(fo);
             
                dis = new DataInputStream(fis);
                
                while(true){
                    str+= dis.readUTF();
                        
                   
                }
            
        } catch (IOException ex) {
            areatext2.setText(str);
            Logger.getLogger(EDITpriivacyController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException ex) {
                Logger.getLogger(EDITpriivacyController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
        
    }
    
}
