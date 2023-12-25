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
public class ShowprivacyController implements Initializable {

    @FXML
    private TextArea araetext3;
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
    private void close3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("policy.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
    }

    @FXML
    private void load3(ActionEvent event) {
        
        araetext3.setText("");
        File fo = null;
        FileInputStream fis = null;
        DataInputStream dis = null;
        String str="";
        try {
            fo = new File("Show.bin");
            
                
                fis = new FileInputStream(fo);
             
                dis = new DataInputStream(fis);
                
                while(true){
                    str+= dis.readUTF()+"\n";
                        
                   
                }
            
        } catch (IOException ex) {
            araetext3.setText(str);
            Logger.getLogger(ShowprivacyController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException ex) {
                Logger.getLogger(ShowprivacyController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
    }}
