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
    public Hyss crearHyss(Hyss hardyss) {
        return hardyssRepo.save(hardyss);
    }

    @Override
    public void borrarHyss(Integer id) {
        hardyssRepo.deleteById(id);
    }

    @Override
    public Hyss buscarHyss(Integer id) {
        return hardyssRepo.findById(id).orElse(null);
    }

    @Override
    public void modifHyss(Hyss hardyss) {
        hardyssRepo.save(hardyss);
    }    
    
}
