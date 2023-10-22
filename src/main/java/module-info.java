module com.example.javafxuts {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.javafxuts to javafx.fxml;
    exports com.example.javafxuts;
}