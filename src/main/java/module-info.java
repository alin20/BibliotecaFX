module com.example.bibliotecafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.bibliotecafx to javafx.fxml;
    exports com.example.bibliotecafx;
}