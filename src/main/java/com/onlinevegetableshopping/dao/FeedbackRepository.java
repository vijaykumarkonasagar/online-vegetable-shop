package com.onlinevegetableshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinevegetableshopping.model.FeedBack;

@Repository
public interface FeedbackRepository  extends JpaRepository<FeedBack, Integer>{

}
