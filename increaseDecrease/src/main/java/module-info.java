module com.mycompany.increasedecrease {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.increasedecrease to javafx.fxml;
    exports com.mycompany.increasedecrease;
}
