package com.example.efinal1_pa2_p4_af.repository;

import com.example.efinal1_pa2_p4_af.repository.modelo.Doctor;

public interface DoctorRepository {
        public void insertar(Doctor doctor);
        public void eliminar(Integer id);
        public void actualizar(Doctor doctor);
        public Doctor seleccionarPorId(Integer id);
}
