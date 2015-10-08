package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="paises")
public class Pais implements Serializable
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name="nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fkPais", referencedColumnName = "id")
    private List<Provincia> provincias ;

    public Pais()
    {
        provincias = new ArrayList<Provincia>();
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public List<Provincia> getProvincias()
    {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias)
    {
        this.provincias = provincias;
    }
    public void addProvincia(Provincia provincia)
    {
        this.provincias.add(provincia);
    }

    @Override
    public String toString()
    {
        return "Pais{" + "id=" + id + ", nombre=" + nombre + ", provincias=" + provincias + '}';
    }
    
    
    
    
}
