package com.example.salomoncastro.parcial02.VM;

/**
 * Created by Salomon Castro on 6/17/2018.
 */

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

import jossehblanco.com.gamenews3.API.GameNewsRepo;
import jossehblanco.com.gamenews3.models.Player;



public class PlayerVM extends AndroidViewModel {

    private GameNewsRepo usuarioRepositori;

    public PlayerVM(@NonNull Application application) {

        super(application);
        usuarioRepositori = new GameNewsRepo(application);
    }




    public LiveData<List<Player>> getPlayerByGame(String game){

        return usuarioRepositori.getPlayersByGame(game);

    }

    public void updatePlayerDB(String token, String game){

        usuarioRepositori.getAllPlayersAndInsert(token, game);

    }

    public void deleteAll(){
        usuarioRepositori.deletePlayers();
    }

}