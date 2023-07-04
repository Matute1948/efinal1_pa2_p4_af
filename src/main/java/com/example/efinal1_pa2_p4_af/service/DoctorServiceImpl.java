package com.example.efinal1_pa2_p4_af.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.efinal1_pa2_p4_af.repository.DoctorRepository;
import com.example.efinal1_pa2_p4_af.repository.modelo.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService{
    @Autowired
    private DoctorRepository doctorRepository;
    @Override
    public void agregar(Doctor doctor) {
        this.doctorRepository.insertar(doctor);
    }

    @Override
    public void eliminar(Integer id) {
        this.doctorRepository.eliminar(id);
    }

    @Override
    public void actualizar(Doctor doctor) {
        this.doctorRepository.actualizar(doctor);
    }

    @Override
    public Doctor buscarPorId(Integer id) {
        return this.buscarPorId(id);
    }
    
}
