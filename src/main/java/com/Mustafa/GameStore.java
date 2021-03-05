package com.Mustafa;

import com.Mustafa.Game.Game;
import com.Mustafa.Game.Information;
import com.Mustafa.Interceptor.Logged;
import com.Mustafa.Manage.GameService;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import java.util.List;

@Model
public class GameStore {

    private String name;
    private double price;
    private int quantity;
    private String producer;

    @Inject
    private GameService manageGame;

    @Logged
    public void addGameInfo() {
        manageGame.addGame(new Information(name, price, quantity, producer));
    }

    @Logged
    public void removeGame(){
        manageGame.removeGame(new Informgitation(name, price, quantity, producer));
    }
    public void sortGames(){
        manageGame.sortGames();
    }

    public List<Game> getGameList(){
        return manageGame.getGames();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public GameService getManageGame() {
        return manageGame;
    }

    public void setManageGame(GameService manageGame) {
        this.manageGame = manageGame;
    }
}
