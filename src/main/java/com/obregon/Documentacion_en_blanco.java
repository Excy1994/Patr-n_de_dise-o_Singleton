package com.obregon;

import java.util.ArrayList;

public class Documentacion_en_blanco {

    private static Documentacion_en_blanco _instance = null;

    private <Documento> Documentacion_en_blanco()

    {
        ArrayList<Documento> documentos = new ArrayList<Documento>();
    }

    public static Documentacion_en_blanco Instance()
    {
        if (_instance == null)
            _instance = new Documentacion_en_blanco();
        return _instance;
    }
}