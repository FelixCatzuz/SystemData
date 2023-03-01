package com.feliscatus909.sysdata;

import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class AppController {

    @FXML
    private Button button_check;

    @FXML
    private Label label_imei;

    @FXML
    private Label label_name;

    @FXML
    private Label label_processor;

    @FXML
    private Label label_ram;

    @FXML
    private Label label_sys;

    @FXML
    private Label label_type;

    @FXML
    private Pane pane;

    @FXML
    private TextField textField_imei;

    @FXML
    private TextField textField_name;

    @FXML
    private TextField textField_processor;

    @FXML
    private TextField textField_ram;

    @FXML
    private TextField textField_sys;

    @FXML
    private TextField textField_type;

    @FXML
    void initialize() {
      /* pane = new Pane();
       button_check = new Button();
       label_sys = new Label();
       label_type = new Label();
       label_processor = new Label();
       label_ram = new Label();
       label_imei = new Label();
       label_name = new Label();
       textField_sys = new TextField();
       textField_type = new TextField();
       textField_processor = new TextField();
       textField_imei = new TextField();
       textField_name = new TextField(); */

       button_check.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               if (event.getSource() == button_check){
                       Properties properties = System.getProperties();
                       String windowsVersion = properties.getProperty("os.version");
                       String systemType = properties.getProperty("os.arch");
                       String processorVersion = properties.getProperty("os.processor");
                       String ramVersion = properties.getProperty("os.memory");
                       String deviceCode = properties.getProperty("os.manufacturer");
                       String deviceName = properties.getProperty("os.name");

                       textField_sys.setText(windowsVersion);
                       textField_type.setText(systemType);
                       textField_processor.setText(processorVersion);
                       textField_ram.setText(ramVersion);
                       textField_imei.setText(deviceCode);
                       textField_name.setText(deviceName);
                   }

               }

       });

    }

}