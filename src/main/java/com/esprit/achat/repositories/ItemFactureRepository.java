package com.esprit.achat.repositories;

import com.esprit.achat.persistence.entity.ItemFacture;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemFactureRepository extends CrudRepository<ItemFacture, Integer>{
}

