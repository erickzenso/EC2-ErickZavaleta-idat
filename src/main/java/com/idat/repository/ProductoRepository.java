package com.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.model.Producto;
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
