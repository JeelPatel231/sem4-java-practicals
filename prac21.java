import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

class Fraction {
   private int real;
   private int imaginary;

   Fraction(int r, int img) {
     real = r;
     imaginary = img;
   }

   public long gcm(long a, long b) {
     return b == 0 ? a : gcm(b, a % b);
   }

   public String toString() {
     long gcm = gcm(real, imaginary);
     return real / gcm + "/" + imaginary / gcm;
   }
}

public class App extends Application {

   double number1 = 0;

   @Override
   public void start(Stage primaryStage) throws Exception {

     HBox numberPane = new HBox();
     numberPane.setSpacing(10);
     numberPane.setAlignment(Pos.CENTER);

     Label lblNumber = new Label("Decimal Number:");
     TextField tfNumber = new TextField();

     Label lblResult = new Label("Fraction Number :");
     TextField tfResult = new TextField();

     numberPane.getChildren().addAll(
         lblNumber, tfNumber,
         lblResult, tfResult);

     Button btGO = new Button("GO");
     btGO.setOnAction(e -> {
       String decimal = tfNumber.getText();
       int indextOfDecimal = decimal.indexOf(".");
       int len = decimal.substring(indextOfDecimal).length();
       int imag_part = (int) Math.pow(10, len - 1);
       int real_part = (int) 
                         (Double.parseDouble(tfNumber.getText()) * imag_part);

       Fraction fr=new Fraction(real_part,imag_part);
       tfResult.setText(fr + "");
     });

     HBox operatorsPane = new HBox();
     operatorsPane.setSpacing(10);
     operatorsPane.setAlignment(Pos.CENTER);
     operatorsPane.getChildren().addAll(btGO);

     BorderPane borderPane = new BorderPane(numberPane);
     BorderPane.setMargin(numberPane, new Insets(10, 10, 10, 10));

     borderPane.setBottom(operatorsPane);
     BorderPane.setMargin(operatorsPane, new Insets(10, 10, 10, 10));
     primaryStage.setScene(new Scene(borderPane, 
                      borderPane.getPrefWidth(), borderPane.getPrefWidth()));
     primaryStage.setTitle("Simple calculator");
     primaryStage.show();
   }

   public static void main(String[] args) {
     Application.launch(args);
   }
}
