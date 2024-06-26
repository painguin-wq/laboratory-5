package dev.infochem.application.command;

import dev.infochem.application.database.FileManagerFactory;
import dev.infochem.application.database.FlatManager;
import dev.infochem.application.model.Flat;
import dev.infochem.clilibrary.CommandAction;
import dev.infochem.clilibrary.DefaultCommand;

import java.util.ArrayDeque;

public class InfoCommand extends DefaultCommand {
    @CommandAction
    void getInfo() {
        FlatManager fileManager = FileManagerFactory.create();
        ArrayDeque<Flat> flats = fileManager.getData();
        System.out.println("Тип коллекции - ArrayDeque\n" +
                ("Количество элементов в коллекции - %d\n" +
                        "Дата инициализации - %s").formatted(flats.size(), fileManager.getCreationDate()));
    }

    @Override
    public String getCaption() {
        return null;
    }

    @Override
    public String getMask() {
        return null;
    }
}
