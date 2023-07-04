package com.example.efinal1_pa2_p4_af.service;

import com.example.efinal1_pa2_p4_af.repository.modelo.Doctor;

public interface DoctorService {
    public void agregar(Doctor doctor);
    public void eliminar(Integer id);
    public void actualizar(Doctor doctor);
    public Doctor buscarPorId(Integer id);
}
