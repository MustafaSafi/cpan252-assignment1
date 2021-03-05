package com.Mustafa.Manage;

import com.Mustafa.Game.Game;
import com.Mustafa.Game.Information;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ApplicationScoped
public class GameService implements  ManageGame{
    private List<Game> games;

    @PostConstruct
    public void defaultGames(){
        games = new ArrayList<>();
        games.add(new Information("Assassins Creed Valhalla", 59.99, 24,"Ubisoft"));
        games.add(new Information("Mario Kart", 19.99, 69,"Nintendo"));
        games.add(new Information("Black ops 1", 79.99, 13,"Treyarch"));
        games.add(new Information("League of Legends", 0.99, 99,"Riot Games"));
    }

    @Override
    public List<Game> getGames() {
        return games;
    }

    @Override
    public void addGame(Information information) {
        games.add(information);
    }

    @Override
    public void removeGame(Information information) {
        for(int i = 0; i < games.size(); i++){
            if(games.get(i).getName().equals(information.getName())){
                games.remove(i);
            }
        }
    }
    @Override
    public void sortGames() {
        Collections.sort(games, new Comparator<Game>() {
            @Override
            public int compare(Game o1, Game o2) {
                return Integer.valueOf(o1.getName().compareTo(o2.getName()));
            }
        });
    }

}
