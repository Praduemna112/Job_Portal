package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Integer>{

	List<Subscription> findAll();

}
