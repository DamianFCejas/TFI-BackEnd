package com.portfolio.ProyectoFinal.Interface;

import com.portfolio.ProyectoFinal.entity.Hyss;
import java.util.List;

public interface IHyss {    
    public List<Hyss> verHyss ();
    public Hyss crearHyss (Hyss hardyss);    
    public void borrarHyss (Integer id);    
    public Hyss buscarHyss (Integer id);    
    public void modifHyss (Hyss hardyss);
    
    
}
