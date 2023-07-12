module com.example.check2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.check2 to javafx.fxml;
    exports com.example.check2;
}