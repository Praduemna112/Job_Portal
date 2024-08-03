package com.app.service;

import java.util.List;

import com.app.entity.Subscription;

public interface SubscriptionService {
    Subscription addSubscription(Subscription subscription);
    List<Subscription> getAllSubscriptions();
    Subscription getSubscriptionById(int id);
}
