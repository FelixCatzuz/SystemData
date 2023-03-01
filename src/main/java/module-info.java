module com.feliscatus909.sysdata {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.feliscatus909.sysdata to javafx.fxml;
    exports com.feliscatus909.sysdata;
}