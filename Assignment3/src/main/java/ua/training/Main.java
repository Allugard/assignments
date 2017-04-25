package main.java.ua.training;


import main.java.ua.training.controller.Controller;
import main.java.ua.training.model.Model;
import main.java.ua.training.model.entity.Note;
import main.java.ua.training.util.GlovalValues;
import main.java.ua.training.view.View;

/**
 * Created by allugard on 16.04.17.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
