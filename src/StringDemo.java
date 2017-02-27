import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

/**
 * Created by tkanchanawanchai6403 on 2/20/2017.
 *
 * Shows and Demonstrates how to use printf
 */
public class StringDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setTitle("Options");
        inputDialog.setHeaderText("Select an option");
        inputDialog.setContentText("option 1 or option 2");
        inputDialog.showAndWait();

        String optionString ="";
        //getResult to read input from Javafx input dialog
        optionString = inputDialog.getResult();
        int option = Integer.parseInt(optionString);

        /*
        if true println else printf
        option 1 is for println
        option 2 is for printf
         */
        if (option==1) {
            System.out.println("Option 1 is selected");
        } else {
            System.out.printf("option %5s%d%-5c%1.4e is selected"," ",2,'X',12345.67890);
        }
    }

    public static void main(String [] args) {
        launch(args);
    }


}
