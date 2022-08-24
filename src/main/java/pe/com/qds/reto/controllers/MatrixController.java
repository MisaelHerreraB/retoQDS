package pe.com.qds.reto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.com.qds.reto.beans.Matrix;
import pe.com.qds.reto.services.MatrixService;

import java.io.IOException;

@RestController
@RequestMapping("/matrix")
public class MatrixController {

    @Autowired
    MatrixService matrixService;

    @RequestMapping(value="/rotate90", method = RequestMethod.POST)
    public Matrix rotate90Matrix(@RequestBody Matrix request) {
        return this.matrixService.rotate90(request);
    }
}
