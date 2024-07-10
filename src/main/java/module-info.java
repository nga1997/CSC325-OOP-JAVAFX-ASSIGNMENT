module com.example.oopandjavafxassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oopandjavafxassignment to javafx.fxml;
    exports com.example.oopandjavafxassignment;
}