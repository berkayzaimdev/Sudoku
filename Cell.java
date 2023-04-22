package Sudoku;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;

public class Cell extends Region
{
    private static int[][][] solution = new int[9][3][3];

    public Cell()
    {
        setPrefWidth(50);
        setPrefHeight(50);
        setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
        setStyle("-fx-border-color:black;-fx-border-width:1");
    }
}
