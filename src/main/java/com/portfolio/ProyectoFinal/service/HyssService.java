package com.portfolio.ProyectoFinal.service;

import com.portfolio.ProyectoFinal.Interface.IHyss;
import com.portfolio.ProyectoFinal.entity.Hyss;
import com.portfolio.ProyectoFinal.repository.HyssRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HyssService implements IHyss {
    
    @Autowired
    public HyssRepository hardyssRepo;

    @Override
    public List<Hyss> verHyss() {
        return hardyssRepo.findAll();
    }

    @Override
    public String crearHyss(Hyss hardyss) {
        hardyssRepo.save(hardyss);
        return "La habilidad fue creada con éxito!";
    }

    @Override
    public String borrarHyss(Long idhyss) {
        hardyssRepo.deleteById(idhyss);
        return "La habilidad fue eliminada con éxito!";
    }

    @Override
    public Hyss buscarHyss(Long idhyss) {
        return hardyssRepo.findById(idhyss).orElse(null);
        
    }

    @Override
    public String modifHyss(Hyss hardyss) {
        hardyssRepo.save(hardyss);
        return "La habilidad fue modificada con éxito!";
    }
    
}
