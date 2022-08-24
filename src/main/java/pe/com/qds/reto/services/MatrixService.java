package pe.com.qds.reto.services;

import org.springframework.stereotype.Service;
import pe.com.qds.reto.beans.Matrix;
import pe.com.qds.reto.util.Validate;

import java.io.IOException;
import java.util.Objects;

@Service
public class MatrixService {

    public Matrix rotate90(Matrix request) {

        Matrix response = new Matrix();
        if(Validate.validateMatrix(request.getContent())){
            int length = request.getContent().length;
            int[][] matrix = request.getContent();
            int[][] newMatrix = new int[length][length];
            for (int x = 0; x < length; x++) {
                for (int y = 0; y < length; y++) {
                    newMatrix[length - 1 - y][x] = matrix[x][y];
                }
            }
            response.setContent(newMatrix);
        }
        return response;
    }
}
