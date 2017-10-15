package com.grisel.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.grisel.entity.Item;

@RepositoryRestResource
public interface ItemRepository extends PagingAndSortingRepository<Item, String> {

}
