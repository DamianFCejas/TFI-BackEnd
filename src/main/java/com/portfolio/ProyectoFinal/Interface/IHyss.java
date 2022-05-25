package com.portfolio.ProyectoFinal.Interface;

import com.portfolio.ProyectoFinal.entity.Hyss;
import java.util.List;

public interface IHyss {
    
    public List<Hyss> verHyss ();
    
    public String crearHyss (Hyss hardyss);
    
    public String borrarHyss (Long idhyss);
    
    public Hyss buscarHyss (Long idhyss);
    
    public String modifHyss (Hyss hardyss);
    
    
}
