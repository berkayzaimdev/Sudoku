package Sudoku;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game extends Application
{
    @Override
    public void start(Stage myStage)
    {
        myStage.setTitle("Sudoku");
        myStage.setScene(new Scene(new Board()));
        myStage.setResizable(false);
        myStage.show();
    }
}
