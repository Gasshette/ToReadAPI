package com.grisel.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.grisel.entity.Item;

@Repository
public interface ItemRepository extends PagingAndSortingRepository<Item, String> {

}
