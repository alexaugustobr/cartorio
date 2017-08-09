package vc.com.cartorios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vc.com.cartorios.domain.CartorioEntity;

public interface CartorioRepository extends JpaRepository<CartorioEntity, Long>{

}
