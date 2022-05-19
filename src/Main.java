import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    CreateGroup rootCreate = new CreateGroup();
    Scene createScene = new Scene(rootCreate, 400,400);

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setScene(createScene);
        rootCreate.startCreateGroup();
        primaryStage.show();
    }
}
