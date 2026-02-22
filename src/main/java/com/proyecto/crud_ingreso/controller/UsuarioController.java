package com.proyecto.crud_ingreso.controller;

import com.proyecto.crud_ingreso.model.Usuario;
import java.util.ArrayList;

public class UsuarioController {

    private ArrayList<Usuario> whiteList = new ArrayList<>();

    public UsuarioController() {
        whiteList.add(new Usuario("Erick", "Manzana", 1254));
        whiteList.add(new Usuario("Braulio", "Pera", 7895));
        whiteList.add(new Usuario("Dasha", "Durazno", 185));
        whiteList.add(new Usuario("Fernando", "Banana", 5000));
    }

    public boolean login(String usuario, String password) {
        for (Usuario u : whiteList) {
            if (u.getId().equals(usuario) &&
                    u.getContrasena().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void registrar(String usuario, String password) {
        whiteList.add(new Usuario(usuario, password, 0));
    }
}