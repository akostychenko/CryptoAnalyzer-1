package ru.javarush.khmelov.cryptoanalyzer;

import ru.javarush.khmelov.cryptoanalyzer.controller.MainController;
import ru.javarush.khmelov.cryptoanalyzer.view.swing.MainForm;

public class SwingRunner {
    public static void main(String[] args) {
        //build swing app
        MainController controller = new MainController();
        MainForm mainForm = new MainForm(controller);

        //run swing app
        mainForm.initialization();
    }
}
