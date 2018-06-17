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
import jossehblanco.com.gamenews3.models.New;



public class NewVM extends AndroidViewModel {

    private GameNewsRepo usuarioRepositori;

    public LiveData<List<New>> getAllnoticias(String token) {

        return usuarioRepositori.getAllNewsAndInsert(token);

    }

    public void setFavoritos(String token,String userId,String noticiaId,String favs){

        usuarioRepositori.setFavoritos(token,userId,noticiaId,favs);

    }

    public LiveData<New> getNewDetail(String token,String idNoticia){

        return usuarioRepositori.getNewDetailDB(token, idNoticia);

    }

    public LiveData<List<New>> getNewByGameDB(String game){

        return usuarioRepositori.getNewByGameFromDB(game);

    }

    public void deleteAll(){
        usuarioRepositori.deleteAllNoticias();
    }


    public NewVM(@NonNull Application application) {

        super(application);
        usuarioRepositori = new GameNewsRepo(application);
    }


}
