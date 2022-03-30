module com.example.roosteropt {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.roosteropt to javafx.fxml;
    exports com.example.roosteropt;
    exports com.example.roosteropt.creator;
    opens com.example.roosteropt.creator to javafx.fxml;
}