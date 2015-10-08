package cursohibernatemuchosauno;

import model.Pais;
import model.Provincia;

public class CursoHibernateMuchosAUno
{
    public static void main(String[] args)
    {
        Provincia provincia = new Provincia();
        provincia.setNombre("Rio Negro");
        
        Provincia provincia2 = new Provincia();
        provincia2.setNombre("NQN");
        
        Pais argentina = new Pais();
        argentina.setNombre("Argentina");
        argentina.addProvincia(provincia);
        argentina.addProvincia(provincia2);
        
        daos.AbstractDAO.persist(argentina);
        
        for(Pais p : daos.ProvinciasDAO.findAllPaises())
        {
            System.out.println(p.toString());
        }
    }
    
}
