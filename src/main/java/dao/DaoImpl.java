package dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        /*
        Se connecter a la BD pour récuperer la temperature
         */
        double temp = Math.random()*40;
        return temp;
    }
}
