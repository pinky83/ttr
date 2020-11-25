package model;

public class Configuration {
    private int FieldWidth;
    private int FieldHeight;
    private int startSpeed;
    private int maxSpeed;
    //score value for levelUp
    private int levelUpStep;
    // 1 - for complex figures like cross or large Z, 2 - for classic mode
    private int gameMode;
    private boolean soundEnabled;
    // should we work with colors for figures?
    private boolean colorsEnabled;

}
