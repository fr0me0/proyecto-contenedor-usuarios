package org.frandevs.jdbc.proyectocontenedor.repositorio;

import org.frandevs.jdbc.proyectocontenedor.modelo.Usuario;

import java.util.List;

import java.util.List;

public interface Repositorio<T> {
    List<T> listar();

    T porId(Long id);

    void guardar(T t);

    void eliminar(Long id);
}
