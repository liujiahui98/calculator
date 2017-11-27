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


public class TestJiSuan extends Application{
    private TextField tf1=new TextField();
    private Label l1=new Label(" + ");
       private TextField tf2=new TextField();
       private Label l2=new Label(" = ");
       private TextField tf3=new TextField();
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();
        pane.setCenter(getHBox1());
        pane.setBottom(getHBox2());
        Scene scene = new Scene(pane,600,100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("计算器");
        primaryStage.show();
    }
    private HBox getHBox1() {
        HBox hbox1 = new HBox(5);
        hbox1.setPadding(new Insets(12));
        hbox1.setAlignment(Pos.CENTER);
            
        hbox1.getChildren().addAll(tf1,l1,tf2,l2,tf3);
        return hbox1;
    }
    private HBox getHBox2() {
        HBox hbox2 = new HBox(5);
        hbox2.setPadding(new Insets(12));
        hbox2.setAlignment(Pos.CENTER);
        Button bt1=new Button("加");
       bt1.setOnAction(e->{
               double n1=Double.parseDouble(tf1.getText());
               double n2=Double.parseDouble(tf2.getText());
               double temp=n1+n2;
               l1.setText(" + ");
               tf3.setText(""+ temp);
            });
        Button bt2=new Button("减");
        bt2.setOnAction(e->{
               double n1=Double.parseDouble(tf1.getText());
               double n2=Double.parseDouble(tf2.getText());
               double temp=n1-n2;
               l1.setText(" - ");
               tf3.setText(""+ temp);
            });
        Button bt3=new Button("乘");
        bt3.setOnAction(e->{
                double n1=Double.parseDouble(tf1.getText());
               double n2=Double.parseDouble(tf2.getText());
               double temp=n1*n2;
               l1.setText(" * ");
               tf3.setText(""+ temp);
            });
        Button bt4=new Button("除");
         bt4.setOnAction(e->{
                double n1=Double.parseDouble(tf1.getText());
               double n2=Double.parseDouble(tf2.getText());
               double temp=n1/n2;
               l1.setText(" / ");
               tf3.setText(""+ temp);
            });
        hbox2.getChildren().addAll(bt1,bt2,bt3,bt4);
        return hbox2;
    }
    public static void main(String[] a){
        Application.launch(a);
    }
}
