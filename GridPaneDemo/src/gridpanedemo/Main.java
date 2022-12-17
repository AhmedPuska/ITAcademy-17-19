package gridpanedemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }    

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        GridPane grid = new GridPane();
        
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        
        Label userName = new Label("User Name:");
        userName.setLabelFor(userTextField);
        grid.add(userName, 0, 1);
        
        PasswordField pwBox = new PasswordField();
        
        Label pw = new Label("Password:");
        pw.setLabelFor(pwBox);
        
        grid.addRow(2, pw, pwBox);
        
        Button btn = new Button("Sign in");
        GridPane.setHalignment(btn, HPos.RIGHT);
        grid.add(btn, 1, 4);
        
        Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
//        grid.setGridLinesVisible(true);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
            }
        });
        
        Scene scene = new Scene(grid, 300, 276);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}