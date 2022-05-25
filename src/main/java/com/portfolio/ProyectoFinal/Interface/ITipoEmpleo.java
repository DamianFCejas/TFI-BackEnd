package com.portfolio.ProyectoFinal.Interface;

import com.portfolio.ProyectoFinal.entity.TipoEmpleo;
import java.util.List;

public interface ITipoEmpleo {
    
    public List<TipoEmpleo> verTipoEmpleo ();
    
    public String crearTipoEmpleo (TipoEmpleo tipoEm);
    
    public String borrarTipoEmpleo (Long idtipoEmpleo);
    
    public TipoEmpleo buscarTipoEmpleo (Long idtipoEmpleo);
    
    public String modifTipoEmpleo (TipoEmpleo tipoEm);
    
}
