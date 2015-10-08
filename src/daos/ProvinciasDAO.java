package daos;

import java.util.ArrayList;
import java.util.List;

public class ProvinciasDAO
{
    public static ArrayList<model.Pais> findAllPaises()
    {
        ArrayList<model.Pais> arr = new ArrayList<model.Pais> ();
        List <Object> listaProvisoria = daos.AbstractDAO.findAll(model.Pais.class);
        
        for(Object o : listaProvisoria)
        {
            model.Pais aux = (model.Pais) o ;
            arr.add(aux);
        }
        return arr;
    }
}
