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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Tamim
 */
public class ManegerController implements Initializable {
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
    private void REvenuePieChart(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("revenuepiechart.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void statchart(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Statementlinechart.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void policyANDprivacy(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("policy.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
}
