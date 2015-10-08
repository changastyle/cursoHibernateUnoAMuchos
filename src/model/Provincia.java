package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="provincia")  
public class Provincia implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="fkPais")
    private int fkPais;
    @Column(name="nombre")
    private String nombre;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getFkPais()
    {
        return fkPais;
    }

    public void setFkPais(int fkPais)
    {
        this.fkPais = fkPais;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    @Override
    public String toString()
    {
        return "Provincia{" + "id=" + id + ", fkPais=" + fkPais + ", nombre=" + nombre + '}';
    }
    
    
}
