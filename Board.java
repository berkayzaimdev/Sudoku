package Sudoku;

import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Board extends GridPane
{
    public Board()
    {
        int row=0,col=0;
        for (int i = 0; i < 9; i++)
        {
            if(i%3==0)
            {
                col = 0;
                row++;
            }
            GridPane matrix = new GridPane();
            matrix.setStyle("-fx-border-color:black;-fx-border-width:2");
            for(int j=0;j<3;j++)
            {
                for (int k = 0; k < 3; k++)
                {
                    Cell cell = new Cell();
                    matrix.add(cell, k, j);
                }
            }
            add(matrix,col++,row);
        }
    }
}