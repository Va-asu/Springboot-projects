package com.example.bootJPA.Repository;

import com.example.bootJPA.Model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlienRepository extends JpaRepository<Alien,Integer> {

}
