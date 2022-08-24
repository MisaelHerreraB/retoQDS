package pe.com.qds.reto.util;

import pe.com.qds.reto.controllers_exceptions.RequestException;

public class Validate {
    public static  Boolean validateMatrix(int[][] objectValidate){
        if(objectValidate == null || objectValidate.length == 0){
            throw new RequestException("M-001", "Matriz vacía");
        }
        return true;
    }
}
