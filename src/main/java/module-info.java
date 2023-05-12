module com.example.thewheeldealplace {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.thewheeldealplace to javafx.fxml;
    exports com.example.thewheeldealplace;
}