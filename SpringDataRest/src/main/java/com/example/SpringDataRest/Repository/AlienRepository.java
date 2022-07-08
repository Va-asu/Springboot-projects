package com.example.SpringDataRest.Repository;

import com.example.SpringDataRest.Model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(collectionResourceRel="aliens",path="aliens")
public interface AlienRepository extends JpaRepository<Alien,Integer> {

}
