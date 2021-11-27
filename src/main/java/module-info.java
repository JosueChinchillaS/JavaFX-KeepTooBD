module com.example.examplekeeptoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.examplekeeptoo to javafx.fxml;
    exports com.example.examplekeeptoo;
}