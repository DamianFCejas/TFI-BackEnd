package com.portfolio.ProyectoFinal.service;

import com.portfolio.ProyectoFinal.Interface.ITipoEmpleo;
import com.portfolio.ProyectoFinal.entity.TipoEmpleo;
import com.portfolio.ProyectoFinal.repository.TipoEmpleoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEmpleoService implements ITipoEmpleo{
    
    @Autowired
    public TipoEmpleoRepository tipoEmRepo;

    @Override
    public List<TipoEmpleo> verTipoEmpleo() {
        return tipoEmRepo.findAll();
    }

    @Override
    public String crearTipoEmpleo(TipoEmpleo tipoEm) {
        tipoEmRepo.save(tipoEm);
        return "El tipo de empleo fue creado con éxito!";
    }

    @Override
    public String borrarTipoEmpleo(Long idtipoEmpleo) {
        tipoEmRepo.deleteById(idtipoEmpleo);
        return "El tipo de empleo fue eliminado con éxito!";
        
    }

    @Override
    public TipoEmpleo buscarTipoEmpleo(Long idtipoEmpleo) {
        return tipoEmRepo.findById(idtipoEmpleo).orElse(null);
    }

    @Override
    public String modifTipoEmpleo(TipoEmpleo tipoEm) {
        tipoEmRepo.save(tipoEm);
        return "El tipo de empleo fue modificado con éxito!";
        
    }
    
}
