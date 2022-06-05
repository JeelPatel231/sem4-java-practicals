package javafx;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class practical19 extends Application 
{
        public void start(Stage primaryStage) 
	{
            	double width = 400;
            	double height = 400;
            	Circle c = new Circle(width / 2, height / 2, Math.min(width, height) / 10, Color.WHITE)
            	c.setStroke(Color.BLACK);
            	StackPane pane = new StackPane(c);
            	primaryStage.setScene(new Scene(pane, width, height));
            	pane.setOnMousePressed(e ->c.setFill(Color.RED));
            	pane.setOnMouseReleased(e -> c.setFill(Color.WHITE));
            	primaryStage.setTitle("Click on the window");
            	primaryStage.show();}
	public static void main(String[] args) {
            Application.launch(args);
  	}