package com.parent.child.repository;

import com.parent.child.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent,Integer> {

}
