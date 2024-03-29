package ru.academItSchool.gorbunov.Minesweeper.Model.Difficulty;

public class NormDifficulty implements Difficulty {
    private DifficultyName name;
    private int columns;
    private int rows;
    private int mines;

    public NormDifficulty() {
        this.name = DifficultyName.NORM;
        this.columns = 16;
        this.rows = 16;
        this.mines = 1;
    }

    @Override
    public int getColumnsCount() {
        return columns;
    }

    @Override
    public int getLinesCount() {
        return rows;
    }

    @Override
    public int getMines() {
        return mines;
    }

    @Override
    public DifficultyName getName() {
        return this.name;
    }
}
