package com.Mustafa.Manage;

import com.Mustafa.Game.Game;
import com.Mustafa.Game.Information;

import java.util.List;

public interface ManageGame {
    void addGame(Information information);
    void removeGame(Information information);
    List<Game> getGames();
    void sortGames();
}
